package de.planty.api;

import de.planty.gen.api.MoistureRecordApi;
import de.planty.gen.model.GenMoistureRecord;
import de.planty.gen.model.GenMoistureRecordPayload;
import de.planty.hibernate.entity.EntityMoistureRecord;
import de.planty.hibernate.mapper.MoistureRecordEntityMapper;
import de.planty.util.ErrorResponseBuilder;

import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.List;

public class MoistureRecordApiImpl implements MoistureRecordApi {

    @Override
    public Response moistureRecordGet() {
        List<GenMoistureRecord> genMoistureRecords = MoistureRecordEntityMapper.getInstance().mapAllPanacheEntities(EntityMoistureRecord.listAll());
        return Response
                .ok()
                .entity(genMoistureRecords)
                .build();
    }

    @Override
    @Transactional
    public Response moistureRecordMoistureRecordIdDelete(String moistureRecordId) {
        int id;
        try {
            id = Integer.parseInt(moistureRecordId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("moistureRecordId could not be parsed to an integer value.")
                    .build();
        }

        EntityMoistureRecord entityMoistureRecord = EntityMoistureRecord.findById(id);
        if(entityMoistureRecord == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No moisture record found for moistureRecordId %s", moistureRecordId))
                    .build();

        entityMoistureRecord.delete();
        return Response.ok().build();
    }

    @Override
    public Response moistureRecordMoistureRecordIdGet(String moistureRecordId) {
        int id;
        try {
            id = Integer.parseInt(moistureRecordId);
        } catch(NumberFormatException exception) {
            return new ErrorResponseBuilder()
                    .setMessage("moistureRecordId could not be parsed to an integer value.")
                    .build();
        }

        EntityMoistureRecord entityMoistureRecord = EntityMoistureRecord.findById(id);
        if(entityMoistureRecord == null)
            return new ErrorResponseBuilder()
                    .setStatusCode(404)
                    .setMessage(String.format("No moisture record found for moistureRecordId %s", moistureRecordId))
                    .build();

        return Response
                .ok()
                .entity(entityMoistureRecord)
                .build();
    }

    @Override
    public Response moistureRecordPost(GenMoistureRecordPayload genMoistureRecordPayload) {
        EntityMoistureRecord entityMoistureRecord = MoistureRecordEntityMapper.getInstance().mapPayload(genMoistureRecordPayload);
        entityMoistureRecord.persist();
        return Response
                .ok()
                .build();
    }
}
