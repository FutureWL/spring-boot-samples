package io.github.futurewl.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:54
 * @version 1.0
 */
public class XmlBuilder {

    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws JAXBException, IOException {
        Object xmlObject = null;
        Reader reader = null;

        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);
        if (null != reader) {
            reader.close();
        }
        return xmlObject;
    }
}
