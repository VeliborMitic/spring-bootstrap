package pl.sgorecki.bootstrap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@Configuration
@Profile("dev")
public class DevelopmentDataSourceConfig {
}
