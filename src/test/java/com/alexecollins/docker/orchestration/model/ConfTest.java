package com.alexecollins.docker.orchestration.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ConfTest {
    private static final ObjectMapper MAPPER = new ObjectMapper(new YAMLFactory());

    @Test
    public void test() throws Exception {
        final Conf conf = MAPPER.readValue(getClass().getResource("/conf.yml"), Conf.class);

        assertNotNull(conf.getLinks());
        assertNotNull(conf.getPackaging());
        assertNotNull(conf.getPorts());
        assertNotNull(conf.getVolumesFrom());
    }
}
