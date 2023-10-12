package di;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	@Bean
	public SamsungTV samsungTv() {
		return new SamsungTV();
	}
	@Bean
	public LgTV lgTV() {
		return new LgTV();
	}
}
