package br.com.spring.dto;

import br.com.spring.model.Resposta;

import java.time.LocalDateTime;

public class RespostaDto {
    private Long id;
    private String mensagem;
    private LocalDateTime data;
    private String autor;

    public RespostaDto(Resposta resposta){
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.data = resposta.getDataCriacao();
        this.autor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
