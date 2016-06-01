package br.unicap.cardgame.ws;

import br.unicap.cardgame.app.Secured;
import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.ws.response.CardGameResponse;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/online")
public class OnlinePlayersGameWS {

    @EJB
    private BattleFieldController battleFieldController;
       
    @GET
    @Produces({ MediaType.APPLICATION_JSON })    
    @Secured
    public Response playersOnline() {        
        CardGameResponse response;
        
        response = battleFieldController.connectedPlayers();
        return Response.status(200).entity(response).build();
    }
    
}
