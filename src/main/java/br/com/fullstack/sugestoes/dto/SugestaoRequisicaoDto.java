package br.com.fullstack.sugestoes.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Schema(description = "Sugestões - Objeto para criação")
public class SugestaoRequisicaoDto {

    @NotBlank
    @Schema(description = "Título da sugestão", example = "Satisfeito com a Empresa")
    private String titulo;

    @Schema(description = "Descrição da sugestão", example = "A melhor empresa do mundo! MAASSSSS...")
    private String descricao;

}
