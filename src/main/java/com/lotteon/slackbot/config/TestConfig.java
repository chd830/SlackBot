package com.lotteon.slackbot.config;

import com.slack.api.app_backend.slash_commands.payload.SlashCommandPayload;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:프로퍼티..")
public class TestConfig {

    private final Logger log = LoggerFactory.getLogger(TestConfig.class);

    private final String token;
    private final String secret;

    public TestConfig(Environment env) {
        this.token = env.getProperty("token");
        this.secret = env.getProperty("secret");
    }

    @Qualifier("test")
    @Bean
    public App test() {
        AppConfig appConfig = AppConfig.builder().singleTeamBotToken(token).signingSecret(secret).build();
        App app = new App(appConfig);

        app.command("/test", (req, ctx) -> {
            SlashCommandPayload payload = req.getPayload();

            log.info("command: "+payload.getCommand());

            return ctx.ack("TEST COMMAND");
        });

        return app;
    }
}
