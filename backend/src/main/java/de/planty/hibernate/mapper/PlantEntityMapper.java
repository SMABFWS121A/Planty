package de.planty.hibernate.mapper;

import de.planty.gen.model.GenPlant;
import de.planty.hibernate.entity.EntityPlant;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.ArrayList;
import java.util.List;

public class PlantEntityMapper extends EntityMapperBase<EntityPlant, GenPlant> {

    private static PlantEntityMapper plantEntityMapper;

    @Override
    public GenPlant mapPanacheEntity(EntityPlant panacheEntity) {
        GenPlant genPlant = new GenPlant();
        genPlant.setId(panacheEntity.getId());
        genPlant.setName(panacheEntity.getName());
        genPlant.setDescription(panacheEntity.getDescription());
        genPlant.setPlantTypeId(panacheEntity.getPlantTypeId());
        genPlant.setSensorId(panacheEntity.getSensorId());
        genPlant.setRoomId(panacheEntity.getRoomId());
        return genPlant;
    }

    @Override
    public EntityPlant mapGenEntity(GenPlant genEntity) {
        EntityPlant entityPlant = new EntityPlant();
        entityPlant.setName(genEntity.getName());
        entityPlant.setDescription(genEntity.getDescription());
        entityPlant.setPlantTypeId(genEntity.getPlantTypeId());
        entityPlant.setSensorId(genEntity.getSensorId());
        entityPlant.setRoomId(genEntity.getRoomId());
        return entityPlant;
    }

    public static PlantEntityMapper getInstance() {
        if(plantEntityMapper == null)
            plantEntityMapper = new PlantEntityMapper();
        return plantEntityMapper;
    }
}
