/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

/**
 *
 * @author Hernan57
 */
public class DirectorioTelefonico{
    private Map <Long,Cliente> clientes = new HashMap<>();

    public Map<Long, Cliente> getClientes() {
        return clientes;
    }
    
    public DirectorioTelefonico(){}

    public void agregarCliente(long nro, Cliente cliente){
        clientes.put(nro,cliente);
    }
    public String buscarCliente(long nro){
        String nombre = null;
        String apellido = null;
        for(Map.Entry<Long,Cliente> c:clientes.entrySet()){
            long numero=c.getKey();
            Cliente valor = c.getValue();
            if(numero==nro){
                nombre = valor.getNombre();
                apellido = valor.getApellido();
            }
        }
        return nombre+" "+apellido;
    }
    public List<Long> buscarTelefono(String apellido){
        List<Long> numeros = new ArrayList<>();
        for(Map.Entry<Long,Cliente> c:clientes.entrySet()){
            long numero=c.getKey();
            Cliente cliente = c.getValue();
            if(cliente.getApellido()==apellido){
                numeros.add(numero);
            }  
        }
        return numeros;
    }
    public List<Cliente> buscarClientes(String ciudad){
        List<Cliente> clientela = new ArrayList<>();
        for(Map.Entry<Long,Cliente> c:clientes.entrySet()){
            Cliente cliente = c.getValue();
            if(cliente.getCiudad()==ciudad){
                clientela.add(cliente);
            } 
        }
            return clientela;  
    }
    public void borrarCliente(long dni){
        for (Iterator<Cliente> it = clientes.values().iterator();it.hasNext();){
            Cliente clave =it.next();
            long docu = clave.getDni();
               if(docu==dni){
                it.remove();
            }  
        }
    }
    
}

   
