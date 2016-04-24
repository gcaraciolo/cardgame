package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.GameStatusJAXBean;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.ws.response.CardGameResponse;
import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/status")
public class StatusGameWS {

    @EJB
    private BattleFieldController battleFieldController;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response gameStatus(GameStatusJAXBean gameStatus) {
        CardGameResponse response;
        Player player;
        
        player = new Player(gameStatus.username);
        response = battleFieldController.gameStatus(player);
        return Response.status(200).entity(response).build();
    }
    
}
