package br.com.fullstack.sugestoes.servicos;

import br.com.fullstack.sugestoes.dto.SugestaoRequisicaoDto;
import br.com.fullstack.sugestoes.dto.SugestaoRespostaDto;

public interface SugestaoServico {
    SugestaoRespostaDto criar(SugestaoRequisicaoDto dto);
}
