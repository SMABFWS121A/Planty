package de.planty.hibernate.mapper;

import de.planty.gen.model.GenPlant;
import de.planty.hibernate.entity.EntityPlant;

import java.util.ArrayList;
import java.util.List;

public class PlantEntityMapper extends EntityMapperBase<EntityPlant, GenPlant> {

    private PlantEntityMapper plantEntityMapper;

    @Override
    public GenPlant map(EntityPlant entity) {
        GenPlant genPlant = new GenPlant();
        genPlant.setId(entity.getId());
        genPlant.setName(entity.getName());
        genPlant.setDescription(entity.getDescription());
        genPlant.setPlantTypeId(entity.getPlantTypeId());
        genPlant.setSensorId(entity.getSensorId());
        genPlant.setRoomId(entity.getRoomId());
        return genPlant;
    }

    @Override
    public EntityMapperBase<EntityPlant, GenPlant> getInstance() {
        if(plantEntityMapper == null)
            plantEntityMapper = new PlantEntityMapper();
        return plantEntityMapper;
    }
}
