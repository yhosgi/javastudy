package com.studyjava.javastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavastudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavastudyApplication.class, args);
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
				// scan.close(); // この行を削除
				i++;
	
			} catch (Exception e) {
				System.out.println("数字を入力してください2");
				scan.next();
			}
		}
		// scan.close(); // 最終的にはここでスキャナーを閉じるべきです
	}
	
}