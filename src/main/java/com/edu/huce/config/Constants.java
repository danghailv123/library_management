package com.edu.huce.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Constants {
    public static ObjectMapper SERIALIZER = new ObjectMapper();


    static {
        SERIALIZER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        SERIALIZER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        SERIALIZER.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }
}
