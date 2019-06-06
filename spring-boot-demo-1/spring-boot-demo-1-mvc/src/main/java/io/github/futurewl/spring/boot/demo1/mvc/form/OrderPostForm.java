package io.github.futurewl.spring.boot.demo1.mvc.form;

import io.github.futurewl.spring.boot.demo1.mvc.entity.Order;
import lombok.Data;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2018-12-07:13:23
 * @version 1.0
 */
@Data
public class OrderPostForm {

    private Order order;
    private List<Order> orderList;

}
