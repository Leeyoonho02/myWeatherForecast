from loguru import logger

logger.add('weather_service.log', rotation='1 week', level='INFO') 