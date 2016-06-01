/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.cardgame.controller;

import br.unicap.cardgame.dao.CharsDAO;
import br.unicap.cardgame.model.Chars;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class CharsController {
    
    @EJB
    private CharsDAO charDAO;
    
    public Chars getPlayerChar(String username) {
        return charDAO.getPlayerChar(username);
    }
}
