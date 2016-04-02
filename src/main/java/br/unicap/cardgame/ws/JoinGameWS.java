package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("join")
public class JoinGameWS {

    @EJB
    private BattleFieldController battleFieldController;  
    
    @POST    
    @Produces(MediaType.APPLICATION_JSON)    
    public Response join(@FormParam("username") @NotNull String username) {        
        Player player = new Player(username);
        battleFieldController.addPlayer(player);
        return Response.status(200).entity(username + " did join with sucessfull").build();
    }   
    
}
