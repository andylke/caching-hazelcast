package io.github.andylke.caching.hazelcast.message;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages")
@CacheConfig(cacheNames = {"messages"})
public class MessageRestController {

  @PostMapping
  @CachePut(key = "#message.code")
  public Message put(@RequestBody final Message message) {
    return message;
  }

  @GetMapping
  @Cacheable
  public Message get(@RequestParam final String code) {
    return null;
  }

  @DeleteMapping
  @CacheEvict
  public void evict(@RequestParam final String code) {}
}
