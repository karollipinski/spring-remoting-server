package net.atos.httpserver;

import net.atos.api.Weather;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class HttpConfiguraton {

    //http://<HOST>:<PORT>/<SERVICE_NAME>
    //http://localhost:8080/weatherhttp

    @Bean(name = "/weatherhttp")
    HttpInvokerServiceExporter weatherServiceHttp() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(Weather.class);
        exporter.setService(new WeatherHttpImpl());
        return exporter;

    }
}
