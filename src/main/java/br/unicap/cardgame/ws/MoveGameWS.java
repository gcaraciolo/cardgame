package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleFieldController;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/move")
public class MoveGameWS {
    
    @EJB
    private BattleFieldController battleFieldController;
    
    @POST
    public Response move(@FormParam("username") String username,
                         @FormParam("position") int position) {
                
        Player player = new Player(username);
        battleFieldController.move(player, position);        
        return Response.status(200).build();
    }
}
