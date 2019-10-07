package io.github.futurewl.exe;

import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

public class MyProcessorDialect implements IProcessorDialect {

    public String getName() {
        return "JSTL";
    }

    public String getPrefix() {
        return null;
    }

    public int getDialectProcessorPrecedence() {
        return 0;
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> ps = new HashSet<IProcessor>();
        ps.add(new TestAttrProcessor());
        return ps;
    }

}
