/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Cliente;
import clases.Directorio;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author salva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1 = new Cliente(234,"Juan","Peres","Los Incas 123","Merlo");
        Cliente c2 = new Cliente(234,"Jose","Lopez","Los Almendres 123","Merlo");
        
        Directorio dir1 = new Directorio();
        dir1.agregarCliente(111111, c2);
        dir1.agregarCliente(666666, c1);
        dir1.agregarCliente(333333, c1);
        
        
        
        System.out.println("Buscar" + dir1.buscarCliente(666666));
        List<Long>telPeres = dir1.buscarTelefono("Peres");
        
        Iterator it = telPeres.iterator();
        while(it.hasNext()){
            System.out.println("Telefonos de Peres"+(Long)it.next());
       }
    }
    
}
