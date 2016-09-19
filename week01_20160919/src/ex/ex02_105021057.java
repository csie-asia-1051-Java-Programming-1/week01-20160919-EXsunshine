package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class ex02_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
float kg = scn.nextInt();
double  p = kg/0.45359 ;
System.out.println(p);
	}

}
