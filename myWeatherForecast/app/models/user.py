from pydantic import BaseModel

class UserSettings(BaseModel):
    user_id: str
    city: str = "Seoul"
    schedule_time: str = "07:00"
    data_options: list = []  # e.g., ["temp", "humidity", "rain"]
