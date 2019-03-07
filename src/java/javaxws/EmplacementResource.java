/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxws;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import metier.Emplacement;
import metier.gestionPort;

/**
 * REST Web Service
 *
 * @author AngeliqueLeRoux
 */
@Path("emplacement")
public class EmplacementResource
{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EmplacementResource
     */
    public EmplacementResource(){}

    /**
     * Retrieves representation of an instance of jaxws.EmplacementResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Emplacement> getJson()
    {
        ArrayList<Emplacement> liste = gestionPort.lesEmplacements();
        return liste;
    }

    /**
     * PUT method for updating or creating an instance of EmplacementResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content)
    {
    }
}
