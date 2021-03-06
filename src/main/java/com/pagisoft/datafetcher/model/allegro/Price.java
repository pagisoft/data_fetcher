/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pagisoft.datafetcher.model.allegro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Price extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8808679207295901494L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Price\",\"namespace\":\"com.pagisoft.datafetcher.model.allegro\",\"fields\":[{\"name\":\"amount\",\"type\":\"float\"},{\"name\":\"currency\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Price> ENCODER =
      new BinaryMessageEncoder<Price>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Price> DECODER =
      new BinaryMessageDecoder<Price>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Price> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Price> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Price>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Price to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Price from a ByteBuffer. */
  public static Price fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public float amount;
  @Deprecated public java.lang.String currency;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Price() {}

  /**
   * All-args constructor.
   * @param amount The new value for amount
   * @param currency The new value for currency
   */
  public Price(java.lang.Float amount, java.lang.String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return amount;
    case 1: return currency;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: amount = (java.lang.Float)value$; break;
    case 1: currency = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.Float getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Float value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public java.lang.String getCurrency() {
    return currency;
  }

  /**
   * Sets the value of the 'currency' field.
   * @param value the value to set.
   */
  public void setCurrency(java.lang.String value) {
    this.currency = value;
  }

  /**
   * Creates a new Price RecordBuilder.
   * @return A new Price RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Price.Builder newBuilder() {
    return new com.pagisoft.datafetcher.model.allegro.Price.Builder();
  }

  /**
   * Creates a new Price RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Price RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Price.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Price.Builder other) {
    return new com.pagisoft.datafetcher.model.allegro.Price.Builder(other);
  }

  /**
   * Creates a new Price RecordBuilder by copying an existing Price instance.
   * @param other The existing instance to copy.
   * @return A new Price RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Price.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Price other) {
    return new com.pagisoft.datafetcher.model.allegro.Price.Builder(other);
  }

  /**
   * RecordBuilder for Price instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Price>
    implements org.apache.avro.data.RecordBuilder<Price> {

    private float amount;
    private java.lang.String currency;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Price.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Price instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Price other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.Float getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Price.Builder setAmount(float value) {
      validate(fields()[0], value);
      this.amount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Price.Builder clearAmount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public java.lang.String getCurrency() {
      return currency;
    }

    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Price.Builder setCurrency(java.lang.String value) {
      validate(fields()[1], value);
      this.currency = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Price.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Price build() {
      try {
        Price record = new Price();
        record.amount = fieldSetFlags()[0] ? this.amount : (java.lang.Float) defaultValue(fields()[0]);
        record.currency = fieldSetFlags()[1] ? this.currency : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Price>
    WRITER$ = (org.apache.avro.io.DatumWriter<Price>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Price>
    READER$ = (org.apache.avro.io.DatumReader<Price>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
