FROM gradle:7.6-jdk17-alpine

WORKDIR /app

# Установка Chrome и Chromedriver
RUN apk update && apk add --no-cache \
    chromium \
    chromium-chromedriver \
    xvfb \
    bash

# Копируем исходный код
COPY . .

CMD ["gradle", "clean", "test", "--info"]