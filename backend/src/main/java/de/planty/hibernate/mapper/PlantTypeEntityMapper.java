package de.planty.hibernate.mapper;

import de.planty.gen.model.GenPlantType;
import de.planty.hibernate.entity.EntityPlantType;

public class PlantTypeEntityMapper extends EntityMapperBase<EntityPlantType, GenPlantType> {

    private PlantTypeEntityMapper plantTypeEntityMapper;

    @Override
    public GenPlantType map(EntityPlantType entity) {
        GenPlantType genPlantType = new GenPlantType();
        genPlantType.setId(entity.getId());
        genPlantType.setName(entity.getName());
        genPlantType.setDescription(entity.getDescription());
        genPlantType.setMinHumidityLevel(entity.getMinHumidityLevel());
        return genPlantType;
    }

    @Override
    public EntityMapperBase<EntityPlantType, GenPlantType> getInstance() {
        if(plantTypeEntityMapper == null)
            plantTypeEntityMapper = new PlantTypeEntityMapper();
        return plantTypeEntityMapper;
    }
}
