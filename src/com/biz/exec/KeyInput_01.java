package com.biz.exec;

import java.util.Scanner;

public class KeyInput_01 {

	/*
	 *  변수(메모리)에 값(Data)들을 저장하고
	 *  연산을 수행하고 Console에 보여주는 코드 작성
	 *  
	 *  사용자(Operator)가 키보드를 통해서 어떤 값을
	 *  직업 입력하고
	 *  그 입력한 값을 연산 수행하는 경우
	 *  사용하는 클래스
	 *  
	 */
	public static void main(String[] args) {
		
		 System.out.println("콘솔에 무언가 보여주고자 할 때");
		 
		 // System.out과 반대되는 개념으로
		 // 키보드로부터 무언가(Data)받아서
		 // 사용하기 위한 준비
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 // nextLine()은 키보드에 무엇(String)인가 입력되기를
		 // 마냥 기다리는 상황이 되고
		 // 이런 상황을 blocking 되었다라고 한다.
		 String keyStr = scanner.nextLine();
		 System.out.println("=============================");
		 System.out.println(keyStr);
		 
		
	}

}
