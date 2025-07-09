import os
from dotenv import load_dotenv

load_dotenv()

API_KEY = os.getenv('API_KEY')
KAKAO_TOKEN = os.getenv('KAKAO_TOKEN')
CITY = os.getenv('CITY', 'Seoul')
SCHEDULE_TIME = os.getenv('SCHEDULE_TIME', '07:00')
TZ = os.getenv('TZ', 'Asia/Seoul') 