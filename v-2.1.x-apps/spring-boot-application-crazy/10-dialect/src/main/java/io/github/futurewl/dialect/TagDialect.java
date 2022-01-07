package io.github.futurewl.dialect;

import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

public class TagDialect implements IProcessorDialect {

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
        ps.add(new MyTagProcessor());
        return ps;
    }
}
