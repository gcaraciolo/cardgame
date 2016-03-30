package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Card;
import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/move")
public class BattleFieldMoveWS {
    
    @Inject
    BattleField battleField;
    
    @POST
    public Response move(@FormParam("username") String username,
                         @FormParam("moveType") String moveType) {
        
        Card card = new Card(Integer.parseInt(moveType));        
        battleField.move(card);        
        return Response.status(200).build();
    }
}
