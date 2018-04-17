/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Product;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Andrew
 */

@Stateless
@Path("/product")
public class ProductFacadeREST {
    
    static Product product;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setJSON(Product entity){
        product = entity;
        return Response.ok(product).build();
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Product getJSON(){
        //return "{" + "name:" + this.name + "," + "category:" + this.category + "," + "price:" + this.price + "}";
        return product;
    }
}
