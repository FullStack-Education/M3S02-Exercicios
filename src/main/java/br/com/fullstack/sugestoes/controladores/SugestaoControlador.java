package br.com.fullstack.sugestoes.controladores;

import br.com.fullstack.sugestoes.dto.ComentarioRequisicaoDto;
import br.com.fullstack.sugestoes.dto.ComentarioRespostaDto;
import br.com.fullstack.sugestoes.dto.SugestaoRequisicaoDto;
import br.com.fullstack.sugestoes.dto.SugestaoRespostaDto;
import br.com.fullstack.sugestoes.fachadas.SugestaoFachada;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("sugestoes")
public class SugestaoControlador {

    private final SugestaoFachada fachada;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SugestaoRespostaDto post(@Valid @RequestBody SugestaoRequisicaoDto dto) {
        return fachada.criar(dto);
    }

    @GetMapping
    public List<SugestaoRespostaDto> get(
            @Parameter(description = "Perquisar por título (que contenha o valor: `%{valor}%`)")
            @RequestParam(required = false) String titulo
    ) {
        return fachada.buscarTodos(titulo);
    }

    @GetMapping("{id}")
    public SugestaoRespostaDto getId(
            @Parameter(description = "ID da sugestão")
            @PathVariable Long id
    ) {
        return fachada.buscarPorId(id);
    }

    @PostMapping("{id}/comentarios")
    public ComentarioRespostaDto postComentario(
            @Parameter(description = "ID da sugestão")
            @PathVariable Long id,
            @Valid @RequestBody ComentarioRequisicaoDto dto
    ) {
        return fachada.criarComentario(id, dto);
    }
}
