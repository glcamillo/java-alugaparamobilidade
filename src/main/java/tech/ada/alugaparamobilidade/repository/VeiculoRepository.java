package tech.ada.alugaparamobilidade.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import tech.ada.alugaparamobilidade.model.Veiculo;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class VeiculoRepository implements VeiculoRepositoryInterface {

/*    @Override
    public Veiculo procurarPorPlaca(String placa) {
        return null;
    }*/

    @Override
    public void flush() {

    }

    @Override
    public <S extends Veiculo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Veiculo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Veiculo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Veiculo getOne(Long aLong) {
        return null;
    }

    @Override
    public Veiculo getById(Long aLong) {
        return null;
    }

    @Override
    public Veiculo getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Veiculo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Veiculo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Veiculo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Veiculo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Veiculo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Veiculo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Veiculo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Veiculo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Veiculo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Veiculo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Veiculo> findAll() {
        return null;
    }

    @Override
    public List<Veiculo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Veiculo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Veiculo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Veiculo> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Veiculo> findAll(Pageable pageable) {
        return null;
    }
}
