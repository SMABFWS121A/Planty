package de.planty.hibernate.mapper;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityMapperBase<I extends PanacheEntityBase, O> {

    public abstract O map(I entity);

    public List<O> mapAll(List<I> entities) {
        List<O> mappedEntities = new ArrayList<>();
        for (I entity : entities)
            mappedEntities.add(map(entity));
        return mappedEntities;
    }

    public List<O> listAll() {
        return mapAll(I.listAll());
    }

    public abstract EntityMapperBase<I, O> getInstance();
}
