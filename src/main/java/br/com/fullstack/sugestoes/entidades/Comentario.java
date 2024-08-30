package br.com.fullstack.sugestoes.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "sugestao_id", nullable = false)
    private Sugestao sugestao;

    @Column(nullable = false, length = 512)
    private String texto;

}
