package com.studyjava.javastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class JavastudyApplication {

	public static void main(String[] args) {
		// whiteStudy();
		whileStudy2();
		// SpringApplication.run(JavastudyApplication.class, args);
		// Connection connection = null;
		// PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;

		// try {
		// // JDBCドライバのロード
		// Class.forName("org.sqlite.JDBC");

		// // データベースへの接続
		// String url =
		// "jdbc:sqlite:/C:\\Users\\yohei\\OneDrive\\ドキュメント\\JAVA\\javastudy\\src\\main\\resources\\SQL\\Test.db";
		// // データベースファイルのパス
		// connection = DriverManager.getConnection(url);

		// System.out.println("SQLiteデータベースに接続しました");

		// // ここでデータベース操作を行います

		// // 例: テーブル内のデータを取得する
		// String sql = "SELECT * FROM TEST"; // テーブル名を適切に置き換える
		// preparedStatement = connection.prepareStatement(sql);
		// resultSet = preparedStatement.executeQuery();

		// while (resultSet.next()) {
		// int id = resultSet.getInt("No"); // 列名を適切に置き換える
		// String name = resultSet.getString("Name"); // 列名を適切に置き換える

		// System.out.println("ID: " + id + ", Name: " + name);
		// }

		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (resultSet != null)
		// resultSet.close();
		// if (preparedStatement != null)
		// preparedStatement.close();
		// if (connection != null)
		// connection.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// }
	}

	private static void hossyStudy() {
		// うんこの出し方（コンソールで）
		// out:クラス print:メソッド
		System.out.print("うんこ");
		System.out.print(1);
		System.out.println("うっすうう");
		System.out.print("うんこ");
	}

	private static void hossyStudycalc() {
		System.out.println("unko" + "unko");
		System.out.println("unko" + "1");
		System.out.println("2" + "unko");
		System.out.println("4" + "3");
		System.out.println(1 + 1);
		System.out.println(3 - 1);
		System.out.println(6 * 2);
		System.out.println(1 / 1);
		System.out.println(10 % 3);
	}

	private static void input() {

		System.out.println("文字列を入力してください");

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println("入力された文字列は「" + str + "」です");

		scan.close();

	}

	private static void input2() {

		System.out.println("数値を入力してください");

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		System.out.println(a + 5);

		System.out.println("入力された数値とプラス5は「" + (a + 5) + "」です");

		scan.close();

	}

	private static void fuse1byou() {
		Scanner scan = new Scanner(System.in);
		try {
			// 文字を入力させて表示
			System.out.println("キーボードから文字を入力してください");
			String str = scan.next();
			System.out.println("入力された文字は「" + str + "」です");

			// 数値を入力させて表示
			System.out.println("キーボードから数字を入力してください");
			int i = scan.nextInt();
			System.out.println("入力された文字は「" + i + "」です");
		} catch (Exception e) {
			System.out.println("ERROR");
		} finally {
			scan.close();
		}
	}

	private static void joukenBunki() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("数字を入力してください");
			int a = scan.nextInt();
			if (a > 10) {
				System.out.println(a + "は10より大きいです");
			} else if (a == 10) {
				System.out.println(a + "は10と同じです");
			} else {
				System.out.println(a + "は10より小さいです");
			}
		} catch (Exception e) {
			System.out.println("数字を入力してください");
		} finally {
			scan.close();
		}
	}

	private static void forStudy() {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("数字を入力してください");
			int inputValue = scan.nextInt();
			for (int i = inputValue; i < inputValue * 2; i++) {
				System.out.println("i = " + i);
			}

			// for (int i = 0; i < inputValue; i++) {
			// System.out.println("i = " + (inputValue+i));
			// }

		} catch (Exception e) {
			System.out.println("数字を入力してください");
		} finally {
			scan.close();
		}
	}

	private static void whiteStudy() {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("数字を入力してください");
			int inputValue = scan.nextInt();
			int i = 0;
			while (i < inputValue) {
				System.out.println("i = " + (inputValue + i));
				i++;
			}
		} catch (Exception e) {
			System.out.println("数字を入力してください");
		} finally {
			scan.close();
		}

	}

	private static void whileStudy2() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int inputValue;
		while (i < 1) {
			
			try {
				System.out.println("数字を入力してください");
				inputValue = scan.nextInt();
				if (inputValue > 10) {
					System.out.println(inputValue + "は10より大きいです");
				} else if (inputValue == 10) {
					System.out.println(inputValue + "は10と同じです");
				} else {
					System.out.println(inputValue + "は10より小さいです");
				}

				i++;

			} catch (Exception e) {
				System.out.println("数字を入力してください2");
			} 
		
		}
		scan.close();
	
	}
}