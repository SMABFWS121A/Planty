package de.planty.api;

import de.planty.gen.api.PlantTypeApi;
import de.planty.gen.model.GenPlantType;
import de.planty.gen.model.GenPlantTypePayload;
import de.planty.hibernate.entity.EntityPlantType;
import de.planty.hibernate.mapper.PlantTypeEntityMapper;
import de.planty.util.ErrorResponseBuilder;

import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;

public class PlantTypeApiImpl implements PlantTypeApi {

    @Override
    public Response plantTypeGet() {
        List<GenPlantType> genPlantTypes = PlantTypeEntityMapper.getInstance().mapAllPanacheEntities(EntityPlantType.listAll());
        return Response
                .ok()
                .entity(genPlantTypes)
                .build();
    }

    @Override
    @Transactional
    public Response plantTypePlantTypeIdDelete(String plantTypeId) {
        int id;
        try {
            id = Integer.parseInt(plantTypeId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("plantTypeId could not be parsed to an integer value.")
                    .build();
        }

        EntityPlantType entityPlantType = EntityPlantType.findById(id);
        if(entityPlantType == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No plant type found for plantTypeId %s", plantTypeId))
                    .build();

        entityPlantType.delete();
        return Response
                .ok()
                .build();
    }

    @Override
    public Response plantTypePlantTypeIdGet(String plantTypeId) {
        int id;
        try {
            id = Integer.parseInt(plantTypeId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("plantTypeId could not be parsed to an integer value.")
                    .build();
        }

        EntityPlantType entityPlantType = EntityPlantType.findById(id);
        if(entityPlantType == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No plant type found for plantTypeId %s", plantTypeId))
                    .build();

        GenPlantType genPlantType = PlantTypeEntityMapper.getInstance().mapPanacheEntity(entityPlantType);

        return Response
                .ok()
                .entity(genPlantType)
                .build();
    }

    @Override
    @Transactional
    public Response plantTypePost(GenPlantTypePayload genPlantTypePayload) {
        EntityPlantType entityPlantType = PlantTypeEntityMapper.getInstance().mapPayload(genPlantTypePayload);
        entityPlantType.persist();
        return Response
                .ok()
                .build();
    }
}
