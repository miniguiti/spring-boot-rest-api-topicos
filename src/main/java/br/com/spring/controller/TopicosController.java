package br.com.spring.controller;

import br.com.spring.dto.TopicoDto;
import br.com.spring.model.Curso;
import br.com.spring.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> list(){
         Topico topico = new Topico("Dúvida", "Dúvida com Spring",
                         new Curso("Spring", "Programação"));

         return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
