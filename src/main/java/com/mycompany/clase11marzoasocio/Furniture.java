/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11marzoasocio;

/**
 *
 * @author Liceth
 */
public class Furniture {
    private int id;
    private String address;
    private String state;
    private String country;
    private double cost;
    private Person persona;

    public Furniture(int id, String address, String state, String country, double cost, Person persona) {
        this.id = id;
        this.address = address;
        this.state = state;
        this.country = country;
        this.cost = cost;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Furniture{" + "id=" + id + ", address=" + address + ", state=" + state + ", country=" + country + ", cost=" + cost + ", persona=" + persona + '}';
    }
    
    

    public Person getPersona() {
        return persona;
    }

    public void setPersona(Person persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
   
}

