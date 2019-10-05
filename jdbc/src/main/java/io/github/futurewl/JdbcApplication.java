package io.github.futurewl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcApplication {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动 缺点，每次加载连接，驱动名称硬编码
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取连接 缺点，每次获取连接，连接信息硬编码
            String url = "jdbc:mysql://127.0.0.1:3306/db_jdbc";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            // 获取statement，preparedStatement 缺点，SQL与 Java 代码耦合
            String sql = "select * from db_jdbc.tb_user where id=?";
            preparedStatement = connection.prepareStatement(sql);
            // 设置参数
            preparedStatement.setLong(1, 1L);
            // 执行查询
            resultSet = preparedStatement.executeQuery();
            // 处理结果集 结果集中的数据类型需要手动判断，下标或列名需要手动判断
            while (resultSet.next()) {
                System.out.println(resultSet.getString("user_name"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
                System.out.println(resultSet.getDate("birthday"));
            }
        } finally {
            // 关闭连接，释放资源 缺点：每次都要打开并关闭连接，浪费资源
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
