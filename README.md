# Langscape Prototype

언어 학습을 위한 실험적 프로젝트입니다.

## 🚀 기술 스택

### Backend
- **Java 21** - 최신 LTS 버전의 Java
- **Spring Boot 3.5.4** - 엔터프라이즈급 Java 애플리케이션 프레임워크
- **Spring Security** - 보안 및 인증/인가
- **Spring AI** - AI 모델 통합 (OpenAI)
- **Spring Actuator** - 애플리케이션 모니터링 및 관리
- **Lombok** - 보일러플레이트 코드 감소

### Frontend (예정)
- **React** - 사용자 인터페이스 라이브러리
- **TypeScript** - 정적 타입 지원을 통한 개발 생산성 향상

### AI/ML
- **OpenAI API** - 자연어 처리 및 AI 모델 활용

### 개발 도구
- **Gradle** - 빌드 도구
- **JUnit 5** - 테스트 프레임워크
- **MSW (Mock Service Worker)** - API 모킹 및 테스트

## 🎯 실험 목표

- AI 기반 언어 학습 플랫폼 구축
- Spring Boot와 React의 효율적인 통합
- TypeScript를 활용한 타입 안전성 확보
- OpenAI API를 활용한 자연어 처리 기능 구현

## 🛠️ 개발 환경 설정

### Prerequisites
- Java 21
- Node.js (React/TypeScript 개발용)
- Gradle

### 실행 방법
```bash
# Backend 실행
./gradlew bootRun

# Frontend 실행 (예정)
cd frontend
npm install
npm start
```

## 📝 프로젝트 구조
```
langscape-prototype/
├── src/main/java/io/langscape/     # Java 소스 코드
├── src/main/resources/             # 설정 파일 및 리소스
├── src/test/java/                  # 테스트 코드
├── frontend/                       # React/TypeScript 프론트엔드 (예정)
└── build.gradle.kts               # Gradle 빌드 설정
```
