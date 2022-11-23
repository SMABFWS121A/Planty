package de.planty.hibernate.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.Valid;
import java.util.Date;

public class EntitySensor {

    @Id
    @SequenceGenerator(name = "guidelineSequence", sequenceName = "guideline_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guidelineSequence")
    private @Valid Integer id;
    private @Valid String name;
    private @Valid String description;
    private @Valid Integer humidityScalingFrom;
    private @Valid Integer humidityScalingTo;
    private @Valid Date lastCalibration;
    private @Valid Integer sleepTimeout;

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

    public Integer getHumidityScalingFrom() {
        return humidityScalingFrom;
    }

    public void setHumidityScalingFrom(Integer humidityScalingFrom) {
        this.humidityScalingFrom = humidityScalingFrom;
    }

    public Integer getHumidityScalingTo() {
        return humidityScalingTo;
    }

    public void setHumidityScalingTo(Integer humidityScalingTo) {
        this.humidityScalingTo = humidityScalingTo;
    }

    public Date getLastCalibration() {
        return lastCalibration;
    }

    public void setLastCalibration(Date lastCalibration) {
        this.lastCalibration = lastCalibration;
    }

    public Integer getSleepTimeout() {
        return sleepTimeout;
    }

    public void setSleepTimeout(Integer sleepTimeout) {
        this.sleepTimeout = sleepTimeout;
    }
}
