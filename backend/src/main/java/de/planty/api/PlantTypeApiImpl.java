package de.planty.api;

import de.planty.gen.api.PlantTypeApi;
import de.planty.gen.model.GenPlantTypePayload;

import javax.ws.rs.core.Response;

public class PlantTypeApiImpl implements PlantTypeApi {

    @Override
    public Response plantTypeGet() {
        return Response.ok().build();
    }

    @Override
    public Response plantTypePlantTypeIdDelete(String plantTypeId) {
        return Response.ok().build();
    }

    @Override
    public Response plantTypePlantTypeIdGet(String plantTypeId) {
        return Response.ok().build();
    }

    @Override
    public Response plantTypePost(GenPlantTypePayload genPlantTypePayload) {
        return Response.ok().build();
    }
}
