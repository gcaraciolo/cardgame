package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/path")
public class PlayGameWS {
    
    @EJB
    private BattleField battleField;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response play(@FormParam("username") String username) {
        Player player = new Player(username);
        battleField.play(player);
        return Response.status(200).build();
    }
}
