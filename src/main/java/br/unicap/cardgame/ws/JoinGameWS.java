package br.unicap.cardgame.ws;

import br.unicap.cardgame.app.Secured;
import br.unicap.cardgame.ws.response.CardGameResponse;
import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.util.Utils;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
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
    @Secured
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response join(@HeaderParam("Authorization") String token) {        
        CardGameResponse response;
        Player player;
               
        player = new Player(Utils.getUsername(token));        
        response = battleFieldController.addPlayer(player);
        return Response.status(200).entity(response).build();
    }   
    
}
