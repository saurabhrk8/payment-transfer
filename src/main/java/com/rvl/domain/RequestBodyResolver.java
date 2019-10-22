package com.rvl.domain;

import com.sun.media.sound.InvalidFormatException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class RequestBodyResolver {
    public <T> T resolve(String content, Class<T> clazz) throws InvalidFormatException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(content, clazz);
        } catch (IOException e) {
            String message = e.getMessage();
            String[] split = e.getMessage().split("\n");
            if (split.length > 0) {
                message = split[0];
            }

            throw new InvalidFormatException();
        }
    }
}
