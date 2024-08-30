package br.com.fullstack.sugestoes.servicos;

import br.com.fullstack.sugestoes.dto.SugestaoRequisicaoDto;
import br.com.fullstack.sugestoes.dto.SugestaoRespostaDto;
import br.com.fullstack.sugestoes.entidades.Sugestao;
import br.com.fullstack.sugestoes.repositorios.SugestaoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SugestaoSercicoImpl implements SugestaoServico {

    private final SugestaoRepositorio repositorio;

    @Override
    public SugestaoRespostaDto criar(SugestaoRequisicaoDto dto) {
        Sugestao sugestao = new Sugestao(dto);
        repositorio.save(sugestao);
        return new SugestaoRespostaDto(sugestao);
    }
}
