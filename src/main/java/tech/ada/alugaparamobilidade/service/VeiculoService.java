package tech.ada.alugaparamobilidade.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import tech.ada.alugaparamobilidade.repository.VeiculoRepositoryInterface;
import tech.ada.alugaparamobilidade.model.Veiculo;

@Service
public class VeiculoService implements VeiculoServiceInterface {
    @Autowired
    private VeiculoRepositoryInterface veiculoRepository;

    // o retorno permite que o chamador receba o respectivo
    //    número de identificação
    @Override
    public Veiculo criarVeiculo(Veiculo veiculo){
        // Veículo será salvo
        return veiculoRepository.save(veiculo);
    }
    @Override
    public Veiculo alterarVeiculo(Veiculo veiculo) {
        // TODO testar o retorno do ID
        Veiculo veiculoBD = this.buscarVeiculoPorId(veiculo.getId());

        Veiculo veiculoNovo = new Veiculo();

        // Atualiza o campo Id a partir do BD
        veiculoNovo.setId(veiculoBD.getId());

        // Atualiza todos os campos com dados de usuário
        veiculoNovo.setModelo(veiculo.getModelo());
        veiculoNovo.setPlaca(veiculo.getPlaca());
        veiculoNovo.setTipo(veiculo.getTipo());
        veiculoNovo.setDisponivel(veiculo.getDisponivel());
        veiculoNovo.setFabricante(veiculo.getFabricante());
        veiculoNovo.setClasseCarro(veiculo.getClasseCarro());
        veiculoNovo.setQuilometragem(((Long) veiculo.getQuilometragem()));

        return this.veiculoRepository.save(veiculoNovo);
    }
    @Override
    public Veiculo buscarVeiculoPorId(Long id) {
        Optional<Veiculo> optionalVeiculo = this.veiculoRepository.findById(id);
        if(optionalVeiculo.isPresent()) {
            return optionalVeiculo.get();
        } else {
            return null;
        }
    }
    @Override
    public List<Veiculo> listarTodos() {
        return this.veiculoRepository.findAll();
    }

    public void deletarVeiculo(Long id) {
        this.veiculoRepository.deleteById(id);
    }
    @Override
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return new Veiculo();
        // return this.veiculoRepository.procurarPorPlaca(placa);
    }
    // TODO TODO
    // Implementação da busca por placa
    /*
    public Query createQuery(String query) {
        retun this.veiculoRepository.
    }
     */
}
