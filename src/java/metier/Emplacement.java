/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author AngeliqueLeRoux
 */
public class Emplacement{
    private int noEmplacement;
    private int disponible;
    private String situation;
    private float profondeur;
    private float prix;
    private Louer location;

    public Emplacement(int noEmplacement, int disponible, String situation, float profondeur, float prix, Louer location){
        this.noEmplacement = noEmplacement;
        this.disponible = disponible;
        this.situation = situation;
        this.profondeur = profondeur;
        this.prix = prix;
        this.location = location;
    }    
    
    public int getNoEmplacement()
    {
        return noEmplacement;
    }

    public void setNoEmplacement(int noEmplacement)
    {
        this.noEmplacement = noEmplacement;
    }

    public int getDisponible()
    {
        return disponible;
    }

    public void setDisponible(int disponible)
    {
        this.disponible = disponible;
    }

    public String getSituation(){
        return situation;
    }

    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public float getProfondeur(){
        return profondeur;
    }

    public void setProfondeur(float profondeur)
    {
        this.profondeur = profondeur;
    }

    public float getPrix()
    {
        return prix;
    }

    public void setPrix(float prix)
    {
        this.prix = prix;
    } 

    public Louer getLocation()
    {
        return location;
    }

    public void setLocation(Louer location)
    {
        this.location = location;
    }
}
