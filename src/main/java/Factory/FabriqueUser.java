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
public class FabriqueUser implements GestionUser{

    @Override
    public User creerCapteurMouvement() {
        return new Prof("AKB_Mouvement", 10, 50);
            
    }

    @Override
    public User creerCapteurBruit() {
        return new Etudiant("ABK_Noise", 20, 300);
    }

    @Override
    public User creerCapteurIncendie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
