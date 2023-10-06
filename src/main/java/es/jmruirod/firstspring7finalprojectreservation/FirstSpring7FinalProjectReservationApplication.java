package es.jmruirod.firstspring7finalprojectreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Clase principal de la aplicación Spring Boot para consumir servicios web relacionados con reservas.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@SpringBootApplication
public class FirstSpring7FinalProjectReservationApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(FirstSpring7FinalProjectReservationApplication.class, args);
	}
	
	/**
     * Configuración de un bean RestTemplate para realizar solicitudes HTTP a servicios web.
     * 
     * @return Una instancia de RestTemplate.
     */
    @Bean
    public RestTemplate template()
    {
        return new RestTemplate();
    }
}
