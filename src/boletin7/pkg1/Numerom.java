package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Numerom {
   static public int pedirNumeroPositivo(){
   int numero;
   String res = JOptionPane.showInputDialog("Teclea el Numero :");
   numero=Integer.parseInt(res);
   return numero;
}
   static public void numeropositivo (int num1){
           if (num1>0)
           System.out.println("É positivo");
           else if (0>=num1)
           System.out.println("O numero debe ser positivo");
}
}
