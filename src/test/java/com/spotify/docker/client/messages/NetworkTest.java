package com.spotify.docker.client.messages;

import static com.spotify.docker.FixtureUtil.fixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.docker.client.ObjectMapperProvider;

import org.junit.Test;

public class NetworkTest {

  private final ObjectMapper objectMapper = ObjectMapperProvider.objectMapper();

  @Test
  public void test1_23() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.23/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.23/network2.json"), Network.class);
  }

  @Test
  public void test1_26() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.26/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.26/network2.json"), Network.class);
  }

  @Test
  public void test1_30() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.30/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.30/network2.json"), Network.class);
  }
}