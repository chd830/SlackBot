package com.lotteon.slackbot.servlet;

import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.jws.WebService;

@WebService("/test")
public class TestServlet extends SlackAppServlet {
    public TestServlet(@Qualifier("test") App app) { super(app); }
}
