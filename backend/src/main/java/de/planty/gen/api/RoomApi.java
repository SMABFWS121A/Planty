package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenRoom;
import de.planty.gen.model.GenRoomPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/room")
@Api(description = "the room API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface RoomApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all rooms.", notes = "Retrieves all available rooms.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenRoom.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class, responseContainer = "List") })
    List<GenRoom> roomGet();

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a room.", notes = "Create a new room.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given room was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void roomPost(@Valid GenRoomPayload genRoomPayload);

    @DELETE
    @Path("/{roomId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single plant type.", notes = "Deletes a single room based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No room with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    void roomRoomIdDelete(@PathParam("roomId") @ApiParam("ID of the room to access.") String roomId);

    @GET
    @Path("/{roomId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single room.", notes = "Retrieves a single room based on a given ID.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenRoom.class),
        @ApiResponse(code = 404, message = "No room with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class) })
    GenRoom roomRoomIdGet(@PathParam("roomId") @ApiParam("ID of the room to access.") String roomId);
}
