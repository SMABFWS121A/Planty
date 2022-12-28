package de.planty.hibernate.mapper;

import de.planty.gen.model.GenPlantType;
import de.planty.hibernate.entity.EntityPlantType;

public class PlantTypeEntityMapper extends EntityMapperBase<EntityPlantType, GenPlantType> {

    private static PlantTypeEntityMapper plantTypeEntityMapper;

    @Override
    public GenPlantType map(EntityPlantType entity) {
        GenPlantType genPlantType = new GenPlantType();
        genPlantType.setId(entity.getId());
        genPlantType.setName(entity.getName());
        genPlantType.setDescription(entity.getDescription());
        genPlantType.setMinHumidityLevel(entity.getMinHumidityLevel());
        return genPlantType;
    }

    public static PlantTypeEntityMapper getInstance() {
        if(plantTypeEntityMapper == null)
            plantTypeEntityMapper = new PlantTypeEntityMapper();
        return plantTypeEntityMapper;
    }
}
