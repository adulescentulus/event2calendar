package de.networkchallenge.e2c.lambda.backend.parser.impl;

import java.time.ZoneId;
import java.util.Collections;
import java.util.List;

/**
 * @author Andreas
 */
public class IotConParser extends AbstractSuSMediaParser {
    @Override
    public List<String> getBaseUris() {
        return Collections.singletonList("iotcon.de");
    }

    @Override
    ZoneId getZoneId() {
        return ZoneId.of("Europe/Berlin");
    }

    @Override
    protected String getLocation() {
        return "Holiday Inn Munich City Center";
    }

}
