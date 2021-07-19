package br.com.spring.controller;

import br.com.spring.dto.TopicoDto;
import br.com.spring.model.Curso;
import br.com.spring.model.Topico;
import br.com.spring.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@Controller
public class TopicosController {

    @Autowired
    private TopicoRepository repository;

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> list() {
        List<Topico> topicos = repository.findAll();
        return TopicoDto.converter(topicos);
    }
}
