/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Proxy implements Internet{
    
    InternetImpl s1 = new InternetImpl() ;
  static  List<String> list= new ArrayList();
   static {
       list.add("nadir");
       list.add("hamid");
       list.add("soukaina");
   }
   
  
    public boolean connecter(String name) {
        boolean res = false;
       if(list.contains(name)){
           s1.connecter(name);
           res=true;
       }   
       else{
          System.out.println("forbidden access to this site proxy problems "+ name);
          res=false;
       }
    return res;
    }

  
}
