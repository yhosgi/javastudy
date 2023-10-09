package com.studyjava.javastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavastudyApplication {

	public static void main(String[] args) {
		// SpringApplication.run(JavastudyApplication.class, args);
		// hossyStudy();
		// hossyStudycalc();
		// input();
		// input2();
		fuse1byou();
	}

	private static void hossyStudy(){
		// うんこの出し方（コンソールで）
		// out:クラス　print:メソッド
		System.out.print("うんこ");
		System.out.print(1);
		System.out.println("うっすうう");
		System.out.print("うんこ");
	}

	private static void hossyStudycalc(){
		System.out.println("unko"+"unko");
		System.out.println("unko"+"1");
		System.out.println("2"+"unko");
		System.out.println("4"+"3");
		System.out.println(1+1);
		System.out.println(3-1);
		System.out.println(6*2);
		System.out.println(1/1);
		System.out.println(10%3);
	}

	private static void input(){

		System.out.println("文字列を入力してください");

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println("入力された文字列は「" + str + "」です");

		scan.close();

	}

		private static void input2(){

		System.out.println("数値を入力してください");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
		
		System.out.println(a+5);

        System.out.println("入力された数値とプラス5は「" + (a + 5) + "」です");

		scan.close();

	}

		private static void fuse1byou(){
			Scanner scan = new Scanner(System.in);
			try {
				//文字を入力させて表示
				System.out.println("キーボードから文字を入力してください");
				String str = scan.next();
				System.out.println("入力された文字は「" + str + "」です");
	
				//数値を入力させて表示
				System.out.println("キーボードから数字を入力してください");
				int i  = scan.nextInt();
				System.out.println("入力された文字は「" + i + "」です");
			} catch (Exception e) {
				System.out.println("ERROR");
			}finally{
				scan.close();
			}
		}
}