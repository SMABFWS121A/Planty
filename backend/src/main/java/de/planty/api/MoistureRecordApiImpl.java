package de.planty.api;

import de.planty.gen.api.MoistureRecordApi;
import de.planty.gen.model.GenMoistureRecordPayload;

import javax.ws.rs.core.Response;

public class MoistureRecordApiImpl implements MoistureRecordApi {

    @Override
    public Response moistureRecordGet() {
        return Response.ok().build();
    }

    @Override
    public Response moistureRecordMoistureRecordIdDelete(String moistureRecordId) {
        return Response.ok().build();
    }

    @Override
    public Response moistureRecordMoistureRecordIdGet(String moistureRecordId) {
        return Response.ok().build();
    }

    @Override
    public Response moistureRecordPost(GenMoistureRecordPayload genMoistureRecordPayload) {
        return Response.ok().build();
    }
}
