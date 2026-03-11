package com.google.protobuf;

/** */
public final class InvalidProtobufRuntimeException extends RuntimeException {
  public InvalidProtobufRuntimeException(String message) {
    super(message);
  }

  public InvalidProtobufRuntimeException(Exception e) {
    super(e.getMessage(), e);
  }
}
