package com.kh.phoneBook.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import com.kh.phoneBook.controller.PbookController;
import com.kh.phoneBook.model.vo.Person;

public class PbookRun {

	public static void main(String[] args) {
		
		HashMap<String, String> pBook = new HashMap<String, String>();
		
		pBook.put("손흥민", "010-5125-6219");
		pBook.put("김민재", "010-9853-5747");
		pBook.put("황의조", "010-2156-7895");
		pBook.put("황희찬", "010-1215-8752");
		pBook.put("황인범", "010-8791-2156");
		pBook.put("정우영", "010-2315-2588");
		pBook.put("이재성", "010-6568-5125");
		pBook.put("이강인", "010-8492-6512");
		pBook.put("김영권", "010-8968-4792");
		pBook.put("김승규", "010-6739-8426");
		
		printPhoneBook(pBook);
	}

	public static void printPhoneBook (HashMap<String, String> pb) {
			
			PbookController pc = new PbookController();
			
			HashMap<String, String> pBook = new HashMap<String, String>();
			
			Person ps = new Person();
			
			boolean flag = true;

			while (flag = true) {
				System.out.println("======= 전화번호부 =======");
				System.out.println("1. 이름으로 찾기");
				System.out.println("2. 전화번호 추가하기");
				System.out.println("3. 전화번호 삭제하기");
				System.out.println("4. 전화번호부 전체출력");
				System.out.println("5. 전화번호부를 파일로 저장");
				System.out.println("6. 프로그램 종료");

				System.out.print("메뉴번호를 입력해주세요 : ");
				Scanner sc = new Scanner(System.in);
				int manu = sc.nextInt();
				
				switch (manu) {
				case 1: // 1. 이름으로 검색하기
					System.out.print("이름을 입력해주세요 : ");
					String name = sc.next();
					
					String pNum = pb.get(name);
					
					if(pNum == null) {
						System.out.println(name + "은(는) 전화번호부에 없습니다.");
					} else {
						System.out.println(pNum);
					}
					
					break;
				case 2: // 2. 전화번호 추가하기
					System.out.print("추가하실 이름 : ");
					String aName = sc.next();
					System.out.print("추가하실 전화번호 : ");
					String aNum = sc.next();
					
					pb.put(aName, aNum);
					
					System.out.println(aName + "님의 전화번호 [" + aNum + "]가 추가되었습니다.");
					
					break;
				case 3: // 3. 전화번호 삭제하기
					System.out.print("삭제하실 성함을 입력해주세요 : ");
					String rName = sc.next();
					pb.remove(rName);
					System.out.println(rName + "님의 전화번호가 삭제되었습니다.");
					
					break;
				case 4: // 4. 전화번호부 전체출력
					System.out.println("=== 전화번호 목록 ===");
					System.out.println(pb);
					
					break;
				case 5: // 5. 전화번호부를 파일로 저장
					Properties prop = new Properties();
					
					Set keySet = pb.keySet();
					Iterator itKey = keySet.iterator();
					
					while(itKey.hasNext()) {
						String key = (String)itKey.next();
						String value = (String)pb.get(key);
						prop.setProperty(key, value);
					}
					System.out.println("1. properties 파일");
					System.out.println("2. xml 파일");
					System.out.print("파일의 확장자를 번호로 입력해주세요 : ");
					int select = sc.nextInt();
					
					if(select == 1) {
						try {
							prop.store(new FileOutputStream("PhoneBook.properties"), "전화번호부[properties File]");
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else if(select == 2) {
						try {
							prop.storeToXML(new FileOutputStream("PhoneBook.xml"), "전화번호부[xml File]");
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else
						System.out.println("잘못입력하셨습니다.");
					flag = false;
					
					System.out.println("전화번호 파일이 저장되었습니다.");
					
					break;
							
				case 6: // 6. 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					
					return;
			
		}
			
		}


	}
}

