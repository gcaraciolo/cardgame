package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.FormParam;
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
    @Produces(MediaType.APPLICATION_JSON)
    public Response play(@FormParam("username") String username, 
                         @FormParam("cardAnswer") int answer) {        
        Player player = new Player(username);        
        battleFieldController.play(player, answer);
        return Response.status(200).build();
    }
     
}
