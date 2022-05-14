/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author pc
 */
public class Module {
    
    private long id;
    private String nomModule;
    private String typeModule;
    private double prix;
     
    
    
    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public String getTypeModule() {
        return typeModule;
    }

    public void setTypeModule(String typeModule) {
        this.typeModule = typeModule;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Module( String nomModule, String typeModule, double prix) {
        this.nomModule = nomModule;
        this.typeModule = typeModule;
        this.prix = prix;
    }

    public Module() {
    }

    public boolean addModule()throws SQLException,IndexOutOfBoundsException{
    boolean res= false;
    
    String sql = "INSERT INTO `module`(`nomModule`, `typeModule`, `prix`) VALUES (?,?,?)";
        try {
            Connection cnx = Singleton.Singleton.getconn();
            
            PreparedStatement stmt =cnx.prepareStatement(sql);
            stmt.setString(1,nomModule);
            stmt.setString(2,typeModule);
            stmt.setDouble(3,prix);
            
            int rs =stmt.executeUpdate();
            
            if (rs==1){
            res=true;
            }
            
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    return res;
    }
    
    public boolean listerModule() throws SQLException, IndexOutOfBoundsException{
    boolean res=false;
    String sql = "SELECT * FROM `module`";
    
        try {
            Connection cnx = Singleton.Singleton.getconn();
            
            PreparedStatement stmt = cnx.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();
            if(rs.next()){
            res=true;
            }
            
        } catch (Exception e) {
        }
        return res;
    }

    public LinkedList<Module> listerAllModule() {
    LinkedList<Module> liste = new LinkedList<>();
        try {
            Connection cnx= Singleton.Singleton.getconn();
            PreparedStatement stmt = cnx.prepareStatement("Select * from module");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                id=rs.getLong("ID");
                nomModule=rs.getString("nomModule");
                typeModule=rs.getString("typeModule");
                prix=rs.getDouble("prix");
                
                Module m = new Module(this.nomModule, this.typeModule , this.prix);
                
                liste.add(this);
            }
            
        } catch (Exception e) {
        }
        return liste;
    }
  
    
   
    
}
