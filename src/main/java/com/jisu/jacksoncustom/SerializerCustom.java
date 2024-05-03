package com.jisu.jacksoncustom;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
// import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class SerializerCustom extends StdSerializer<Object> implements ContextualSerializer {
    SerializerType serializerType;

    protected SerializerCustom() {
        super(Object.class);
    }

    protected SerializerCustom(SerializerType serializerType) {
        super(Object.class);
        this.serializerType = serializerType;
    }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeObject(SerializerConverter.convert(serializerType, o));
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        // serializerProvider
        SerializerType serializerType = null;
        CustomSerializer customSerializer = null;
        if (beanProperty != null) {
            // if (beanProperty.getMember().hasAnnotation(CustomSerializer.class)) {
            //     serializerType = beanProperty.getMember().getAnnotation(CustomSerializer.class).value();
            // }
            customSerializer = beanProperty.getAnnotation(CustomSerializer.class);
        }

        if (customSerializer != null) {
            serializerType = customSerializer.value();
        }
        System.out.println("customSerializer 1= " + customSerializer);
        System.out.println("serializerType1 = " + serializerType);
        return new SerializerCustom(serializerType);
    }
}
