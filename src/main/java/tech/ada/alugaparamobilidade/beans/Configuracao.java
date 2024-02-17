package tech.ada.alugaparamobilidade.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.ada.alugaparamobilidade.service.VeiculoService;

@Configuration
public class Configuracao {
    @Bean
    public VeiculoService veiculoService() {
        return new VeiculoService();
    }
}
