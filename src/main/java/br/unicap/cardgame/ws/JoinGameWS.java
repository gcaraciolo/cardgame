package br.unicap.cardgame.ws;

import br.unicap.cardgame.ws.response.CardGameResponse;
import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.JoinGameJAXBean;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("join")
public class JoinGameWS {

    @EJB
    private BattleFieldController battleFieldController;  
    
    @POST    
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response join(JoinGameJAXBean joinBean) {        
        Player player = new Player(joinBean.username);
        battleFieldController.addPlayer(player);
        return Response.status(200).build();
    }   
    
}
