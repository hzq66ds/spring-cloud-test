
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableHystrixDashboard
public class HadoopApplication {
	@RequestMapping("/hello")
	public String hello(){
		return  "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(HadoopApplication.class, args);
	}
}