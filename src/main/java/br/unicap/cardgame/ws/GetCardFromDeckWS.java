package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Player;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/getCard")
public class GetCardFromDeckWS {
    
   @EJB
   private BattleField battlefield;
   
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response getCard(@QueryParam("username") String username) {
       Player player = new Player(username);
       battlefield.getCardFromDeck(player);
       return Response.status(200).build();
   }
   
}
