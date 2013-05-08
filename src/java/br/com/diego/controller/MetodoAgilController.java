/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diego.controller;

import br.com.diego.dao.ComentarioDAO;
import br.com.diego.model.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Diego
 */
@Controller
@RequestMapping("metodo-agil")
public class MetodoAgilController {
    
    private ComentarioDAO comentarioDAO;

    @Autowired
    public void setComentarioDAO(ComentarioDAO comentarioDAO) {
        this.comentarioDAO = comentarioDAO;
    }

    @RequestMapping(value = "/pagina-metodos-ageis.htm", method = RequestMethod.GET)
    public ModelAndView page1(
            @ModelAttribute("comentario") Comentario comentario)
            throws Exception {

        comentarioDAO.adicionar(comentario);
        ModelMap model = new ModelMap();
        model.addAttribute("lista", comentarioDAO.listar());
        model.addAttribute("comentario", new Comentario());

        return new ModelAndView("pagina-metodos-ageis", model);
    }
    
}