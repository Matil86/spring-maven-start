package de.hipp.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
@Embeddable
public class RaceEntity extends BaseEntity {
    private String name;
}
