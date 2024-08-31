package br.com.fullstack.sugestoes.servicos;

import br.com.fullstack.sugestoes.entidades.Sugestao;

import java.util.List;

public interface SugestaoServico {
    Sugestao salvar(Sugestao sugestao);

    List<Sugestao> buscarTodos(String titulo);

    Sugestao buscarPorId(Long id);
}
