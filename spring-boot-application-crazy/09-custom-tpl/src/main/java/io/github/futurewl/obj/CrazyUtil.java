package io.github.futurewl.obj;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 工具类
 */
public class CrazyUtil {

    /**
     * 添加天数
     */
    public String addDay(String dateString, int day) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dateString));
            c.add(Calendar.DAY_OF_MONTH, day);
            return sdf.format(c.getTime());

        } catch (Exception e) {
            e.printStackTrace();
            return dateString;
        }
    }

    public static void main(String[] args) {
        CrazyUtil util = new CrazyUtil();
        String result = util.addDay("2018-02-24", 13);
        System.out.println(result);
    }
}
