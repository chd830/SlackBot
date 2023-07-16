https://techblog.lotteon.com/slack-bot-%EC%83%81%ED%98%B8-%EC%9E%91%EC%9A%A9-66596c262616
1. https://ngrok.com 다운로드 후 해당 경로로 이동해서 ngrok.exe http port 80 명령어 입력
2. dependency 추가
``` java
    implementation group: 'org.springframework', name: 'spring-context', version: '5.3.23'
    implementation group: 'com.slack.api', name: 'bolt', version: '1.27.2'
    implementation group: 'com.slack.api', name: 'bolt-servlet', version: '1.27.2'
```

https://api.slack.com/methods/chat.postMessage/test
1. 해당 사이트에서 토큰을 `선택안함` 으로 선택 후 개인 토큰 입력
2. 채널 명 입력(공개채널)
3. 보내고 싶은 메세지 입력
