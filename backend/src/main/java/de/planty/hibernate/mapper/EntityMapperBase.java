package de.planty.hibernate.mapper;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public abstract class EntityMapperBase<PE extends PanacheEntityBase, GEN> {

    public abstract GEN mapPanacheEntity(PE panacheEntity);
    public abstract PE mapGenEntity(GEN genEntity);

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

    public List<PE> listAllPanacheEntities() {
        return PE.listAll();
    }

    public List<GEN> listAllGenEntities() {
        return mapAllPanacheEntities(PE.listAll());
    }

}
