/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.dp_project_elearning.actors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class UtilisateurEtudiant {
       private long id;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UtilisateurEtudiant(String nom, String prenom, String email, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
    }
    
    
    public static boolean authentification(String login,String password){
    
        boolean res= false;

            String sql = "SELECT * FROM `user` WHERE login = '" +login + "' " + "AND password = '" + password + "' And role = 'etudiant'  And etat = true" ;
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.Singleton.getconn();
                PreparedStatement stmt = cnx.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next()) {
                    res=true;
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return res;
    }
    
    public static int authentification2(String login,String password){
    
        int res= -1;

            String sql = "SELECT * FROM `user` WHERE login = '" +login + "' " + "AND password = '" + password + "' And role = 'etudiant'  And etat = true" ;
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.Singleton.getconn();
                PreparedStatement stmt = cnx.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next()) {
                    res= rs.getInt(1);
                    
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return res;
    }
}
