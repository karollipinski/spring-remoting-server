package net.atos.rmiserver;

import net.atos.rmiserver.api.Weather;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class RMIconfiguration {

    //rmi://<HOST>:<PORT>/<SERVICE_NAME>
    // 1099 domyślny port

    //rmi://localhost:1099/weatherrmi

    @Bean
    RemoteExporter remoteExporter() {

        RmiServiceExporter serviceExporter = new RmiServiceExporter();
        serviceExporter.setServiceName("weatherrmi");
        serviceExporter.setServiceInterface(Weather.class);
        serviceExporter.setService(new WeatherRMIimpl());

        return serviceExporter;
    }
}