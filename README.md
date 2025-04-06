# 모니터링 시스템

## 1. 모니터링 개요

- 모니터링: 시스템의 성능, 안정성 및 가용성을 실시간으로 관찰하고 측정하는 과정
- 이를 통해 시스템의 상태를 추적하고, 문제를 감지하며, 성능을 최적화하고, 장애 발생 시 빠르게 대응할 수 있음.

## 2. Spring Boot Actuator

### 2.1 Spring Boot Actuator란?

- Spring Boot Actuator: Spring Boot 애플리케이션의 상태와 성능을 모니터링하고 관리할 수 있도록 다양한 엔드포인트를 제공하는 기능
- 이를 통해 헬스 체크, 메트릭스, 환경 정보, 로그 정보 등 중요한 정보를 쉽게 확인할 수 있음.

### 2.2 Actuator 의존성 추가

```bash
implementation 'org.springframework.boot:spring-boot-starter-actuator'
implementation 'org.springframework.boot:spring-boot-starter-web'
```

### 2.3 Actuator 엔드포인트

- Actuator는 다양한 엔드포인트를 제공함.
- 예) `/actuator/health` 엔드포인트를 통해 애플리케이션의 상태를 확인할 수 있음.

## 3. Prometheus와 Grafana를 활용한 모니터링

### 3.1 Prometheus란?

- Prometheus: 오픈소스 시스템 모니터링 및 경고 도구
- 메트릭 데이터를 수집하고, 쿼리 및 시각화를 통해 시스템 상태를 모니터링하고 경고를 설정할 수 있음.

### 3.2 Grafana란?

- Grafana는 오픈소스 데이터 시각화 및 모니터링 도구
- Prometheus와 같은 다양한 데이터 소스로부터 데이터를 수집하여 시각화하고, 분석할 수 있도록 함.
- 대시보드를 생성하고, 데이터를 그래프나 차트 형태로 표현하며, 알림 기능을 제공하여 모니터링을 강화할 수 있음.

## 4. 애플리케이션 로그 모니터링

### 4.1 Loki

- Loki: Grafana Labs에서 개발한 로그 집계 시스템
- 주로 로그 데이터를 저장하고, 이를 Grafana를 통해 시각화하는 데 사용됨.
- 라벨 기반의 메타데이터를 사용하여 로그를 효율적으로 검색할 수 있음.

### 4.2 loki-logback-appender

- `loki-logback-appender`: Logback을 사용하는 Java 애플리케이션에서 로그를 Loki로 직접 전송하기 위한 라이브러리
- 별도의 Promtail 설정 없이도 로그를 Loki로 전송할 수 있음.
