package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenMoistureRecord;
import de.planty.gen.model.GenMoistureRecordPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/moistureRecord")
@Api(description = "the moistureRecord API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class MoistureRecordApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all moisture records.", notes = "Retrieves all available moisture records.", response = GenMoistureRecord.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenMoistureRecord.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response moistureRecordGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{moistureRecordId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single moisture record.", notes = "Deletes a single moisture record based on a given ID.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No moisture record with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response moistureRecordMoistureRecordIdDelete(@PathParam("moistureRecordId") @ApiParam("ID of the moisture record to access.") String moistureRecordId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{moistureRecordId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single moisture record.", notes = "Retrieves a single moisture record based on a given ID.", response = GenMoistureRecord.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenMoistureRecord.class),
        @ApiResponse(code = 404, message = "No moisture record with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response moistureRecordMoistureRecordIdGet(@PathParam("moistureRecordId") @ApiParam("ID of the moisture record to access.") String moistureRecordId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a moisture record.", notes = "Create a new moisture record.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given moisture record was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response moistureRecordPost(@Valid GenMoistureRecordPayload genMoistureRecordPayload) {
        return Response.ok().entity("magic!").build();
    }
}
