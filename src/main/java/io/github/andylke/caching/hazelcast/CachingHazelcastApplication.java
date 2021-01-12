package io.github.andylke.caching.hazelcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingHazelcastApplication {

  public static void main(String[] args) {
    SpringApplication.run(CachingHazelcastApplication.class, args);
  }
}
