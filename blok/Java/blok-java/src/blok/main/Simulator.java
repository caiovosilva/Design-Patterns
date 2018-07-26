/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import blok.main.MainPanel;
import interfaces.ICore;
import interfaces.IGameBody;
import interfaces.IGameController;
import interfaces.ISimulator;
import interfaces.IUIController;
import blok.utilities.GameBody;
import blok.utilities.GameBody;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jbox2d.callbacks.ContactImpulse;
import org.jbox2d.callbacks.ContactListener;
import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.*;
import org.jbox2d.dynamics.contacts.Contact;

/**
 *
 * @author sandroandrade
 */
public class Simulator implements Runnable, ContactListener, ISimulator {
    
    public Simulator(ICore core){
        m_core = core;
    }
    @Override
    public void start() {
        m_schedulerHandle = m_scheduler.scheduleAtFixedRate(this, 0, 3, TimeUnit.MILLISECONDS);
    }

    @Override
    public void stop() {
        m_schedulerHandle.cancel(true);
    }

    @Override
    public void run() {
        m_world.step(B2_TIMESTEP, B2_VELOCITY_ITERATIONS, B2_POSITION_ITERATIONS);
        m_core.getUIController().bodiesUpdated(m_gameBodies);
    }

    @Override
    public void init() {
        m_world = new World(new Vec2(0, -10f), true);
        m_world.setContactListener(this);
        m_bodies.clear();
        m_gameBodies.clear();
        
        // Ground
        m_ground = createBody(0.0f, -260.0f, 900.0f, 20.0f, false, 1.0f, 0.3f, 0.5f);
        
        // Blocks
        int i = 0, j = 0;
        for (i = 0; i < 10; ++i)
            for (j = 0; j < 11 - i; ++j){
                Body lBody = createBody(-150.0f+15*i+30*j, -236.0f+30*i, 28.0f, 28.0f, true, 1.0f, 0.3f, 0.5f);
                m_bodies.add(lBody);
                m_gameBodies.add(new GameBody(new Rectangle((int)lBody.getPosition().x, (int)lBody.getPosition().y, 28, 28), GameBody.Type.BLOCK));
            }

        // Player
        j-=2;
        m_bodies.add(m_player = createBody(-150.0f+15*i+30*j, -236.0f+30*i+14, 56.0f, 56.0f, true, 1.0f, 0.3f, 0.5f));
        m_player.setUserData("player");
        m_gameBodies.add(new GameBody(new Rectangle((int)-150.0f+15*i+30*j, (int)-236.0f+30*i+14, 56, 56), GameBody.Type.PLAYER));

        m_core.getUIController().bodiesCreated(m_gameBodies);
    }

    private Body createBody(float x, float y, float width, float height, boolean dynamic, float density, float friction, float restitution) {
        BodyDef bodyDef = new BodyDef();
        if (dynamic)
            bodyDef.type = BodyType.DYNAMIC;
        bodyDef.position.set(x, y);
        Body body = m_world.createBody(bodyDef);
        PolygonShape box = new PolygonShape();
        box.setAsBox(width/2, height/2);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = box;
        fixtureDef.density = density;
        fixtureDef.friction = friction;
        fixtureDef.restitution = restitution;
        body.createFixture(fixtureDef);
        body.setSleepingAllowed(true);
        
        return body;
    }

    @Override
    public void beginContact(Contact contact) {
        if ((contact.getFixtureA().getBody() == m_ground && contact.getFixtureB().getBody() == m_player) ||
            (contact.getFixtureB().getBody() == m_ground && contact.getFixtureA().getBody() == m_player))
        {
            stop();
            m_core.getGameController().setState(IGameController.State.YOULOST);
        }
    }

    @Override
    public void removeBody(int bodyIndex) {
        Body lBody = m_bodies.get(bodyIndex);
        m_world.destroyBody(lBody);
        m_bodies.remove(lBody);
        m_gameBodies.remove(m_gameBodies.get(bodyIndex));
        if (m_bodies.size() == 2)
        {
            stop();
            m_core.getGameController().setState(IGameController.State.YOUWON);
        }
    }
    
    @Override
    public void endContact(Contact cntct) {
    }

    @Override
    public void preSolve(Contact cntct, Manifold mnfld) {
    }

    @Override
    public void postSolve(Contact cntct, ContactImpulse ci) {
    }

    private static float PI = 3.14159265359f;
    private static float B2_TIMESTEP = 1.0f / 30.0f;
    private static int B2_VELOCITY_ITERATIONS = 8;
    private static int B2_POSITION_ITERATIONS = 4;

    private ICore m_core;
    
    private final ScheduledExecutorService m_scheduler = Executors.newScheduledThreadPool(1);
    private ScheduledFuture<?> m_schedulerHandle = null;
            
    private static World m_world;
    private ArrayList<Body> m_bodies = new ArrayList<Body>();
    private ArrayList<IGameBody> m_gameBodies = new ArrayList<IGameBody>();
    private Body m_player = null;
    private Body m_ground = null; 
}
