package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.PlayGameJAXBean;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/play")
public class PlayGameWS {

    @EJB
    private BattleFieldController battleFieldController;
       
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response play(PlayGameJAXBean playBean) {        
        boolean match;
        Player player = new Player(playBean.username);                
        match = battleFieldController.play(player, playBean.answerID);
        return Response.status(200).entity("{\"status\": \"success\", \"response\": \"" + match + "\"}").build();
    }
     
}
