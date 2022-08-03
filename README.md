# Community3rd

TDD를 도입한 3번째 버전의 커뮤니티 게시판
스프링을 모방한 Servlet/JSP 프로젝트

## 기능 명세

1. 자유게시판 CRUD + ajax도입(실시간에 가까운 리스팅)
2. 채팅(댓글) CRUD(채팅의 삭제방법은 게시판과는 다르다.) + ajax도입
IOC + 액션매핑 + MySQL연동 + 에디터 +배포

## 세팅방법

1. 의존성 주입(TDD를 위한 JUNIT, Servlet, JSTL, 롬복, 잭슨) 
2. 톰캣 설정(1. src폴더 내 webapp 2. webapp 디렉토리 설정 후 구성편집)
3. gitignore


## 디렉토리 구조
com.ll.article(자유게시판)
com.ll.chat(채팅방, 채팅)

## 전 프로젝트와 다른 점
1. Container에서 모든 것을 받아올 수 있다.
2. DispatchServlet의 간소화
3. Controller내부에서 어노테이션 정의 (public @interface Controller )
4. 컴포넌트 어노테이션 스캔 구현
5. without new
6. Container안에 objects에 모든 객체를 담을 것.( 객체 선언, 생성) -> 다운캐스팅의 문제를 지네릭으로 해결.
