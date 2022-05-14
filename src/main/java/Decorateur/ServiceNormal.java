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
public class ServiceNormal extends Service{

    @Override
    public double cout() {
        return 50.0d;
    }

    @Override
    public String getDescription() {
        return " Activer et désactiver votre alarme maison "
                + "Écouter et observer ce qui passe dans vos pièces équipées d'interphones et de caméras"
                + " Connaître les entrées et sorties à toutes heures de la journée (ouvrier, jardinier, femme de ménage";
    }
    
}
