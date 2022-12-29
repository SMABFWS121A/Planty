package de.planty.hibernate.mapper;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityMapperBase<PE extends PanacheEntityBase, GEN, PAYLOAD> {

    public abstract GEN mapPanacheEntity(PE panacheEntity);
    public abstract PE mapGenEntity(GEN genEntity);
    public abstract PE mapPayload(PAYLOAD payload);

    public List<GEN> mapAllPanacheEntities(List<PE> panacheEntities) {
        List<GEN> genEntities = new ArrayList<>();
        for (PE panacheEntity : panacheEntities)
            genEntities.add(mapPanacheEntity(panacheEntity));
        return genEntities;
    }

    public List<PE> mapAllGenEntities(List<GEN> genEntities) {
        List<PE> panacheEntities = new ArrayList<>();
        for (GEN genEntity : genEntities)
            panacheEntities.add(mapGenEntity(genEntity));
        return panacheEntities;
    }

    public List<PE> mapAllPayloads(List<PAYLOAD> payloads) {
        List<PE> panacheEntities = new ArrayList<>();
        for (PAYLOAD payload : payloads)
            panacheEntities.add(mapPayload(payload));
        return panacheEntities;
    }

}
