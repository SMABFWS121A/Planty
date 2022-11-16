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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class RoomApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all rooms.", notes = "Retrieves all available rooms.", response = GenRoom.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenRoom.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response roomGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a room.", notes = "Create a new room.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given room was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response roomPost(@Valid GenRoomPayload genRoomPayload) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{roomId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single plant type.", notes = "Deletes a single room based on a given ID.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No room with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response roomRoomIdDelete(@PathParam("roomId") @ApiParam("ID of the room to access.") String roomId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{roomId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single room.", notes = "Retrieves a single room based on a given ID.", response = GenRoom.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenRoom.class),
        @ApiResponse(code = 404, message = "No room with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response roomRoomIdGet(@PathParam("roomId") @ApiParam("ID of the room to access.") String roomId) {
        return Response.ok().entity("magic!").build();
    }
}
