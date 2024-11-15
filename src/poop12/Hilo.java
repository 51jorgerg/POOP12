/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase hilo con usando la clase thread
 * @author poo03alu10
 */
public class Hilo extends Thread{

    /**
     * Constructor lleno
     * @param name 
     */
    public Hilo(String name) {
        super(name);
    }

    /**
     * Metodo que inicia el Hilo
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: " + i + " Hilo: " + getName());
        }
        System.out.println ("Termina " + getName());
    }
    
}
