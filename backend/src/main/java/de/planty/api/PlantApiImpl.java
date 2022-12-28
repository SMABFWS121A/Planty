package de.planty.api;

import de.planty.gen.api.PlantApi;
import de.planty.gen.model.GenPlant;
import de.planty.gen.model.GenPlantPayload;
import de.planty.hibernate.entity.EntityPlant;
import de.planty.hibernate.mapper.PlantEntityMapper;
import de.planty.util.ErrorResponseBuilder;

import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;

public class PlantApiImpl implements PlantApi {

    @Override
    public Response plantGet() {
        List<GenPlant> genPlants = PlantEntityMapper.getInstance().mapAllPanacheEntities(EntityPlant.listAll());
        return Response
                .ok()
                .entity(genPlants)
                .build();
    }

    @Override
    @Transactional
    public Response plantPlantIdDelete(String plantId) {
        int id;
        try {
            id = Integer.parseInt(plantId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("plantId could not be parsed to an integer value.")
                    .build();
        }

        EntityPlant entityPlant = EntityPlant.findById(id);
        if(entityPlant == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No plant found for plantId %s", plantId))
                    .build();

        entityPlant.delete();
        return Response
                .ok()
                .build();
    }

    @Override
    public Response plantPlantIdGet(String plantId) {
        int id;
        try {
            id = Integer.parseInt(plantId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("plantId could not be parsed to an integer value.")
                    .build();
        }

        EntityPlant entityPlant = EntityPlant.findById(id);
        if(entityPlant == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No plant found for plantId %s", plantId))
                    .build();

        GenPlant genPlant = PlantEntityMapper.getInstance().mapPanacheEntity(entityPlant);
        return Response
                .ok()
                .entity(genPlant)
                .build();
    }

    @Override
    @Transactional
    public Response plantPost(GenPlantPayload genPlantPayload) {
        EntityPlant entityPlant = PlantEntityMapper.getInstance().mapPayload(genPlantPayload);
        entityPlant.persist();
        return Response
                .ok()
                .build();
    }
}
