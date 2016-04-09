package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.LeaveGameJAXBean;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/leave")
public class LeaveGameWS {
    
    @EJB
    private BattleFieldController battleFieldController;   
    
    @POST    
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response leave(LeaveGameJAXBean leaveGame) {        
        Player player = new Player(leaveGame.username);
        battleFieldController.removePlayer(player);        
        return Response.status(200).build();
    }   
    
}
