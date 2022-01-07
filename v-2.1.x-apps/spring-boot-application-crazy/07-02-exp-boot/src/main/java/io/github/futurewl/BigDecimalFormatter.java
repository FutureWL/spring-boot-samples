package io.github.futurewl;

import org.springframework.format.Formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

public class BigDecimalFormatter implements Formatter<BigDecimal> {

    @Override
    public String print(BigDecimal object, Locale locale) {
        return "$" + object.toString() + "$";
    }

    @Override
    public BigDecimal parse(String text, Locale locale) throws ParseException {
        return null;
    }
}
