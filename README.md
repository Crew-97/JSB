# Spring MVC 요청·응답 실습

Spring Boot에서 **URL 매핑, 서버 로그와 HTTP 응답의 차이, `@ResponseBody`의 역할**을 살펴보는 기초 실습입니다.

[GitHub 프로필](https://github.com/Crew-97)

## 코드에서 확인할 내용

중심 코드는 [Maincontroller.java](src/main/java/com/mysite/first/Maincontroller.java)입니다.

| 대상 | 현재 코드의 동작 |
|---|---|
| `GET /about` | `@ResponseBody`를 통해 문자열 `안녕하세용` 반환 |
| `GET /First` | 서버 로그를 남기고 내부 메서드 호출. 별도의 응답 본문·화면 템플릿 없음 |
| `contact()` | URL 매핑 없이 Controller 안에서 호출되는 메서드 |

`/First`는 완성된 웹 화면이 아닙니다. 브라우저 응답 확인에는 `/about`을 사용합니다.

## 실행

설정 기준: **JDK 17 · Spring Boot 3.4.3 · Gradle Wrapper**. 버전과 의존성은 [build.gradle](build.gradle)에 있습니다.

```bash
git clone https://github.com/Crew-97/JSB.git
cd JSB
```

Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

macOS/Linux:

```bash
bash gradlew bootRun
```

서버를 실행한 뒤 `http://localhost:8080/about`을 엽니다. 처음 실행할 때는 Gradle과 의존성을 내려받을 네트워크 연결이 필요합니다.

## 학습 범위

Controller와 요청·응답의 기본 동작을 다룹니다. H2와 Lombok은 빌드 의존성에 포함돼 있지만, 현재 Controller에 데이터베이스 연동 기능은 없습니다. 실행 명령은 소스·빌드 설정 기준이며, 이 README 정리 과정에서 서버를 다시 실행한 것은 아닙니다.
