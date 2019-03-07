/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AngeliqueLeRoux
 */
public class gestionPort{
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static String pilote = "org.gjt.mm.mysql.Driver";
    private static String url = new String("jdbc:mysql://localhost/port");
    private static ArrayList<Emplacement> CollectionEmplacements;
    private static Emplacement unEmplacement;
    private static Louer uneLocation;
    
    public static ArrayList<Emplacement> lesEmplacements(){
        try{
            CollectionEmplacements = new ArrayList<Emplacement>();
            Class.forName(pilote);           			            
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();			            
            rs = stmt.executeQuery("SELECT emplacement.id, emplacement.disponible, type.situation, type.profondeur, type.prix, louer.nombateau, louer.portbateau, louer.datearrivee, louer.datedepart, louer.reglement FROM `emplacement` INNER JOIN `type` ON emplacement.type_id = type.id LEFT JOIN `louer` ON emplacement.id = louer.emplacement_id");
            
            while (rs.next()){
                uneLocation = new Louer(rs.getString("nombateau"), rs.getString("portbateau"), rs.getDate("datearrivee"), rs.getDate("datedepart"), rs.getInt("reglement"));
                unEmplacement = new Emplacement(rs.getInt("id"), rs.getInt("disponible"), rs.getString("situation"), rs.getFloat("profondeur"), rs.getFloat("prix"), uneLocation);
                CollectionEmplacements.add(unEmplacement);
            }
            rs.close();
            stmt.close();
            conn.close();
            return CollectionEmplacements;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
