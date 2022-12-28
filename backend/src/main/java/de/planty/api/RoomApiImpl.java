package de.planty.api;

import de.planty.gen.api.RoomApi;
import de.planty.gen.model.GenRoomPayload;

import javax.ws.rs.core.Response;

public class RoomApiImpl implements RoomApi {

    @Override
    public Response roomGet() {
        return Response.ok().build();
    }

    @Override
    public Response roomPost(GenRoomPayload genRoomPayload) {
        return Response.ok().build();
    }

    @Override
    public Response roomRoomIdDelete(String roomId) {
        return Response.ok().build();
    }

    @Override
    public Response roomRoomIdGet(String roomId) {
        return Response.ok().build();
    }
}
