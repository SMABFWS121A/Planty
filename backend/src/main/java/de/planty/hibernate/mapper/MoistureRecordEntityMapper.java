package de.planty.hibernate.mapper;

import de.planty.gen.model.GenMoistureRecord;
import de.planty.gen.model.GenMoistureRecordPayload;
import de.planty.hibernate.entity.EntityMoistureRecord;

import java.util.Date;

public class MoistureRecordEntityMapper extends EntityMapperBase<EntityMoistureRecord, GenMoistureRecord, GenMoistureRecordPayload> {

    private static MoistureRecordEntityMapper moistureRecordEntityMapper;

    @Override
    public GenMoistureRecord mapPanacheEntity(EntityMoistureRecord panacheEntity) {
        GenMoistureRecord genMoistureRecord = new GenMoistureRecord();
        genMoistureRecord.setId(panacheEntity.getId());
        genMoistureRecord.setTimestamp(panacheEntity.getTimestamp());
        genMoistureRecord.setHumidityLevel(panacheEntity.getHumidityLevel());
        genMoistureRecord.setPlantId(panacheEntity.getPlantId());
        return genMoistureRecord;
    }

    @Override
    public EntityMoistureRecord mapGenEntity(GenMoistureRecord genEntity) {
        EntityMoistureRecord entityMoistureRecord = new EntityMoistureRecord();
        entityMoistureRecord.setTimestamp(genEntity.getTimestamp());
        entityMoistureRecord.setHumidityLevel(genEntity.getHumidityLevel());
        entityMoistureRecord.setPlantId(genEntity.getPlantId());
        return entityMoistureRecord;
    }

    @Override
    public EntityMoistureRecord mapPayload(GenMoistureRecordPayload genMoistureRecordPayload) {
        EntityMoistureRecord entityMoistureRecord = new EntityMoistureRecord();
        entityMoistureRecord.setTimestamp(new Date());
        entityMoistureRecord.setHumidityLevel(genMoistureRecordPayload.getHumidityLevel());
        entityMoistureRecord.setPlantId(genMoistureRecordPayload.getPlantId());
        return entityMoistureRecord;
    }

    public static MoistureRecordEntityMapper getInstance(){
        if(moistureRecordEntityMapper == null)
            moistureRecordEntityMapper = new MoistureRecordEntityMapper();
        return moistureRecordEntityMapper;
    }
}
