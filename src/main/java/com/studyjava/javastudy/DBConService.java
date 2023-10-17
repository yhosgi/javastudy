package com.studyjava.javastudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.studyjava.model.model;

import org.springframework.stereotype.Service;

@Service
public class DBConService {

    public List<model> conDB(){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
        List<model> resultList = new ArrayList<>();
		try {
		// JDBCドライバのロード
		Class.forName("org.sqlite.JDBC");

		// データベースへの接続
		String url =
		"jdbc:sqlite:/C:\\Users\\yohei\\OneDrive\\ドキュメント\\JAVA\\javastudy\\src\\main\\resources\\SQL\\Test.db";
		// データベースファイルのパス
		connection = DriverManager.getConnection(url);

		System.out.println("SQLiteデータベースに接続しました");

		// ここでデータベース操作を行います

		// 例: テーブル内のデータを取得する
		String sql = "SELECT * FROM TEST"; // テーブル名を適切に置き換える
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {     
            model model = new model();
            model.setId(resultSet.getInt("No"));
            model.setName(resultSet.getString("name"));
            resultList.add(model);
        }
		// while (resultSet.next()) {
		// int id = resultSet.getInt("No"); // 列名を適切に置き換える
		// String name = resultSet.getString("Name"); // 列名を適切に置き換える

		// System.out.println("ID: " + id + ", Name: " + name);
		//}

		} catch (ClassNotFoundException e) {
    		e.printStackTrace();
		} catch (SQLException e) {
	    	e.printStackTrace();
		} finally {
		    try {
		        if (resultSet != null)
        	    	resultSet.close();
    		    if (preparedStatement != null)
         	    	preparedStatement.close();
    		    if (connection != null)
    	     	connection.close();
    		} catch (SQLException e) {
        		e.printStackTrace();
    		}
		}
        return resultList;
    }
}
