package net.ashishshah.sendtab

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.scheduling.annotation.EnableScheduling
import static com.stormpath.spring.config.StormpathWebSecurityConfigurer.stormpath

@Configuration
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan(basePackages="net.ashishshah.sendtab")
@PropertySource('classpath:application.properties')
public class AppConfig {
}
