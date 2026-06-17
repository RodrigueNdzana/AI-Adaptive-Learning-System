package com.aiadaptive;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
  public class SwaggerConfig {

    @Bean
        public OpenAPI aiAdaptiveLearningOpenAPI() {
                  return new OpenAPI()
                                    .info(new Info()
                                                                  .title("AI Adaptive Learning System API")
                                                                  .description("REST API for the AI Adaptive Learning System. "
                                                                                                               + "This API provides endpoints to manage students, "
                                                                                                               + "learning content, and personalized recommendations.")
                                                                  .version("1.0.0")
                                                                  .contact(new Contact()
                                                                                                           .name("AI Adaptive Learning Team")
                                                                                                           .email("support@aiadaptive.com"))
                                                                  .license(new License()
                                                                                                           .name("MIT License")
                                                                                                           .url("https://opensource.org/licenses/MIT")));
        }
  }
