FROM maven:3.8.1-jdk-8-slim as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
RUN mvn package -Dmaven.resources.includes=templates/*
COPY src/ /app/src/
RUN mvn package -DskipTests

# 声明环境变量，这样容器就可以在运行时访问它们
ENV OPENAI_MODEL=text-davinci-003
ENV OPENAI_API_KEY=你的API_KEY
ENV ZSXQ_COOKIE=你的星球Cookie
ENV ZSXQ_GROUP_ID=你的星球id
# 是否只提醒提问者
ENV ZSXQ_SILENCED=true

FROM openjdk:8-jdk-alpine
COPY --from=builder /app/target/yu-auto-reply-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 80
# Run the web service on container startup.
ENTRYPOINT ["java","-jar","/app.jar"]