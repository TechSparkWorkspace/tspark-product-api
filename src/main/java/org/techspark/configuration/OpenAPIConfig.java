package org.techspark.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(
        title = "TechSpark Project API",
        version = "1.0",
        description = "The TechSpark Project API provides endpoints for managing products",
        contact = @Contact(name = "Support Team", email = "codrixtechtrainer@gmail.com"),
        license = @License(name = "MIT License", url = "https://opensource.org/licenses/MIT")
))
public class OpenAPIConfig {
}
