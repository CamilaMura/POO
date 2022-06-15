/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import newpackage.Libro;
import usuario.ServicioLibro;

/**
 *
 * @author dell
 */
public class PedidoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLibro serv = new ServicioLibro();
        Libro lib = serv.CargarLibro();
        serv.MostrarLibro(lib);
        
    }
    
}
