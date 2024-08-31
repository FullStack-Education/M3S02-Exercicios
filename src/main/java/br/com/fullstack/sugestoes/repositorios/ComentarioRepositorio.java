package br.com.fullstack.sugestoes.repositorios;

import br.com.fullstack.sugestoes.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long> {

    List<Comentario> findBySugestaoIdOrderByDataEnvioDesc(Long sugestaoId);

}
