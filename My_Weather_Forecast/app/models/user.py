from pydantic import BaseModel

class UserSetting(BaseModel):
    user_id: str
    city: str = 'Seoul'
    schedule_time: str = '07:00'
    notify_items: list[str] = ['temp', 'humidity', 'rain'] 