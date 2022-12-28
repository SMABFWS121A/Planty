package de.planty.hibernate.mapper;

import de.planty.gen.model.GenRoom;
import de.planty.hibernate.entity.EntityRoom;

public class RoomEntityMapper extends EntityMapperBase<EntityRoom, GenRoom> {

    private static RoomEntityMapper roomEntityMapper;

    @Override
    public GenRoom map(EntityRoom entity) {
        GenRoom genRoom = new GenRoom();
        genRoom.setId(entity.getId());
        genRoom.setName(entity.getName());
        genRoom.setDescription(entity.getDescription());
        return genRoom;
    }

    public RoomEntityMapper getInstance() {
        if(roomEntityMapper == null)
            roomEntityMapper = new RoomEntityMapper();
        return roomEntityMapper;
    }
}
