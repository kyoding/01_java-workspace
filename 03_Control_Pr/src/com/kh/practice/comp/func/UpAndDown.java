package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void upDown() {

		Scanner sc = new Scanner(System.in);

		int num = (int) (Math.random() * 100 + 1);

		int i = 1;

		while (true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int kb = sc.nextInt();

			if (kb > 100 || kb < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				i--;
			} else if (kb == num) {
				System.out.println("정답입니다");
				System.out.println(i + "회만에 맞추셨습니다");
				return;
			} else if (kb > num) {
				System.out.println("Down !");
			} else if (kb < num) {
				System.out.println("Up !");
			}

			i++;
		}

	}
}