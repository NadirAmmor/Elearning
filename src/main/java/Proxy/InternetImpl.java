/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author pc
 */
public class InternetImpl implements Internet{


    public InternetImpl() {
    }

    
    @Override
    public boolean connecter(String name) {
        System.out.println("authorized access to "+name);
        return true;
    }
    
}
