// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: core/src/main/java/com/nightscout/core/model/v2/g4_data.proto
package com.nightscout.core.model.v2;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.UINT32;

/**
 * Next tag: 5
 */
public final class SensorGlucoseValue extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_GLUCOSE_MGDL = 0;
  public static final Trend DEFAULT_TREND = Trend.TREND_NONE;
  public static final Noise DEFAULT_NOISE = Noise.NOISE_NONE;

  /**
   * Value calculated by the receiver as the blood sugar at the given timestamp.
   */
  @ProtoField(tag = 1, type = UINT32)
  public final Integer glucose_mgdl;

  @ProtoField(tag = 2, type = ENUM)
  public final Trend trend;

  /**
   * How noisy the g4 thinks this entry is
   */
  @ProtoField(tag = 3, type = ENUM)
  public final Noise noise;

  @ProtoField(tag = 4)
  public final G4Timestamp timestamp;

  public SensorGlucoseValue(Integer glucose_mgdl, Trend trend, Noise noise, G4Timestamp timestamp) {
    this.glucose_mgdl = glucose_mgdl;
    this.trend = trend;
    this.noise = noise;
    this.timestamp = timestamp;
  }

  private SensorGlucoseValue(Builder builder) {
    this(builder.glucose_mgdl, builder.trend, builder.noise, builder.timestamp);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SensorGlucoseValue)) return false;
    SensorGlucoseValue o = (SensorGlucoseValue) other;
    return equals(glucose_mgdl, o.glucose_mgdl)
        && equals(trend, o.trend)
        && equals(noise, o.noise)
        && equals(timestamp, o.timestamp);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = glucose_mgdl != null ? glucose_mgdl.hashCode() : 0;
      result = result * 37 + (trend != null ? trend.hashCode() : 0);
      result = result * 37 + (noise != null ? noise.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SensorGlucoseValue> {

    public Integer glucose_mgdl;
    public Trend trend;
    public Noise noise;
    public G4Timestamp timestamp;

    public Builder() {
    }

    public Builder(SensorGlucoseValue message) {
      super(message);
      if (message == null) return;
      this.glucose_mgdl = message.glucose_mgdl;
      this.trend = message.trend;
      this.noise = message.noise;
      this.timestamp = message.timestamp;
    }

    /**
     * Value calculated by the receiver as the blood sugar at the given timestamp.
     */
    public Builder glucose_mgdl(Integer glucose_mgdl) {
      this.glucose_mgdl = glucose_mgdl;
      return this;
    }

    public Builder trend(Trend trend) {
      this.trend = trend;
      return this;
    }

    /**
     * How noisy the g4 thinks this entry is
     */
    public Builder noise(Noise noise) {
      this.noise = noise;
      return this;
    }

    public Builder timestamp(G4Timestamp timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    public SensorGlucoseValue build() {
      return new SensorGlucoseValue(this);
    }
  }
}