/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.main;

import interfaces.ICore;
import interfaces.IGameBody;
import interfaces.IGameController;
import interfaces.ISimulator;
import concreteclasses.GameBody;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author sandroandrade
 */
public class MainPanel extends javax.swing.JPanel implements MouseListener, KeyListener {

    /**
     * Creates new form MainPanel
     */
    public MainPanel(ICore core) {
        m_core = core;
        initComponents();
        setFocusable(true);
        addMouseListener(this);
        addKeyListener(this);
        m_playerImage = "images/player" + Math.abs((new Random()).nextInt()%9) + ".png";
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        IGameBody toBeRemoved = null;
        int indexCount = 0;
        for (IGameBody body : m_linkedBodies.keySet()) {
            java.awt.Rectangle rect = m_linkedBodies.get(body);
            indexCount++;
            if (rect.contains(e.getPoint()) && m_core.getGameController().getState() == IGameController.State.RUNNING && rect != m_player) {
                m_core.getSimulator().removeBody(indexCount);
                toBeRemoved = body;
                break;
            }
        }
        if (toBeRemoved != null)
            m_linkedBodies.remove(toBeRemoved);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(m_core.getGameController().getState()) {
            case INITIAL:
                m_core.getGameController().setState(IGameController.State.RUNNING);
                break;
            case YOUWON:
            case YOULOST:
                m_core.getGameController().setState(IGameController.State.INITIAL);
                break;
        }
    }
    
    public void bodiesUpdated(ArrayList<IGameBody> bodies) {
        Dimension size = getSize();
        bodies.forEach((body) -> {
            if (body.getType() == GameBody.Type.PLAYER)
                // Player
                m_linkedBodies.get(body).setLocation(size.width/2-28 + (int) body.getRectangle().x, size.height/2-28 - (int) body.getRectangle().y);
            else
                // Block
                m_linkedBodies.get(body).setLocation(size.width/2-14 + (int) body.getRectangle().x, size.height/2-14 - (int) body.getRectangle().y);
        });
        repaint();
    }

    public void bodiesCreated(ArrayList<IGameBody> bodies) {
        //m_bodyRect.clear();
        m_linkedBodies.clear();
        Dimension size = getSize();
        bodies.forEach((body) -> {
            Rectangle rectangle = new Rectangle();
            if (body.getType() == GameBody.Type.PLAYER)
            {
                // Player
                rectangle.setRect(-28, -28, 56, 56);
                rectangle.setLocation(size.width/2-28 + (int) body.getRectangle().x, size.height/2-28 - (int) body.getRectangle().y);
                m_player = rectangle;
            }
            else
            {
                // Block
                rectangle.setRect(-14, -14, 28, 28);
                rectangle.setLocation(size.width/2-14 + (int) body.getRectangle().x, size.height/2-14 - (int) body.getRectangle().y);
            }
            //m_bodyRect.put(body, rectangle);
            m_linkedBodies.put(body, rectangle);
        });
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Dimension size = getSize();      
        g2d.drawImage(m_core.getPluginController().getCurrentTheme().createBackground().getImage(), 0, 0, null);
        g2d.drawImage(m_core.getPluginController().getCurrentTheme().createFloor().getImage(), size.width/2-450, size.height/2-10+260, null);
        for (Rectangle rect : m_linkedBodies.values()) {
            if (rect != m_player) {
                // Block
                TexturePaint texturePaint;
                texturePaint = new TexturePaint(m_core.getPluginController().getCurrentTheme().createBrick().getImage(), rect);
                g2d.setPaint(texturePaint);
            }
            else {
                // Player
                try {
                    TexturePaint texturePaint = new TexturePaint(ImageIO.read(new File(m_playerImage)), rect);
                    g2d.setPaint(texturePaint);
                } catch (IOException ex) {
                    Logger.getLogger(ISimulator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            g2d.fill(rect);
        }

        int x;
        FontMetrics fm = null;
        if (m_core.getGameController().getState() != IGameController.State.RUNNING)
        {
            g2d.setPaint(Color.black);
            g2d.setStroke(new BasicStroke(2));
            g2d.drawRect(size.width/2-250, size.height/2-200-50, 500, 100);
            g2d.setPaint(new Color(0xDF, 0xC1, 0x01));
            g2d.fillRect(size.width/2-250, size.height/2-200-50, 500, 100);

            g2d.setPaint(Color.black);
            g2d.setFont(new Font("Times", Font.BOLD, 18));
            fm = g2d.getFontMetrics();
        }
        if (m_core.getGameController().getState() == IGameController.State.INITIAL)
        {
            x = (int) fm.stringWidth("Remove all the blocks but do not")/2;
            g2d.drawString("Remove all the blocks but do not", size.width/2-x, size.height/2-200-10-5);

            x = fm.stringWidth("let this guy hit the ground, okay ?")/2;
            g2d.drawString("let this guy hit the ground, okay ?", size.width/2-x, size.height/2-200+10-5);
        }
        if (m_core.getGameController().getState() == IGameController.State.YOUWON)
        {
            x = (int) fm.stringWidth("Congratulations ! You won !")/2;
            g2d.drawString("Congratulations ! You won !", size.width/2-x, size.height/2-200);
        }
        if (m_core.getGameController().getState() == IGameController.State.YOULOST)
        {
            x = (int) fm.stringWidth("I'm sorry ! You lost !")/2;
            g2d.drawString("I'm sorry ! You lost !", size.width/2-x, size.height/2-200);
        }
        if (m_core.getGameController().getState() == IGameController.State.RUNNING)
        {
            g2d.setFont(new Font("Times", Font.BOLD, 10));
            fm = g2d.getFontMetrics();
            x = fm.stringWidth("Press any key to start")/2;
            g2d.drawString("Press any key to start", size.width/2-x, size.height/2-200+30);
        }
    }
    
    public void setPlayerImage(String str){
        m_playerImage = str;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    //private HashMap<GameBody, Rectangle> m_bodyRect = new HashMap<GameBody, Rectangle>();
    private LinkedHashMap<IGameBody, Rectangle> m_linkedBodies = new LinkedHashMap<IGameBody, Rectangle>();

    private Rectangle m_player;
    //public enum State {INITIAL, RUNNING, YOUWON, YOULOST};
    //private State m_state = State.INITIAL;
    private String m_playerImage;
    private ICore m_core;
    
}
