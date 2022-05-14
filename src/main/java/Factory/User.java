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
public abstract class User {
    String typeCapteur;
    int puissance;
    double distanceDetection;

    public User(String typeCapteur, int puissance, double distanceDetection) {
        this.typeCapteur = typeCapteur;
        this.puissance = puissance;
        this.distanceDetection = distanceDetection;
    }

    public User() {
    }
    
        public abstract void afficherCapteur();

}
