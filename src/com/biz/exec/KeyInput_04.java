package com.biz.exec;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("끝내고 싶으시다면 END를 입력해주세요.");
		while(true) {
			System.out.println("국가명(영문으로) >>");
			String strNation =  scan.nextLine();
			
			if(strNation.equalsIgnoreCase("KOREA")) {
				System.out.println("대한민국!~");
			}else if(strNation.equalsIgnoreCase("CHINA")) {
				System.out.println("짱깨 당첨!");
			}else if(strNation.equalsIgnoreCase("USA")) {
				System.out.println("미국스");
			}else if(strNation.equals("END")) {
				System.out.println("gg");
				break;
			}else {
				System.out.println("아 몰랑~");
			}
		}
	}

}
