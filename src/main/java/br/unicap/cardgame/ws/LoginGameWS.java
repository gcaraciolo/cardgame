package br.unicap.cardgame.ws;

import br.unicap.cardgame.controller.UsersController;
import br.unicap.cardgame.ws.request.LoginGameJAXBean;
import br.unicap.cardgame.ws.response.CardGameResponseToken;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("login")
public class LoginGameWS {

    @EJB
    private UsersController user;
    
    @POST    
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response join(LoginGameJAXBean loginGame) {        
        CardGameResponseToken response;        
        try {
            response = user.authenticate(loginGame.username, loginGame.password);
            return Response.status(200).entity(response).build();
        } catch(Exception e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }        
    }   
    
}
