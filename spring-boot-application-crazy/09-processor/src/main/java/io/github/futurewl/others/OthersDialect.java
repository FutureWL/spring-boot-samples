package io.github.futurewl.others;

import io.github.futurewl.others.process.MyCommentProcessor;
import io.github.futurewl.others.process.MyTextProcessor;
import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

public class OthersDialect implements IProcessorDialect {

    public String getName() {
        return "Crazy Dialect";
    }

    public String getPrefix() {
        return "crazy";
    }

    public int getDialectProcessorPrecedence() {
        return 0;
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> ps = new HashSet<IProcessor>();
        ps.add(new MyCommentProcessor());
        ps.add(new MyTextProcessor());
        return ps;
    }

}
