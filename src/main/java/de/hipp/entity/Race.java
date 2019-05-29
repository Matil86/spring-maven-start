package de.hipp.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
@Embeddable
public class Race extends BaseEntity {
    private String name;
}
