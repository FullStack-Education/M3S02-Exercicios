package br.com.fullstack.sugestoes.repositorios;

import br.com.fullstack.sugestoes.entidades.Sugestao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugestaoRepositorio extends JpaRepository<Sugestao, Long> {
}
