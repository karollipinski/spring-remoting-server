package net.atos.rmiserver.api;

import java.util.Date;
import java.util.List;

public interface Weather {

    List<TemperatureInfo> getTemerature(String city, List<Date> dates);

}
