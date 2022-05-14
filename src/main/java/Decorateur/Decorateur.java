/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorateur;

/**
 *
 * @author pc
 */
public abstract class Decorateur {
    protected Service service;
    
    public Decorateur(Service service){
    super();
    this.service=service;
    }
    public abstract String getDescription();
}
