package com.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author alvin
 * @filename LongJsonSerializer.java
 * @date 2018年8月8日 下午2:25:09
 * @description Long 类型字段序列化时转为字符串，避免js丢失精度
 */
public class LongJsonSerializer extends JsonSerializer<Long> {
  @Override
  public void serialize(
      Long value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {
    String text = (value == null ? null : String.valueOf(value));
    if (text != null) {
      jsonGenerator.writeString(text);
    }
  }
}
