import redis.clients.jedis.Jedis;

public class TestConnect {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("121.248.201.216",6379);
        System.out.println(jedis.ping());
    }
}
