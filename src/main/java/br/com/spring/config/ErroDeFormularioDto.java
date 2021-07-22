package br.com.spring.config;

public class ErroDeFormularioDto {

    private String campo;
    private String messagem;

    public ErroDeFormularioDto(String campo, String messagem) {
        this.campo = campo;
        this.messagem = messagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMessagem() {
        return messagem;
    }
}
