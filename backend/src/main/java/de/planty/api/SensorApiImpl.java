package de.planty.api;

import de.planty.gen.api.SensorApi;
import de.planty.gen.model.GenSensorConfigurationPayload;
import de.planty.gen.model.GenSensorPayload;

import javax.ws.rs.core.Response;

public class SensorApiImpl implements SensorApi {

    @Override
    public Response sensorGet() {
        return Response.ok().build();
    }

    @Override
    public Response sensorPost(GenSensorPayload genSensorPayload) {
        return Response.ok().build();
    }

    @Override
    public Response sensorSensorIdDelete(String sensorId) {
        return Response.ok().build();
    }

    @Override
    public Response sensorSensorIdGet(String sensorId) {
        return Response.ok().build();
    }

    @Override
    public Response sensorSensorIdPut(String sensorId, GenSensorConfigurationPayload genSensorConfigurationPayload) {
        return Response.ok().build();
    }
}
