package net.atos.httpserver;

import lombok.extern.slf4j.Slf4j;
import net.atos.api.TemperatureInfo;
import net.atos.api.Weather;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
public class WeatherHttpImpl implements Weather {

    @Override
    public List<TemperatureInfo> getTemperature(String city, List<Date> dates) {
        log.info("------------Server Side-----------------");
        log.info("Http incoming city{} dates {}", city, dates);

        List<TemperatureInfo> temperatures = new ArrayList<>();

        for (Date date : dates) {
            TemperatureInfo info = new TemperatureInfo(city, date, 5.0, 10.0, 8.0);
            temperatures.add(info);
        }

        return temperatures;
    }
}
