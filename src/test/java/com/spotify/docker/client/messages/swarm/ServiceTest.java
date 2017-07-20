package com.spotify.docker.client.messages.swarm;

import static com.spotify.docker.FixtureUtil.fixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.docker.client.ObjectMapperProvider;

import org.junit.Test;

public class ServiceTest {

  private final ObjectMapper objectMapper = ObjectMapperProvider.objectMapper();

  @Test
  public void test1_30() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.30/service.json"), Service.class);
  }

}