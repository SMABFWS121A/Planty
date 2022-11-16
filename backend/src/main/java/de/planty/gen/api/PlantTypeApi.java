package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenPlantType;
import de.planty.gen.model.GenPlantTypePayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/plantType")
@Api(description = "the plantType API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class PlantTypeApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all plant types.", notes = "Retrieves all available plant types.", response = GenPlantType.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenPlantType.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response plantTypeGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{plantTypeId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single plant type.", notes = "Deletes a single plant type based on a given ID.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No plant type with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response plantTypePlantTypeIdDelete(@PathParam("plantTypeId") @ApiParam("ID of the plant type to access.") String plantTypeId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{plantTypeId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single plant type.", notes = "Retrieves a single plant type based on a given ID.", response = GenPlantType.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenPlantType.class),
        @ApiResponse(code = 404, message = "No plant type with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response plantTypePlantTypeIdGet(@PathParam("plantTypeId") @ApiParam("ID of the plant type to access.") String plantTypeId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a plant type.", notes = "Create a new plant type.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given plant type was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response plantTypePost(@Valid GenPlantTypePayload genPlantTypePayload) {
        return Response.ok().entity("magic!").build();
    }
}
