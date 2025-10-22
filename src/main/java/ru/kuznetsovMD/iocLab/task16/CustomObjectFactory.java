package ru.kuznetsovMD.iocLab.task16;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;

public class CustomObjectFactory implements FactoryBean<CustomObject> {
    @Override
    public @Nullable CustomObject getObject() throws Exception {
        return new CustomObject("Factory created bean object");
    }

    @Override
    public @Nullable Class<?> getObjectType() {
        return CustomObject.class;
    }
}
