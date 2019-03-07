package main;

import functions.Encode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class MainConfig {

    @Bean
    Function<Flux<Integer>, Flux<Integer>> encode() {
        return new Encode();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainConfig.class);
    }
}
