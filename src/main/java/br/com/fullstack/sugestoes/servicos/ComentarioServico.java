package br.com.fullstack.sugestoes.servicos;

import br.com.fullstack.sugestoes.entidades.Comentario;

import java.util.List;

public interface ComentarioServico {
    Comentario criar(Comentario comentario);

    List<Comentario> buscarPorSugestaoId(Long sugestaoId);
}
