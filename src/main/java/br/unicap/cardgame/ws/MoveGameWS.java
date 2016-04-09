package br.unicap.cardgame.ws;

import br.unicap.cardgame.jax.bean.MoveGameJAXBean;
import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/move")
public class MoveGameWS {
    
    @EJB
    private BattleFieldController battleFieldController;
    
    @POST    
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response move(MoveGameJAXBean moveBean) {                        
        Player player = new Player(moveBean.username);
        battleFieldController.move(player, moveBean.position);                
        return Response.status(200).build();
    }
}
