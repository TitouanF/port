/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplacements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Titouan FLOCH
 */
public class ListeEmplacement 
{
     private static ArrayList<Emplacement> lesEmplacementsAvecTri = new ArrayList<Emplacement>();
    private static ArrayList<Emplacement> lesEmplacements = new ArrayList<Emplacement>();
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static String pilote = "org.gjt.mm.mysql.Driver";
    private static String url = new String("jdbc:mysql://localhost/port");
    
   
    public static ArrayList<Emplacement> lesEmplacements()
    {
        try 
        {
            int libre;
            lesEmplacements = new ArrayList<Emplacement>();
            Class.forName(pilote);
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();			            
            rs = stmt.executeQuery("select emplacement.id,emplacement.nomEmplacement,emplacement.disponible,type.situation,type.profondeur,type.prix from emplacement,type where emplacement.type_id = type.id");
            Emplacement unEmplacement;
            while (rs.next())
            {
                if (rs.getBoolean("disponible") == false)
                {
                    libre = 0;
                }
                else
                {
                    libre = 1;
                }
                unEmplacement = new Emplacement(rs.getInt("id"),rs.getString("nomEmplacement"),rs.getString("situation"),rs.getInt("profondeur"),libre,rs.getFloat("prix"));
                lesEmplacements.add(unEmplacement);
            }
            rs.close();
            stmt.close();
            conn.close();
            return lesEmplacements;
        }
         catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        catch (ClassNotFoundException e)
        {                
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    //   A RETIRER SI ON FAIT LE TRUC OU LE TRI SE FAIT DIRECTEMENT SANS REQUETE
     public static ArrayList<Emplacement> lesEmplacementsAvecUnTri(int valeur)
    {
        try 
        {
            lesEmplacementsAvecTri = new ArrayList<Emplacement>();
            Class.forName(pilote);
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();	
            String req = "select emplacement.id,emplacement.nomEmplacement,emplacement.disponible,type.situation,type.profondeur,type.prix from emplacement,type where emplacement.type_id = type.id and emplacement.disponible = '"+valeur+"'";
            System.out.println(req);
            rs = stmt.executeQuery(req);        
            Emplacement unEmplacement;
            while (rs.next())
            {
                unEmplacement = new Emplacement(rs.getInt("id"),rs.getString("nomEmplacement"),rs.getString("situation"),rs.getInt("profondeur"),valeur,rs.getFloat("prix"));
                lesEmplacementsAvecTri.add(unEmplacement);
            }
            rs.close();
            stmt.close();
            conn.close();
            return lesEmplacementsAvecTri;
        }
         catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        catch (ClassNotFoundException e)
        {                
            System.out.println(e.getMessage());
            return null;
        }
    }
}
