package de.planty.hibernate.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.Valid;

public class EntityPlantType {

    @Id
    @SequenceGenerator(name = "guidelineSequence", sequenceName = "guideline_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guidelineSequence")
    private @Valid Integer id;
    private @Valid String name;
    private @Valid String description;
    private @Valid Integer minHumidityLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMinHumidityLevel() {
        return minHumidityLevel;
    }

    public void setMinHumidityLevel(Integer minHumidityLevel) {
        this.minHumidityLevel = minHumidityLevel;
    }
}
