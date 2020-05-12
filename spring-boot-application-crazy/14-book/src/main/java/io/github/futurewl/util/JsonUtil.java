package io.github.futurewl.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtil {

    /**
     * 将JSON转换为集合
     */
    public static List fromJson(String json, Class itemClass) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JavaType javaType = mapper.getTypeFactory()
                    .constructParametricType(List.class, itemClass);
            return mapper.readValue(json, javaType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
