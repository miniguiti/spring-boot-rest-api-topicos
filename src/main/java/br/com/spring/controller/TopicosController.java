package br.com.spring.controller;

import br.com.spring.model.Curso;
import br.com.spring.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> list(){
         Topico topico = new Topico("Dúvida", "Duvida com Spring",
                         new Curso("Spring", "Programação"));

         return Arrays.asList(topico, topico, topico);
    }
}
