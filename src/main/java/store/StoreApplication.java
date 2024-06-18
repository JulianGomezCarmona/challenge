package store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import tools.dynamia.domain.DefaultEntityReferenceRepository;
import tools.dynamia.domain.EntityReferenceRepository;
import tools.dynamia.integration.Ehcache3CacheManager;
import tools.dynamia.zk.app.EnableDynamiaTools;

@SpringBootApplication
@EnableDynamiaTools
@EntityScan({"store", "tools.dynamia"})
@EnableCaching
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}



	@Bean
	public CacheManager cacheManager() {
		return new Ehcache3CacheManager();
	}

}
