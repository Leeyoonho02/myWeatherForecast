from pydantic import BaseSettings
from dotenv import load_dotenv
import os

load_dotenv()

class Settings(BaseSettings):
    API_KEY: str
    KAKAO_TOKEN: str
    CITY: str = "Seoul"
    SCHEDULE_TIME: str = "07:00"
    TZ: str = "Asia/Seoul"

    class Config:
        env_file = ".env"

settings = Settings()
