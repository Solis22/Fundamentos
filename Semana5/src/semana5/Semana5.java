
package semana5;

import javax.swing.JOptionPane;



public class Semana5 {

    
    public static void main(String[] args){
        int aleatorio =(int)(Math.random()*100);
        int numero=0;
        int intentos=0;
do{
            intentos++;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Número"));
 
            if(aleatorio<numero){
JOptionPane.showMessageDialog(null, "Ingrese Número mas bajo");
 
            }else if(aleatorio>numero){
                JOptionPane.showMessageDialog(null, "Ingrese Número mas alto");
 
            }
 
}while(numero!=aleatorio);
JOptionPane.showMessageDialog(null, "Muy Bien Conseguiste Adivinar el Número en " + intentos + " intentos");
 
        
        
   
    }
    
}