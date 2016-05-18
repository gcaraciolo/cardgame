package br.unicap.cardgame.app;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.ws.rs.NameBinding;

@NameBinding
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RUNTIME)
public @interface Secured { }