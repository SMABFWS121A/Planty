package de.planty.api;

import de.planty.gen.api.PlantApi;
import de.planty.gen.model.GenPlantPayload;

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
        return Response.ok().build();
    }

    @Override
    public Response plantPost(GenPlantPayload genPlantPayload) {
        return Response.ok().build();
    }
}
