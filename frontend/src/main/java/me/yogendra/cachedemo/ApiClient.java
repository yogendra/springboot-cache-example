package me.yogendra.cachedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

@Component
@Slf4j
public class ApiClient {

    @Value("${api.server.address}")
    private String apiServerAddress;

    private Map<String, ?> emptyParam = Collections.EMPTY_MAP;

    @Cacheable(cacheNames = "api")
    public String index() {
        RestTemplate template = new RestTemplate();
        String result = template.getForEntity("http://" + apiServerAddress, String.class, emptyParam).getBody();
        log.info("Invoked API endpoint and received {}", result);
        return result;
    }
}
