package telran.java51.pulse.service;

import java.util.function.Consumer;

import javax.xml.crypto.Data;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java51.pulse.dto.PulseDto;

@Configuration
public class PulseService {

	@Bean
	Consumer <PulseDto> log() {
		
		return data -> {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long delay = System.currentTimeMillis() - data.getTimeStamp();
			System.out.println("delay: "+delay+", id: "+data.getId()+", pulse: "+data.getPayload());
		//Будет распечатываться delay: 116944, id: 1, pulse: 88
		
		};
	}
}
