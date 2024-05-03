package com.jisu.jacksoncustom;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SerializerConverter {

    public static String convert(SerializerType serializerType, Object value) {
        System.out.println("value = " + value);
        switch (serializerType) {
            case TIME_SERIALIZER:
                System.out.println("serializerType = " + serializerType);
                return ZonedDateTime.ofInstant(Instant.ofEpochSecond((long) value), ZoneId.of("Asia/Seoul")).toLocalDateTime().toString();
            default:
                System.out.println("serializerType = " + serializerType);
                return null;
        }
    }
}
