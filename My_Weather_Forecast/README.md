# 카카오톡 날씨 알림 서비스 
made by Yoonho Lee with GPT-o4 and Cursor

## 개요
매일 아침 어제와 오늘의 날씨를 비교해 카카오톡 메시지로 발송하는 자동화 서비스입니다.

## 주요 기능
- 사용자별 도시/알림시간/데이터항목 설정
- OpenWeatherMap/기상청 API 연동 및 비교
- 카카오톡 비즈메시지 API 자동 발송
- robust한 예외처리 및 스케줄링

## 환경 변수 예시 (.env)
```
API_KEY=your_weather_api_key
KAKAO_TOKEN=your_kakao_access_token
CITY=Seoul
SCHEDULE_TIME=07:00
TZ=Asia/Seoul
```

## 실행 방법
1. 의존성 설치: `pip install -r requirements.txt`
2. 환경 변수 파일(.env) 작성
3. FastAPI 서버 실행: `uvicorn app.main:app --reload`
4. 스케줄러/테스트는 각 모듈 참고

## 프로젝트 구조
```
app/
  main.py           # FastAPI 진입점
  config.py         # 환경변수/설정 관리
  scheduler.py      # 스케줄러 관리
  weather/          # 날씨 API/비교
  messaging/        # 카카오톡 메시지
  models/           # 데이터 모델
  utils/            # 로깅 등 유틸
```

## 테스트
- `pytest`로 단위 테스트 실행

## 라이선스
MIT 