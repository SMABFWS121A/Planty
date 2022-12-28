package de.planty.api;

import de.planty.gen.api.PlantApi;
import de.planty.gen.model.GenPlant;
import de.planty.gen.model.GenPlantPayload;
import de.planty.hibernate.entity.EntityPlant;
import de.planty.hibernate.mapper.EntityMapperBase;
import de.planty.hibernate.mapper.PlantEntityMapper;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public class PlantApiImpl implements PlantApi {

    @Override
    public Response plantGet() {
        return Response.ok().build();
    }

    @Override
    public Response plantPlantIdDelete(String plantId) {
        return Response.ok().build();
    }

    @Override
    public Response plantPlantIdGet(String plantId) {
        int id;
        try {
            id = Integer.parseInt(plantId);
        } catch (NumberFormatException exception)
        {
            return Response.status(500).entity("ID could not be parsed to an integer value").build();
        }

        EntityPlant entityPlant = EntityPlant.findById(id);
        if(entityPlant == null)
            return Response.status(500).entity("No plant found for given ID").build();

        GenPlant genPlant = PlantEntityMapper.getInstance().mapPanacheEntity(entityPlant);
        return Response.ok(genPlant).build();
    }

    @Override
    @Transactional
    public Response plantPost(GenPlantPayload genPlantPayload) {
        GenPlant genPlant = new GenPlant();
        genPlant.setId(0);
        genPlant.setName(genPlantPayload.getName());
        genPlant.setDescription(genPlantPayload.getDescription());
        genPlant.setPlantTypeId(genPlantPayload.getPlantTypeId());
        genPlant.setSensorId(genPlantPayload.getSensorId());
        genPlant.setRoomId(genPlantPayload.getRoomId());

        EntityPlant entityPlant = PlantEntityMapper.getInstance().mapGenEntity(genPlant);
        EntityPlant.persist(entityPlant);
        return Response.ok().build();
    }
}
