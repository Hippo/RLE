package me.hippo.api.testing.rle;

import me.hippo.api.testing.rle.topic.ExampleTopic;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.JedisPool;
import rip.hippo.lwjeb.bus.PubSub;
import rip.hippo.lwjeb.extensions.rle.RedisPubSub;


/**
 * @author Hippo
 * @version 1.0.1, 4/21/20
 * @since 1.0.0
 */
public final class PublisherTest {

  @Test
  public void testPublish() {
    try {
      JedisPool jedisPool = new JedisPool("localhost");

      RedisPubSub redisPubSub = new RedisPubSub(new PubSub<>());

      redisPubSub.post(jedisPool, new ExampleTopic(69));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
