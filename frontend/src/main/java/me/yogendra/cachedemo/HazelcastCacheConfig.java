package me.yogendra.cachedemo;

import com.hazelcast.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hazelcast-cache")
public class HazelcastCacheConfig {
    @Bean
    public Config hazelCastConfig() {

        Config config = new Config("frontend-cache");
        config.getNetworkConfig().getJoin().getTcpIpConfig().addMember("localhost").setEnabled(true);
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        return config;
    }
}
