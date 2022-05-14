/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author pc
 */
public class Prof extends User{

    public Prof(String typeCapteur, int puissance, double distanceDetection) {
        super(typeCapteur, puissance, distanceDetection);
    }

    @Override
    public void afficherCapteur() {
        System.out.println("Création de Capteur de Mouvement");
    }

    public Prof() {
    }
    
    
    
}
