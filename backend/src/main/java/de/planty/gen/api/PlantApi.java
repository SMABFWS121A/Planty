package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenPlant;
import de.planty.gen.model.GenPlantPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/plant")
@Api(description = "the plant API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface PlantApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all plants.", notes = "Retrieves all available plants.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenPlant.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class, responseContainer = "List") })
    List<GenPlant> plantGet();

    @DELETE
    @Path("/{plantId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single plant.", notes = "Deletes a single plant based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No plant with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void plantPlantIdDelete(@PathParam("plantId") @ApiParam("ID of the plant to access.") String plantId);

    @GET
    @Path("/{plantId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single plant.", notes = "Retrieves a single plant based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenPlant.class),
        @ApiResponse(code = 404, message = "No plant with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    GenPlant plantPlantIdGet(@PathParam("plantId") @ApiParam("ID of the plant to access.") String plantId);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a plant.", notes = "Create a new plant.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given plant was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void plantPost(@Valid GenPlantPayload genPlantPayload);
}
