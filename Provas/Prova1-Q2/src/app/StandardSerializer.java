/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.ISerializer;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author caiovosilva
 */
public class StandardSerializer implements ISerializer{
    
    @Override
    public void serialize(){
        // Cria o objeto serializado
 
    Car cliente = new Car("Uno");
 
    try
 
    {
 
      //Gera o arquivo para armazenar o objeto
 
      FileOutputStream arquivoGrav =
 
      new FileOutputStream("/home/caiovosilva/Desktop/saida.dat");
 
      //Classe responsavel por inserir os objetos
 
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
 
      //Grava o objeto cliente no arquivo
 
      objGravar.writeObject(cliente);
 
      objGravar.flush();
 
      objGravar.close();
 
      arquivoGrav.flush();
 
      arquivoGrav.close();
 
      System.out.println("Objeto gravado com sucesso!");
 
    }
 
    catch(Exception e) {
 
      e.printStackTrace();
 
    }
    }
}
