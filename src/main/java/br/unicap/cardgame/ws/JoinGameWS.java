package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Char;
import br.unicap.cardgame.model.Player;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/join")
public class JoinGameWS {

    @Inject
    private BattleField battleField;    
    
    @POST    
    @Produces(MediaType.APPLICATION_JSON)    
    public Response join(@FormParam("username") @NotNull String username, 
                         @FormParam("charType") @NotNull String charType) {
        Char character = new Char(Integer.parseInt(charType));
        Player player = new Player(username);
        battleField.addPlayer(player, character);
        return Response.status(200).entity(username + " did join with sucessfull").build();
    }   
    
}
