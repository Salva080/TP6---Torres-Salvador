/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author salva
 */
public class Directorio {
    private TreeMap <Long,Cliente> lista = new TreeMap<>();    
    
    public int agregarCliente(long telefono, Cliente cliente){
        lista.put(telefono, cliente);
        return 1;
    }
    
    public Cliente buscarCliente(long telefono){
        return lista.get(telefono);
    }
    
    public List<Long> buscarTelefono(String apellido){
        //VARIABLE DE RETORNO
        ArrayList<Long> telefonos = new ArrayList<>();
        //OBTENER CLAVES
        Set<Long> tel = lista.keySet();
        Iterator<Long> it = tel.iterator();
        while(it.hasNext()){
            Long telefono = it.next();
            Cliente c = lista.get(telefono);
            if(c.getApellido() .equals(apellido)){
                telefonos.add(telefono);
            }
        }  
        return telefonos;
      }
     
    public List<Cliente> buscarClientes(String ciudad){
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Set<Long> tels = lista.keySet();
        Iterator<Long> it = tels.iterator();
        while(it.hasNext()){
            Long telefono = it.next();
            Cliente c = lista.get(telefono);
            if(c.getCiudad().equals(ciudad)){
                clientes.add(c);
            }
        }
        return clientes;
    }

    
    
    public Cliente borrarCliente(long tel){
        Cliente clienteABorrar = lista.remove(tel);
        if(clienteABorrar != null){
        JOptionPane.showMessageDialog(null, "Borrado con exito");
        
        }else{
            JOptionPane.showMessageDialog(null, "No existe ese Telefono");
        }
        return clienteABorrar;
    }
}
