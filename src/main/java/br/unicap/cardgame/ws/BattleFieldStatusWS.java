package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.BattleFieldStatus;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class BattleFieldStatusWS {

    @Inject
    private BattleField battleField;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BattleFieldStatus gameStatus() {              
        return battleField.status();
    }
    
}
