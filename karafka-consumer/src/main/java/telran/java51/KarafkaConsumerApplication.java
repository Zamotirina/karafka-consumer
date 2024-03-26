package telran.java51;
import java.util.function.Consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class KarafkaConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
//	@Bean
//	Consumer<String> log() {
//	    return message -> {
//	        System.out.println("Received: " + message);
//	    };
//	}
	
	
	/*
	 * После того как мы добавили время в продюсера, мы добавили счтечик времени и сюда
	 * 
	 * а также фиксируем интервал между срабатываем счетчиков
	 */
//	@Bean
//	Consumer<String> log() {
//		
//	    return message -> {
//	    	
//	    	try {
//				Thread.sleep(3000);
//				
//			} catch (InterruptedException e) {
//				
//				// TODO Auto-generated catch block
//				
//				e.printStackTrace();
//			}
//	    	
//	    	long time=System.currentTimeMillis();
//	    	long delay= time - Long.parseLong(message.split(" ")[1]);
//	        System.out.println("Received: " + message.split(" ")[0]+" delay: "+delay);
	        
	        //метод выше будет печатать данные формата Received: data#7 delay: 215806, где delay - это интервал между срабатыванием счетчика времени в продьюсере и консьюмере. Интервал растет, так как продьюсер отправляет данные с задержкой в секунду, а консюмер обрабатыает их с задержкой в 3 секунды
//	    };
//	}
	
	/*
	 * Дальше мы добавили классы PulseDto и PulseServiсу, чтобы передавать обхекты
	 * 
	 * И после этого закооментировали код выше
	 */
	
}
