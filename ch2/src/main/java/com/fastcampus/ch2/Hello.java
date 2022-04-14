package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static 변수
	
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello") // 외부에서 호출 할 수 있게 해줌
	public void  main() { // 인스턴스 메서드라 객체 생성 후 호출 가능한데 Tomcat 이 객체를 생성 해준다.
		System.out.println("Hello");
		System.out.println(cv); // OK
		System.out.println(iv); // OK
	}
	
	public static void main2() { // static 메서드 - cv 만 사용가능
		System.out.println(cv); // OK
//		System.out.println(iv); // Error
	}
}