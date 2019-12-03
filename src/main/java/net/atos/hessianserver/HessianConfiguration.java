package net.atos.hessianserver;

import net.atos.api.Weather;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class HessianConfiguration {

    //http://<HOST>:<PORT>/<SERVICE_NAME>
    //http://localhost:8080/weatherhessian

    @Bean(name = "/weatherhessian")
    RemoteExporter weatherService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(new WeatherHessianImpl());
        exporter.setServiceInterface(Weather.class);
        return exporter;
    }

}
