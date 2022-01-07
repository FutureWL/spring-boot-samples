package io.github.futurewl.exe;

import org.thymeleaf.dialect.IExecutionAttributeDialect;

import java.util.HashMap;
import java.util.Map;

public class MyExeAttrDialect implements IExecutionAttributeDialect {

    public String getName() {
        return "myUtil";
    }

    public Map<String, Object> getExecutionAttributes() {
        Map<String, Object> attrs = new HashMap<String, Object>();
        attrs.put("admin", "Angus");
        return attrs;
    }
}
