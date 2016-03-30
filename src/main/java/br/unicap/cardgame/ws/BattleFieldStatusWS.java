package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/status")
public class BattleFieldStatusWS {

    @EJB
    private BattleField battleField;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response gameStatus() {              
        return Response.status(200).entity(battleField.status()).build();
    }
    
}
