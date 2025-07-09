from apscheduler.schedulers.background import BackgroundScheduler
import pytz
from app.config import SCHEDULE_TIME, TZ

scheduler = BackgroundScheduler(timezone=TZ)

def scheduled_job():
    print('Scheduled job executed!')

# 예시: 매일 지정된 시간에 실행
hour, minute = map(int, SCHEDULE_TIME.split(':'))
scheduler.add_job(scheduled_job, 'cron', hour=hour, minute=minute) 