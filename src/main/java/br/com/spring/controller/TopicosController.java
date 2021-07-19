package br.com.spring.controller;

import br.com.spring.controller.form.TopicoForm;
import br.com.spring.dto.TopicoDto;
import br.com.spring.model.Topico;
import br.com.spring.repository.CursoRepository;
import br.com.spring.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Controller
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    @ResponseBody
    public List<TopicoDto> list(String nomeCurso) {
        if (nomeCurso == null){
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        }else{
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDto.converter(topicos);
        }
    }

    @PostMapping
    public void cadastrar(@RequestBody TopicoForm topicoForm){
        Topico topico = topicoForm.converter(cursoRepository);
        topicoRepository.save(topico);
    }

}
