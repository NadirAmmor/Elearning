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
public class SousTitre extends Decorateur{

    public SousTitre(Service service) {
        super(service);
    }
    public double detectImage(){
    return service.cout()+25.0d;
    }

    @Override
    public String getDescription() {
        return this.service.getDescription() + " ajout des détecteurs d'images améliorés par des capteurs ultra-sensibles qui \n" +
"décèleront les présences indésirables ";
    }
    
}
