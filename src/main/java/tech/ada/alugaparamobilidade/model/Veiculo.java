package tech.ada.alugaparamobilidade.model;

import jakarta.persistence.*;
import java.util.Objects;

// Lombok provê getter e setters
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name= "tb_veiculo_teste")
@Getter
@Setter
@NoArgsConstructor
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;       // Dado de identificação

    @Column(unique = true, length = 10)
    private String placa;  // Dado de identificação

    // Dados para caracterização
    @Column(name="classe_carro", length = 50)
    private String classeCarro;  // compacto, compacto elétrico, econômico, executivo, suv
    @Column(length = 50)
    private String tipo;         // hatch, sedan, suv
    private String modelo;
    private String fabricante;

    // Dados fins locação
    private long quilometragem;
    private Boolean disponivel;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Veiculo))
            return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(this.id, veiculo.id) && Objects.equals(this.placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.placa, this.tipo);
    }

    @Override
    public String toString() {
        return "Veículo{" + "id=" + this.id + ", placa='" + this.placa + '\'' + ", tipo='" + this.tipo + '\'' + '}';
    }
}
