package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.GameStatusJAXBean;
import br.unicap.cardgame.model.Player;
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
        Player player = new Player(gameStatus.username);
        return Response.status(200).entity(battleFieldController.gameStatus(player)).build();
    }
    
}
