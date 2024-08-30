package br.com.fullstack.sugestoes.dto;

import br.com.fullstack.sugestoes.entidades.Sugestao;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@Schema(description = "Sugestões - Objeto de resposta")
public class SugestaoRespostaDto {

    @Schema(description = "ID da sugestão", example = "1")
    private Long id;

    @Schema(description = "Data que a sugestão foi enviada")
    private LocalDateTime dataEnvio;

    @Schema(description = "Data que a sugestão foi atualizada")
    private LocalDateTime dataAtualizacao;

    @Schema(description = "Título da sugestão", example = "Satisfeito com a Empresa")
    private String titulo;

    @Schema(description = "Descrição da sugestão", example = "A melhor empresa do mundo! MAASSSSS...")
    private String descricao;

    public SugestaoRespostaDto(Sugestao sugestao) {
        BeanUtils.copyProperties(sugestao, this);
    }
}
