package com.example.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController: 클라이언트 요청을 처리하는 스프링 MVC 컨트롤러
 */
@Controller
public class HomeController {

    // SLF4J Logger 인스턴스 생성
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * 홈 페이지 요청을 처리하는 메서드
     * @param model 뷰에 데이터를 전달하기 위한 객체
     * @return "home" 뷰 이름을 반환하여 /WEB-INF/views/home.jsp 파일을 반환
     */
    @RequestMapping(value = "/")
    public String index() {
        // 로그 메시지 출력
        logger.debug("HomeController: 홈 페이지 요청이 처리되었습니다.");

        // "home" 뷰 이름을 반환
        return "home";
    }
}
