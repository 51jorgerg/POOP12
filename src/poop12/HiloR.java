/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase hilo con la interfaz runnable
 * @author poo03alu10
 */
public class HiloR implements Runnable{
    /**
     * Metodo que inicia el hilo
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: " + i + " Hilo: " + Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
    
}
