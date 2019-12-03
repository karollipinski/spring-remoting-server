package net.atos.rmiserver;

import net.atos.api.Weather;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class RMIconfiguration {


    // Expose a service via RMI. Remote obect URL is:
    // rmi://<HOST>:<PORT>/<SERVICE_NAME>
    // 1099 is the default port

    //rmi://localhost:1099/weatherrmi
    @Bean
    RemoteExporter registerRMIExporter() {

        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("weatherrmi");
        exporter.setServiceInterface(Weather.class);
        exporter.setService(new WeatherRMIImpl());

        return exporter;
    }
}