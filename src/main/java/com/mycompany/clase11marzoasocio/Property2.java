/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11marzoasocio;

/**
 *
 * @author Liceth
 */
public class Property2 {
    private static int id;
    private static String address;
    private static String state;
    private static String country;
    private double cost;

    public  Property2(int id, String address, String state, String country, double cost) {
        this.id = id;
        this.address = address;
        this.state = state;
        this.country = country;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Property2{" + "id=" + id + ", address=" + address + ", state=" + state + ", country=" + country + ", cost=" + cost + '}';
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
