package de.planty.api;

import de.planty.gen.api.PlantApi;
import de.planty.gen.model.GenPlant;
import de.planty.gen.model.GenPlantPayload;
import de.planty.hibernate.entity.EntityPlant;
import de.planty.hibernate.mapper.PlantEntityMapper;

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

        GenPlant genPlant = PlantEntityMapper.getInstance().map(entityPlant);
        return Response.ok(genPlant).build();
    }

    @Override
    public Response plantPost(GenPlantPayload genPlantPayload) {
        System.out.println("Test");
        System.out.println(genPlantPayload);
        return Response.ok().build();
    }
}
