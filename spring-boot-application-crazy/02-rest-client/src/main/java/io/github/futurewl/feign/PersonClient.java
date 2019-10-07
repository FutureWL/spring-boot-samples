package io.github.futurewl.feign;

import feign.Param;
import feign.RequestLine;
import io.github.futurewl.Person;

/**
 * Feign客户端接口
 *
 * @author 杨恩雄
 */
public interface PersonClient {

    @RequestLine("GET /person/{name}")
    Person getPerson(@Param("name") String name);

}
