package net.atos.rmiserver;

import lombok.extern.slf4j.Slf4j;
import net.atos.rmiserver.api.TemperatureInfo;
import net.atos.rmiserver.api.Weather;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
public class WeatherRMIimpl implements Weather {

    @Override
    public List<TemperatureInfo> getTemerature(String city, List<Date> dates) {
        log.info("------------Server Side-----------------");
        log.info("RMI incoming city{} dates {}", city, dates);

        List<TemperatureInfo> temperatures = new ArrayList<>();

        for (Date date : dates) {
            TemperatureInfo info = new TemperatureInfo(city, date, 5.0, 10.0, 8.0);
            temperatures.add(info);
        }

        return temperatures;

    }
}
