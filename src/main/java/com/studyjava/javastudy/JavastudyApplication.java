package com.studyjava.javastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class JavastudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavastudyApplication.class, args);
		Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // JDBCドライバのロード
            Class.forName("org.sqlite.JDBC");

            // データベースへの接続
            String url = "jdbc:sqlite:/C:\\Users\\yohei\\OneDrive\\ドキュメント\\JAVA\\javastudy\\src\\main\\resources\\SQL\\Test.db"; // データベースファイルのパス
            connection = DriverManager.getConnection(url);

            System.out.println("SQLiteデータベースに接続しました");

            // ここでデータベース操作を行います

            // 例: テーブル内のデータを取得する
            String sql = "SELECT * FROM TEST"; // テーブル名を適切に置き換える
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("No"); // 列名を適切に置き換える
                String name = resultSet.getString("Name"); // 列名を適切に置き換える

                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

	private static void hossyStudy(){
		
	}
}
