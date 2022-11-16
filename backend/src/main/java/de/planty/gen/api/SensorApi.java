package de.planty.gen.api;

import de.planty.gen.model.GenErrorMessage;
import de.planty.gen.model.GenSensor;
import de.planty.gen.model.GenSensorConfigurationPayload;
import de.planty.gen.model.GenSensorPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/sensor")
@Api(description = "the sensor API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class SensorApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all sensors.", notes = "Retrieves all available sensors.", response = GenSensor.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenSensor.class, responseContainer = "List"),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response sensorGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Post a sensor.", notes = "Create a new sensor.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given sensor was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response sensorPost(@Valid GenSensorPayload genSensorPayload) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{sensorId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a single sensor.", notes = "Deletes a single sensor based on a given ID.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 404, message = "No sensor with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response sensorSensorIdDelete(@PathParam("sensorId") @ApiParam("ID of the sensor to access.") String sensorId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{sensorId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a single sensor.", notes = "Retrieves a single sensor based on a given ID.", response = GenSensor.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenSensor.class),
        @ApiResponse(code = 404, message = "No sensor with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response sensorSensorIdGet(@PathParam("sensorId") @ApiParam("ID of the sensor to access.") String sensorId) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{sensorId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Put a single sensor.", notes = "Updates a sensors configuration.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "The given sensor was invalid.", response = GenErrorMessage.class),
        @ApiResponse(code = 404, message = "No sensor with the given ID was found.", response = GenErrorMessage.class),
        @ApiResponse(code = 503, message = "The service is unavailable.", response = GenErrorMessage.class)
    })
    public Response sensorSensorIdPut(@PathParam("sensorId") @ApiParam("ID of the sensor to access.") String sensorId,@Valid GenSensorConfigurationPayload genSensorConfigurationPayload) {
        return Response.ok().entity("magic!").build();
    }
}
