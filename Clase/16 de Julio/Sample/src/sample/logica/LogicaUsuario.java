/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.logica;
import java.util.ArrayList;
import java.util.List;
import sample.modelos.Persona;
/**
 *
 * @author ulacit
 */
public class LogicaUsuario {
    public List<Persona> obtenerUsuarios() {
        List<Persona> list = new ArrayList<>();
        list.add(new Persona("David", 27));
        list.add(new Persona("Jaime", 25));
        list.add(new Persona("Marco", 22));
        list.add(new Persona("Thomas", 18));
        return list;
        
    }
}
