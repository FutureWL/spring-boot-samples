package io.github.futurewl.spring.cloud.finchley.weather.vo;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:00
 * @version 1.0
 */
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Weather data;
    private String status;
    private String desc;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
