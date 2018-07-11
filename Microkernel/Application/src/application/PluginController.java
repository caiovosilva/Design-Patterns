package application;

import interfaces.IPluginController;
import interfaces.ICore;

public class PluginController implements IPluginController {
    private ICore core;
    
    public PluginController(ICore core){
        this.core = core;
    }
    
    public boolean applyPlugin(){
        ////  TO DO: applyPlugin
        return true;
    }
}

/*
 public static void main(String []args) throws Exception // 4o estagio
  {
    int op;
	do
    {
		File currentDir = new File("./plugins");
		String []plugins = currentDir.list();
		int i;
		URL[] jars = new URL[plugins.length];
		for (i = 0; i < plugins.length; i++)
		{
			System.out.println(i+1 + " - " + plugins[i].split("\\.")[0]);
			jars[i] = (new File("./plugins/" + plugins[i])).toURL();
		}
		URLClassLoader ulc = new URLClassLoader(jars);
		System.out.println(i+1 + " - Plugin refresh");
		System.out.println("Escolha sua opção ou 0 para sair: ");
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
		if (op != 0 && op != i+1)
		{
			String factoryName = plugins[op-1].split("\\.")[0];
			AbstractFactory factory = (AbstractFactory) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
			createProducts(factory);
		}
    } while (op != 0);
  }
*/