package de.hipp.repo;

import de.hipp.entity.RaceEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RaceDao implements JpaRepository<RaceEntity, Integer> {
    @Override
    public List<RaceEntity> findAll() {
        return null;
    }

    @Override
    public List<RaceEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<RaceEntity> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public <S extends RaceEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends RaceEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<RaceEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public RaceEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends RaceEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends RaceEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<RaceEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RaceEntity> S save(S s) {
        return null;
    }

    @Override
    public Optional<RaceEntity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public long count() {
        return this.findAll().size();
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(RaceEntity raceEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends RaceEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends RaceEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RaceEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RaceEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RaceEntity> boolean exists(Example<S> example) {
        return false;
    }
}
