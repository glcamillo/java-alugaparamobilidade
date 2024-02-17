package tech.ada.alugaparamobilidade.service;

import jakarta.persistence.Query;
import tech.ada.alugaparamobilidade.model.Veiculo;

import java.util.List;

// LÓGICA do sistema através de interface
public interface VeiculoServiceInterface {
    public Veiculo criarVeiculo(Veiculo veiculo);
    public Veiculo alterarVeiculo(Veiculo veiculo);
    public List<Veiculo> listarTodos();
    public Veiculo buscarVeiculoPorId(Long id);
    public Veiculo buscarVeiculoPorPlaca(String placa);
    // TODO TODO
    // Implementação da busca por placa
    // public Query createQuery(String query);
}
