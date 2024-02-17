package tech.ada.alugaparamobilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.ada.alugaparamobilidade.model.Veiculo;

@Repository
public interface VeiculoRepositoryInterface extends JpaRepository<Veiculo, Long> {
    // Veiculo procurarPorPlaca(String placa);
}


