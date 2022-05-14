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
public class Enregistrement extends Decorateur{

    public Enregistrement(Service service) {
        super(service);
    }
 public double detectOuverture(){
    return service.cout()+25.0d;
    }
    @Override
    public String getDescription() {
        return this.service.getDescription() + " ajout des \n" +
"détecteurs d'ouverture qui réagiront dès qu'une action inhabituelle sera pratiquée sur une \n" +
"porte ou fenêtres.";
    }
    
    
}
