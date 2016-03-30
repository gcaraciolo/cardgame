package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/online")
public class OnlinePlayersWS {

    @Inject
    private BattleField battleField;
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response playersOnline() {        
        return Response.status(200).entity(battleField.connectedPlayers()).build();
    }
    
}
