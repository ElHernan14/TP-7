/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.colecciones;

/**
 *
 * @author Hernan57
 */
public class TP7Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente jose = new Cliente("Jose","perez","La Punta",32323232);
        Cliente pepe = new Cliente("Pepe","perez","La Punta",32323232);
        Cliente pepa = new Cliente("Pepa","perez","La Punta",32323232);
        Cliente hernan = new Cliente("Hernan","Constante","La punta",41137674);
        Cliente lolo = new Cliente("Lolo","Constante","San Luis",31434343);
        Cliente pipi = new Cliente("Pipi","Constante","Trapiche",43434343);
        
        DirectorioTelefonico telefonica = new DirectorioTelefonico();
        telefonica.agregarCliente(266430689, jose);
        telefonica.agregarCliente(266422222, pepe);
        telefonica.agregarCliente(266433333, pepa);
        telefonica.agregarCliente(266455555, hernan);
        telefonica.agregarCliente(266411111, lolo);
        telefonica.agregarCliente(266466666, pipi);
        System.out.println("Los clientes son "+telefonica.getClientes()+"\n");
        System.out.println("El cliente es: "+telefonica.buscarCliente(266455555)+" Sus numeros son: "+telefonica.buscarTelefono("Constante")+" | Los clientes de dicha ciudad son: "+telefonica.buscarClientes("La Toma")+"\n");
        telefonica.borrarCliente(32323232);
        System.out.println("Los clientes con un remove luego son "+telefonica.getClientes()+"\n");  
    }
}
