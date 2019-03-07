/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Date;

/**
 *
 * @author AngeliqueLeRoux
 */
public class Louer{
    private String nomBateau;
    private String portBateau;
    private Date dateArrivee;
    private Date dateDepart;
    private int reglement;

    public Louer(String nomBateau, String portBateau, Date dateArrivee, Date dateDepart, int reglement)
    {
        this.nomBateau = nomBateau;
        this.portBateau = portBateau;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.reglement = reglement;
    }

    public String getNomBateau()
    {
        return nomBateau;
    }

    public void setNomBateau(String nomBateau)
    {
        this.nomBateau = nomBateau;
    }

    public String getPortBateau()
    {
        return portBateau;
    }

    public void setPortBateau(String portBateau)
    {
        this.portBateau = portBateau;
    }

    public Date getDateArrivee()
    {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee)
    {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateDepart()
    {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart)
    {
        this.dateDepart = dateDepart;
    }

    public int getReglement()
    {
        return reglement;
    }

    public void setReglement(int reglement)
    {
        this.reglement = reglement;
    }
}
