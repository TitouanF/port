/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplacements;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Titouan FLOCH
 */
@Path("port")
public class PortResource 
{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PortResource
     */
    public PortResource() 
    {
    }

    /**
     * Retrieves representation of an instance of emplacements.PortResource
     * @return an instance of java.lang.String
     */
    
    // LES EMPLACEMENTS SANS TRI
    @GET
    @Path("liste")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Emplacement> getJSON()
    {
        ArrayList<Emplacement> lesEmplacements = ListeEmplacement.lesEmplacements();
        return lesEmplacements;
    } 
    
    // ENLEVER SI ON FAIT LE TRUC DIRECT SUR ANDROIDSTUDIO
    @GET
    @Path("listeTri")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Emplacement> getJSON(@QueryParam("occupe") int valeur)
    {
        ArrayList<Emplacement> lesResultats = ListeEmplacement.lesEmplacementsAvecUnTri(valeur);
        return lesResultats;
    }
    
    

    /**
     * PUT method for updating or creating an instance of PortResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) 
    {
    }
}
