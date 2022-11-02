package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {

		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		// 1 = 가위 , 2 = 바위, 3 = 보

		int userRps = 0;
		String com = " ";
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;

		while (true) {

			int comRps = (int) (Math.random() * 3 + 1);

			System.out.print("가위바위보 : ");
			String ans = sc.nextLine();

			if (ans.equals("가위") || ans.equals("바위") || ans.equals("보")) {
				if (comRps == 1) {
					com = "가위";
				} else if (comRps == 2) {
					com = "바위";
				} else if (comRps == 3) {
					com = "보";
				}

				System.out.println("컴퓨터 : " + com);
				System.out.println(name + " : " + ans);

				if (ans.equals("가위")) {
					userRps = 1;
				} else if (ans.equals("바위")) {
					userRps = 2;
				} else if (ans.equals("보")) {
					userRps = 3;
				}

				if (userRps == comRps) {
					System.out.println("비겼습니다.");
					draw++;
				} else if ((userRps == 1 && comRps == 3) || (userRps == 2 && comRps == 1)
						|| (userRps == 3 && comRps == 2)) {
					System.out.println("이겼습니다 !");
					win++;
				} else {
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
				}
			} else if (ans.equals("exit")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				count--;
			}

			count++;

		}

		System.out.println(count + "전 " + win + "승 " + draw + "무 " + lose + "패");

	}
}
