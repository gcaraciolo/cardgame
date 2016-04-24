package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.LeaveGameJAXBean;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.ws.response.CardGameResponse;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/leave")
public class LeaveGameWS {
    
    @EJB
    private BattleFieldController battleFieldController;   
    
    @POST    
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response leave(LeaveGameJAXBean leaveGame) {        
        CardGameResponse response;
        Player player;        
        
        player = new Player(leaveGame.username);
        response = battleFieldController.removePlayer(player);        
        return Response.status(200).entity(response).build();
    }   
    
}
