package Cuadrado;

public class Cuadrado {
    private   int tamanoLado;
    
    public Cuadrado (int size) {           
            tamanoLado = size;
    }       
public void Drawsquare (){
    System.out.println("Creando un cuadrado" + tamanoLado);
    
    for(int i=0 ; i<tamanoLado;i++){
        if (i==0 || i ==tamanoLado-1){
            imprimirLineaCompleta(tamanoLado);
            
        }
        else{
            imprimirLineaVacia(tamanoLado);
        }
        System.out.println("\n");
    }
}

public static void imprimirLineaCompleta(int lado){
    for (int j=0; j<lado;j++){
        System.out.println("*");
    }
}

public static void imprimirLineaVacia(int lado){
    System.out.print("*");
    for(int j=0; j<lado-2;j++){
        System.out.print(" ");
        
    }
    System.out.print("*");
}

 
    }

      
