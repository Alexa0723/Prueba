/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import com.mycompany.clase11marzoasocio.Furniture;
import com.mycompany.clase11marzoasocio.Person;

/**
 *
 * @author Liceth
 */
public class Test {
    public static void main (String[] args){
        Person p1= new Person(1, "Juanita" , 300100 , "juanita@gmail.com");
        Furniture furniture = new Furniture(100,"edificio viamonti","bueno","colombia",2500000,p1);
    }
}

