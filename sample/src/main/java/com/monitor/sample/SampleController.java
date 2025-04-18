package com.monitor.sample;

import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SampleController {

    // lombok을 사용하지 않고 SLF4J Logger를 사용하여 로그를 기록합니다.
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    public String hello(HttpServletResponse response) throws IOException {
        logger.info("Attempted access to / endpoint resulted in 403 Forbidden");
        response.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
        return null;
    }
}