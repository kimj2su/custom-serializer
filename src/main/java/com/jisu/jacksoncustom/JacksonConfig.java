package com.jisu.jacksoncustom;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class JacksonConfig {

    // @Bean
    // public ObjectMapper customObjectMapper() {
    //     ObjectMapper objectMapper = new ObjectMapper();
    //     SimpleModule simpleModule = new SimpleModule();
    //     simpleModule.addSerializer(new SerializerCustom());
    //     objectMapper.registerModule(simpleModule);
    //     return objectMapper;
    // }

    // @Bean
    // public Module customSerializerModule() {
    //     return new Module() {
    //         @Override
    //         public String getModuleName() {
    //             return "customSerializerModule";
    //         }
    //
    //         @Override
    //         public Version version() {
    //             return Version.unknownVersion();
    //         }
    //
    //         @Override
    //         public void setupModule(SetupContext setupContext) {
    //             setupContext.addSerializers(new Serializers.Base() {
    //
    //                 @Override
    //                 public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
    //                     System.out.println("type = " + type);
    //
    //                     return super.findSerializer(config, type, beanDesc);
    //                 }
    //             });
    //         }
    //     };
    // }
}
