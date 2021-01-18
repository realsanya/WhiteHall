package ru.itis.javalab.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import ru.itis.javalab.repositories.*;
import ru.itis.javalab.repositories.interfaces.*;
import ru.itis.javalab.services.*;
import ru.itis.javalab.services.interfaces.*;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "ru.itis.javalab")
public class ApplicationConfig {

    private final Environment environment;

    public ApplicationConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ImageService imageService() {
        return new ImageServiceImpl(imageRepository());
    }

    @Bean
    public ImageRepository imageRepository() {
        return new ImageRepositoryJdbc(dataSource());
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryJdbc(dataSource(), imageService());
    }

    @Bean
    public RoleService roleService() {
        return new RoleServiceImpl(roleRepository());
    }

    @Bean
    public RoleRepository roleRepository() {
        return new RoleRepositoryJdbc(dataSource());
    }

    @Bean
    public TeamMemberService teamMemberService() {
        return new TeamMemberServiceImpl(teamMemberRepository());
    }

    @Bean
    public TeamMemberRepository teamMemberRepository() {
        return new TeamMemberRepositoryJdbc(dataSource(), roleService());
    }

    @Bean
    public ReviewService reviewService() {
        return new ReviewServiceImpl(reviewReposiroty());
    }

    @Bean
    public ReviewReposiroty reviewReposiroty() {
        return new ReviewRepositoryJdbc(dataSource(), userService());
    }

    @Bean
    public HallService hallService() {
        return new HallServiceImpl(hallRepository());
    }

    @Bean
    public HallRepository hallRepository() {
        return new HallRepositoryJdbc(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(hikariConfig());
    }


    @Bean
    public HikariConfig hikariConfig() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(environment.getProperty("db.url"));
        hikariConfig.setMaximumPoolSize(Integer.parseInt(Objects.requireNonNull(environment.getProperty("db.hikari.max-pool-size"))));
        hikariConfig.setUsername(environment.getProperty("db.username"));
        hikariConfig.setPassword(environment.getProperty("db.password"));
//        hikariConfig.setDriverClassName(environment.getProperty("db.driver.classname"));
        return hikariConfig;
    }

//

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        resolver.setContentType("text/html;charset=UTF-8");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPath("/WEB-INF/views/templates/");
        return configurer;
    }

}
