package io.github.futurewl.spring.boot.nosql.mongodb.entity;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:11:23
 * @version 1.0
 */
public class Location {

    private String place;

    private String year;

    public Location() {
    }

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
