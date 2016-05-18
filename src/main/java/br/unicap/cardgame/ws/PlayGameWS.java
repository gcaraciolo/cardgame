package br.unicap.cardgame.ws;

import br.unicap.cardgame.app.Secured;
import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.jax.bean.PlayGameJAXBean;
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

@Path("/play")
public class PlayGameWS {

    @EJB
    private BattleFieldController battleFieldController;
       
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Secured
    public Response play(PlayGameJAXBean playBean,
            @HeaderParam("Authorization") String token) {        
        CardGameResponse response;        
        Player player;
        
        player = new Player(Utils.getUsername(token));                
        response = battleFieldController.play(player, playBean.answerID);
        return Response.status(200).entity(response).build();
    }
     
}
