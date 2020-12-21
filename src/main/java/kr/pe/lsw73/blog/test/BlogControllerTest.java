package kr.pe.lsw73.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 kr.pe.lsw73.blog 패키지 이하를 스캔했어 모든 파일에 메모리에 new하는 것은 아니구요.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new했어(loC) 스프링 컨터이너에 관리해줍니다.
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}