/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Clase principal
 * @author poo03alu10
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de hilos mediante la clase Thread
        //Crear Hilo 1
        Hilo h1 = new Hilo("Hilo 1");
        //Crear Hilo 2
        Hilo h2 = new Hilo("Hilo 2");
        //Crear Hilo 3
        Hilo h3 = new Hilo("Hilo 3");
        //Iniciar Hilo 1
        h1.start();
        //Iniciar Hilo 2
        h2.start();
        //Iniciar Hilo 3
        h3.start();
        
        //Iniciar un hilo sin crearlo
        new Hilo("Hilo 4").start();
        //Iniciar un hilo sin crearlo
        new Hilo("Hilo 5").start();
        
        //Creación de hilos mediante implementación de Runnable
        //Iniciar un hilo runnable sin crearlo
        new Thread(new HiloR(),"HiloR 1").start();
        //Iniciar un hilo runnable sin crearlo
        new Thread(new HiloR(),"HiloR 2").start();
        //Iniciar un hilo runnable sin crearlo
        new Thread(new HiloR(),"HiloR 3").start();
        
        //### Prioridad de hilos ###
        //Crear un hilo
        Hilo hp1 = new Hilo("Hilo de prioridad 1");
        //Asignarle la prioridad minima (1)
        hp1.setPriority(1);
        
        //Crear un hilo
        Hilo hp10 = new Hilo("Hilo de prioridad 10");
        //Asignarle la prioridad maxima (10)
        hp10.setPriority(10);
        
        //Iniciar ambos hilos
        hp1.start(); //El hilo de prioridad minima inicia despues del resto
        hp10.start(); //El hilo de prioridad maxima inicia antes que el resto
    }
    
}
