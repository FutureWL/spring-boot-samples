package io.github.futurewl.spring.boot.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-22:00:27
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "event")
public class MyEvent {
    @Id
    private Long id;    // 2
    private String message;
}
