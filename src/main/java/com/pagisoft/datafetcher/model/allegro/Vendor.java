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
public class Vendor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8586581016437980240L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Vendor\",\"namespace\":\"com.pagisoft.datafetcher.model.allegro\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Vendor> ENCODER =
      new BinaryMessageEncoder<Vendor>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Vendor> DECODER =
      new BinaryMessageDecoder<Vendor>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Vendor> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Vendor> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Vendor>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Vendor to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Vendor from a ByteBuffer. */
  public static Vendor fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String url;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Vendor() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param url The new value for url
   */
  public Vendor(java.lang.String id, java.lang.String url) {
    this.id = id;
    this.url = url;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return url;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: url = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
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
   * Creates a new Vendor RecordBuilder.
   * @return A new Vendor RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Vendor.Builder newBuilder() {
    return new com.pagisoft.datafetcher.model.allegro.Vendor.Builder();
  }

  /**
   * Creates a new Vendor RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Vendor RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Vendor.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Vendor.Builder other) {
    return new com.pagisoft.datafetcher.model.allegro.Vendor.Builder(other);
  }

  /**
   * Creates a new Vendor RecordBuilder by copying an existing Vendor instance.
   * @param other The existing instance to copy.
   * @return A new Vendor RecordBuilder
   */
  public static com.pagisoft.datafetcher.model.allegro.Vendor.Builder newBuilder(com.pagisoft.datafetcher.model.allegro.Vendor other) {
    return new com.pagisoft.datafetcher.model.allegro.Vendor.Builder(other);
  }

  /**
   * RecordBuilder for Vendor instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Vendor>
    implements org.apache.avro.data.RecordBuilder<Vendor> {

    private java.lang.String id;
    private java.lang.String url;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Vendor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.url)) {
        this.url = data().deepCopy(fields()[1].schema(), other.url);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Vendor instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pagisoft.datafetcher.model.allegro.Vendor other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.url)) {
        this.url = data().deepCopy(fields()[1].schema(), other.url);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Vendor.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Vendor.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public com.pagisoft.datafetcher.model.allegro.Vendor.Builder setUrl(java.lang.String value) {
      validate(fields()[1], value);
      this.url = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.pagisoft.datafetcher.model.allegro.Vendor.Builder clearUrl() {
      url = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Vendor build() {
      try {
        Vendor record = new Vendor();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.url = fieldSetFlags()[1] ? this.url : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Vendor>
    WRITER$ = (org.apache.avro.io.DatumWriter<Vendor>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Vendor>
    READER$ = (org.apache.avro.io.DatumReader<Vendor>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
