package io.github.futurewl.pre;

import io.github.futurewl.pre.processor.PreProcessorA;
import io.github.futurewl.pre.processor.PreProcessorB;
import org.thymeleaf.dialect.IPreProcessorDialect;
import org.thymeleaf.preprocessor.IPreProcessor;

import java.util.HashSet;
import java.util.Set;

public class MyPreDialect implements IPreProcessorDialect {

    public String getName() {
        return "Pre Dialect";
    }

    public int getDialectPreProcessorPrecedence() {
        return 0;
    }

    public Set<IPreProcessor> getPreProcessors() {
        // 添加两个预处理器
        Set<IPreProcessor> ps = new HashSet<IPreProcessor>();
        ps.add(new PreProcessorA());
        ps.add(new PreProcessorB());
        return ps;
    }
}
