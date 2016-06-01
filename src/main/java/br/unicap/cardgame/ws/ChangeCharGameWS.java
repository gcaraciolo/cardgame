package br.unicap.cardgame.ws;

import br.unicap.cardgame.app.Secured;
import br.unicap.cardgame.controller.UsersController;
import br.unicap.cardgame.jax.bean.ChangeCharJAXBean;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.util.Utils;
import br.unicap.cardgame.ws.response.CardGameResponse;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/change-char")
public class ChangeCharGameWS {
    
    @EJB
    private UsersController usersController;
    
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Secured
    public Response changeChar(ChangeCharJAXBean changeCharBean,
            @HeaderParam("Authorization") String token) {        
        CardGameResponse response;        
        response = usersController.changeUserChar(Utils.getUserId(token), changeCharBean.charId);
        return Response.status(200).entity(response).build();
    }
}
