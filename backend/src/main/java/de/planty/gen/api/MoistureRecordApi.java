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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface MoistureRecordApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all moisture records.", notes = "Retrieves all available moisture records.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenMoistureRecord.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class, responseContainer = "List") })
    List<GenMoistureRecord> moistureRecordGet();

    @DELETE
    @Path("/{moistureRecordId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single moisture record.", notes = "Deletes a single moisture record based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No moisture record with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void moistureRecordMoistureRecordIdDelete(@PathParam("moistureRecordId") @ApiParam("ID of the moisture record to access.") String moistureRecordId);

    @GET
    @Path("/{moistureRecordId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single moisture record.", notes = "Retrieves a single moisture record based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenMoistureRecord.class),
        @ApiResponse(code = 404, message = "No moisture record with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    GenMoistureRecord moistureRecordMoistureRecordIdGet(@PathParam("moistureRecordId") @ApiParam("ID of the moisture record to access.") String moistureRecordId);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a moisture record.", notes = "Create a new moisture record.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given moisture record was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void moistureRecordPost(@Valid GenMoistureRecordPayload genMoistureRecordPayload);
}
