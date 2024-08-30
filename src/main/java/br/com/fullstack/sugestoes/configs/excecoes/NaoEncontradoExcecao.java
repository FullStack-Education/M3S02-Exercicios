package br.com.fullstack.sugestoes.configs.excecoes;

public class NaoEncontradoExcecao extends RuntimeException {
    public NaoEncontradoExcecao(String mensagem) {
        super(mensagem);
    }
}
