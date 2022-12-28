package de.planty.hibernate.mapper;

import de.planty.gen.model.GenSensor;
import de.planty.hibernate.entity.EntitySensor;

public class SensorEntityMapper extends EntityMapperBase<EntitySensor, GenSensor> {

    private static SensorEntityMapper sensorEntityMapper;

    @Override
    public GenSensor mapPanacheEntity(EntitySensor panacheEntity) {
        GenSensor genSensor = new GenSensor();
        genSensor.setId(panacheEntity.getId());
        genSensor.setName(panacheEntity.getName());
        genSensor.setDescription(panacheEntity.getDescription());
        genSensor.setHumidityScalingFrom(panacheEntity.getHumidityScalingFrom());
        genSensor.setHumidityScalingTo(panacheEntity.getHumidityScalingTo());
        genSensor.setLastCalibration(panacheEntity.getLastCalibration());
        genSensor.setSleepTimeout(panacheEntity.getSleepTimeout());
        return genSensor;
    }

    @Override
    public EntitySensor mapGenEntity(GenSensor genEntity) {
        EntitySensor entitySensor = new EntitySensor();
        entitySensor.setName(genEntity.getName());
        entitySensor.setDescription(genEntity.getDescription());
        entitySensor.setHumidityScalingFrom(genEntity.getHumidityScalingFrom());
        entitySensor.setHumidityScalingTo(genEntity.getHumidityScalingTo());
        entitySensor.setLastCalibration(genEntity.getLastCalibration());
        entitySensor.setSleepTimeout(genEntity.getSleepTimeout());
        return entitySensor;
    }

    public SensorEntityMapper getInstance() {
        if(sensorEntityMapper == null)
            sensorEntityMapper = new SensorEntityMapper();
        return sensorEntityMapper;
    }
}
