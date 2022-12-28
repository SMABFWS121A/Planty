package de.planty.hibernate.mapper;

import de.planty.gen.model.GenPlantType;
import de.planty.hibernate.entity.EntityPlant;
import de.planty.hibernate.entity.EntityPlantType;

public class PlantTypeEntityMapper extends EntityMapperBase<EntityPlantType, GenPlantType> {

    private static PlantTypeEntityMapper plantTypeEntityMapper;

    @Override
    public GenPlantType mapPanacheEntity(EntityPlantType panacheEntity) {
        GenPlantType genPlantType = new GenPlantType();
        genPlantType.setId(panacheEntity.getId());
        genPlantType.setName(panacheEntity.getName());
        genPlantType.setDescription(panacheEntity.getDescription());
        genPlantType.setMinHumidityLevel(panacheEntity.getMinHumidityLevel());
        return genPlantType;
    }

    @Override
    public EntityPlantType mapGenEntity(GenPlantType genEntity) {
        EntityPlantType entityPlantType = new EntityPlantType();
        entityPlantType.setName(genEntity.getName());
        entityPlantType.setDescription(genEntity.getDescription());
        entityPlantType.setMinHumidityLevel(genEntity.getMinHumidityLevel());
        return entityPlantType;
    }

    public static PlantTypeEntityMapper getInstance() {
        if(plantTypeEntityMapper == null)
            plantTypeEntityMapper = new PlantTypeEntityMapper();
        return plantTypeEntityMapper;
    }
}
