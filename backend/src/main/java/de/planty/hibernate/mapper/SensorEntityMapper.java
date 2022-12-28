package de.planty.hibernate.mapper;

import de.planty.gen.model.GenSensor;
import de.planty.hibernate.entity.EntitySensor;

public class SensorEntityMapper extends EntityMapperBase<EntitySensor, GenSensor> {

    private static SensorEntityMapper sensorEntityMapper;

    @Override
    public GenSensor map(EntitySensor entity) {
        GenSensor genSensor = new GenSensor();
        genSensor.setId(entity.getId());
        genSensor.setName(entity.getName());
        genSensor.setDescription(entity.getDescription());
        genSensor.setHumidityScalingFrom(entity.getHumidityScalingFrom());
        genSensor.setHumidityScalingTo(entity.getHumidityScalingTo());
        genSensor.setLastCalibration(entity.getLastCalibration());
        genSensor.setSleepTimeout(entity.getSleepTimeout());
        return genSensor;
    }

    public SensorEntityMapper getInstance() {
        if(sensorEntityMapper == null)
            sensorEntityMapper = new SensorEntityMapper();
        return sensorEntityMapper;
    }
}
