package org.crazyi.boot.c3;

import org.crazyi.boot.c3.value.ValueProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropController {

    @Autowired
    private MyProp prop;

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public MyProp hello() {
        return prop;
    }


    @Autowired
    private ValueProp valueProp;

    @GetMapping(value = "/value", produces = MediaType.APPLICATION_JSON_VALUE)
    public ValueProp value() {
        return valueProp;
    }

}
