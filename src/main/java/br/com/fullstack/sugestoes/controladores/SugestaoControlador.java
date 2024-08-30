package br.com.fullstack.sugestoes.controladores;

import br.com.fullstack.sugestoes.dto.SugestaoRequisicaoDto;
import br.com.fullstack.sugestoes.dto.SugestaoRespostaDto;
import br.com.fullstack.sugestoes.servicos.SugestaoServico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("sugestoes")
public class SugestaoControlador {

    private final SugestaoServico servico;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SugestaoRespostaDto post(@RequestBody SugestaoRequisicaoDto dto) {
        return servico.criar(dto);
    }
}
