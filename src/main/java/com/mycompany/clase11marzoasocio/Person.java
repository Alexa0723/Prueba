/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11marzoasocio;

/**
 *
 * @author Liceth
 */
public class Person {
    private int id;
    private String name;
    private int cell;
    private String email;

    public Person(int id, String name, int cell, String email) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.email = email;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", cell=" + cell + ", email=" + email + '}';
    }

    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cell
     */
    public int getCell() {
        return cell;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(int cell) {
        this.cell = cell;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
