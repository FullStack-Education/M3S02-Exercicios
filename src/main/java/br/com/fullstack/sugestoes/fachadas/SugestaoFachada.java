package br.com.fullstack.sugestoes.fachadas;

import br.com.fullstack.sugestoes.dto.ComentarioRequisicaoDto;
import br.com.fullstack.sugestoes.dto.ComentarioRespostaDto;
import br.com.fullstack.sugestoes.dto.SugestaoRequisicaoDto;
import br.com.fullstack.sugestoes.dto.SugestaoRespostaDto;
import jakarta.validation.Valid;

import java.util.List;

public interface SugestaoFachada {
    SugestaoRespostaDto criar(SugestaoRequisicaoDto dto);

    List<SugestaoRespostaDto> buscarTodos(String titulo);

    SugestaoRespostaDto buscarPorId(Long id);

    ComentarioRespostaDto criarComentario(Long id, ComentarioRequisicaoDto dto);
}
