from apscheduler.schedulers.background import BackgroundScheduler
from pytz import timezone

scheduler = BackgroundScheduler(timezone="Asia/Seoul")

def start_scheduler():
    # TODO: Add job for weather notification
    scheduler.start()
