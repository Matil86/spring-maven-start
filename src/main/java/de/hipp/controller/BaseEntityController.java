package de.hipp.controller;

import de.hipp.entity.BaseEntity;
import java.util.List;


public interface BaseEntityController <T extends BaseEntity> {

    List<T> findAll();

    T findByID(Integer Id);

    T saveEntity(T race);
}
