package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class hw03_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextInt();
		float b = scn.nextInt();
		float c = scn.nextInt();
		float d = scn.nextInt();
		float e = scn.nextInt();
		float f = scn.nextInt();
		int x =Math.min(Math.round(a),Math.round(b));
		x = Math.min(x,Math.round(c));
		x = Math.min(x,Math.round(d));
		x = Math.min(x,Math.round(e));
		x = Math.min(x,Math.round(f));
		System.out.println(x);
	}

}
