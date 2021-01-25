package com.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * @author alvin
 * @filename LongJsonDeserializer.java
 * @date 2018年8月8日 下午2:25:55
 * @description 将字符串转为Long
 */
public class LongJsonDeserializer extends JsonDeserializer<Long> {

  @Override
  public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {
    String value = jsonParser.getText();
    try {
      return value == null ? null : Long.parseLong(value);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
