package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/status")
public class StatusGameWS {

    @EJB
    private BattleFieldController battleFieldController;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response gameStatus() {              
        return Response.status(200).entity(battleFieldController.gameStatus()).build();
    }
    
}
