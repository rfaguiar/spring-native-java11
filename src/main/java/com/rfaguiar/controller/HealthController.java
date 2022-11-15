package com.rfaguiar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Health healthCheck() {
        return Health.UP;
    }

    private static class Health {
        public static final Health UP = new Health("UP");
        private String status;

        private Health(String status) {
            this.status = status;
        }
        public String getStatus() {
            return status;
        }
    }
}
