package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenPlant;
import de.planty.gen.model.GenPlantPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/plant")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface PlantApi {

    @GET
    @Produces({ "application/json" })
    Response plantGet();

    @DELETE
    @Path("/{plantId}")
    @Produces({ "application/json" })
    Response plantPlantIdDelete(@PathParam("plantId") String plantId);

    @GET
    @Path("/{plantId}")
    @Produces({ "application/json" })
    Response plantPlantIdGet(@PathParam("plantId") String plantId);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response plantPost(@Valid GenPlantPayload genPlantPayload);
}
