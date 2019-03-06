/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplacements;

/**
 *
 * @author Titouan FLOCH
 */
public class Emplacement 
{   
    int idEmplacement;
    String nomEmplacement, type;
    int tirantEau;
    int disponible;
    float prix;
    
    
    
    public Emplacement()
    {
    }
    public Emplacement(int nouvIdEmplacement,String nouvNomEmplacement,String nouvType,int nouvTirantEau,int infoDisponible,float nouvPrix)
    {
        idEmplacement = nouvIdEmplacement;
        nomEmplacement = nouvNomEmplacement;
        type = nouvType;   
        tirantEau = nouvTirantEau;
        disponible = infoDisponible;
        prix = nouvPrix;
    }
    
    public int getIdEmplacement() 
    {
        return idEmplacement;
    }
     
    public String getNomEmplacement() 
    {
        return nomEmplacement;
    }

    public String getType() 
    {
        return type;
    }

    public int getTirantEau() 
    {
        return tirantEau;
    }

    public int getDisponible() 
    {
        return disponible;
    }

    public float getPrix() 
    {
        return prix;
    }
    
    public void setIdEmplacement(int idEmplacement) 
    {
        this.idEmplacement = idEmplacement;
    }
    public void setNomEmplacement(String nomEmplacement) 
    {
        this.nomEmplacement = nomEmplacement;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
     public void setTirantEau(int tirantEau) 
    {
        this.tirantEau = tirantEau;
    }

    public void setDisponible(int disponible) 
    {
        this.disponible = disponible;
    }
    public void setPrix(float prix)
    {
        this.prix = prix;
    }

   

    

    

   
    
}
