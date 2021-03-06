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
public class Url extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6365401320859971546L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Url\",\"namespace\":\"com.pagisoft.datafetcher.model.allegro\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Url> ENCODER =
      new BinaryMessageEncoder<Url>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Url> DECODER =
      new BinaryMessageDecoder<Url>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Url> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Url> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Url>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Url to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Url from a ByteBuffer. */
  public static Url fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String url;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Url() {}

  /**
   * All-args constructor.
   * @param url The new value for url
   */
  public Url(java.lang.String url) {
    this.url = url;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return url;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: url = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.String value) {
    this.url = value;
  }

  /**
   * Creates a new Url RecordBuilder.
   * @return A new Url RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Url.Builder newBuilder() {
    return new com.pagisoft.datafetcher.model.allegro.Url.Builder();
  }

  /**
   * Creates a new Url RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Url RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Url.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Url.Builder other) {
    return new com.pagisoft.datafetcher.model.allegro.Url.Builder(other);
  }

  /**
   * Creates a new Url RecordBuilder by copying an existing Url instance.
   * @param other The existing instance to copy.
   * @return A new Url RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Url.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Url other) {
    return new com.pagisoft.datafetcher.model.allegro.Url.Builder(other);
  }

  /**
   * RecordBuilder for Url instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Url>
    implements org.apache.avro.data.RecordBuilder<Url> {

    private java.lang.String url;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Url.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Url instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Url other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.String getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Url.Builder setUrl(java.lang.String value) {
      validate(fields()[0], value);
      this.url = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Url.Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Url build() {
      try {
        Url record = new Url();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Url>
    WRITER$ = (org.apache.avro.io.DatumWriter<Url>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Url>
    READER$ = (org.apache.avro.io.DatumReader<Url>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
