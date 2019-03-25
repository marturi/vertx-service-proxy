package io.vertx.serviceproxy.codegen.proxytestapi;

import io.vertx.core.json.JsonCodec;

import java.time.ZonedDateTime;

public class ZonedDateTimeCodec implements JsonCodec<ZonedDateTime, String> {

  public static class ZonedDateTimeCodecHolder {
    static final ZonedDateTimeCodec INSTANCE = new ZonedDateTimeCodec();
  }

  public static ZonedDateTimeCodec getInstance() { return ZonedDateTimeCodecHolder.INSTANCE; }

  @Override
  public String encode(ZonedDateTime value) {
    return (value != null) ? value.toString() : null;
  }

  @Override
  public ZonedDateTime decode(String value) {
    return (value != null) ? ZonedDateTime.parse(value) : null;
  }
}
