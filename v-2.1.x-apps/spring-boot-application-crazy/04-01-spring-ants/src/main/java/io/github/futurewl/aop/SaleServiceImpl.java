package io.github.futurewl.aop;

import org.springframework.stereotype.Component;

@Component
public class SaleServiceImpl {

    public void saleService() {
        System.out.println("要代理的销售业务方法");
    }
}
