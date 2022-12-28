package de.planty.hibernate.mapper;

import de.planty.gen.model.GenRoom;
import de.planty.hibernate.entity.EntityRoom;

public class RoomEntityMapper extends EntityMapperBase<EntityRoom, GenRoom> {

    private static RoomEntityMapper roomEntityMapper;

    @Override
    public GenRoom mapPanacheEntity(EntityRoom panacheEntity) {
        GenRoom genRoom = new GenRoom();
        genRoom.setId(panacheEntity.getId());
        genRoom.setName(panacheEntity.getName());
        genRoom.setDescription(panacheEntity.getDescription());
        return genRoom;
    }

    @Override
    public EntityRoom mapGenEntity(GenRoom genEntity) {
        EntityRoom entityRoom = new EntityRoom();
        entityRoom.setName(genEntity.getName());
        entityRoom.setDescription(genEntity.getDescription());
        return entityRoom;
    }

    public RoomEntityMapper getInstance() {
        if(roomEntityMapper == null)
            roomEntityMapper = new RoomEntityMapper();
        return roomEntityMapper;
    }
}
