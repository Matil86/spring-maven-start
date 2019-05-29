package de.hipp.service;

import de.hipp.entity.BaseEntity;
import java.util.List;


public interface BaseService <T extends BaseEntity> {

    List<T> findAll();

    T findByID(Integer Id);

    T saveEntity(T race);
}
