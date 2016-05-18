package br.unicap.cardgame.app;

import br.unicap.cardgame.util.Utils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import java.io.IOException;
import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
@Secured
public class AuthenticationFilter implements ContainerRequestFilter {
        
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {       
       String authorizationHeader = 
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer")) {
            throw new NotAuthorizedException("Usuário precisa fazer login");
        }
      
        String token = authorizationHeader.substring("Bearer".length()).trim();
        String tokenCompact = Jwts.builder()
                .setSubject(token)
                .signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET)
                .compact();
        try {
            Jwts.parser().setSigningKey(Utils.APP_CLIENT_SECRET).parseClaimsJws(tokenCompact);
        } catch (SignatureException e) {
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }
}