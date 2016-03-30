package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Player;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/online")
public class OnlinePlayersWS {

    @EJB
    private BattleField battleField;
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> playersOnline() {        
        return battleField.connectedPlayers();
    }
    
}
