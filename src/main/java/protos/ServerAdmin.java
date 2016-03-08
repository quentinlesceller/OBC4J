// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server_admin.proto

package protos;
@SuppressWarnings("unused")
public final class ServerAdmin {
  private ServerAdmin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ServerStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.ServerStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
     */
    int getStatusValue();
    /**
     * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
     */
    protos.ServerAdmin.ServerStatus.StatusCode getStatus();
  }
  /**
   * Protobuf type {@code protos.ServerStatus}
   */
  public  static final class ServerStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protos.ServerStatus)
      ServerStatusOrBuilder {
    // Use ServerStatus.newBuilder() to construct.
    private ServerStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ServerStatus() {
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ServerStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              status_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.ServerAdmin.internal_static_protos_ServerStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.ServerAdmin.internal_static_protos_ServerStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.ServerAdmin.ServerStatus.class, protos.ServerAdmin.ServerStatus.Builder.class);
    }

    /**
     * Protobuf enum {@code protos.ServerStatus.StatusCode}
     */
    public enum StatusCode
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNDEFINED = 0;</code>
       */
      UNDEFINED(0, 0),
      /**
       * <code>STARTED = 1;</code>
       */
      STARTED(1, 1),
      /**
       * <code>STOPPED = 2;</code>
       */
      STOPPED(2, 2),
      /**
       * <code>PAUSED = 3;</code>
       */
      PAUSED(3, 3),
      /**
       * <code>ERROR = 4;</code>
       */
      ERROR(4, 4),
      /**
       * <code>UNKNOWN = 5;</code>
       */
      UNKNOWN(5, 5),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>UNDEFINED = 0;</code>
       */
      public static final int UNDEFINED_VALUE = 0;
      /**
       * <code>STARTED = 1;</code>
       */
      public static final int STARTED_VALUE = 1;
      /**
       * <code>STOPPED = 2;</code>
       */
      public static final int STOPPED_VALUE = 2;
      /**
       * <code>PAUSED = 3;</code>
       */
      public static final int PAUSED_VALUE = 3;
      /**
       * <code>ERROR = 4;</code>
       */
      public static final int ERROR_VALUE = 4;
      /**
       * <code>UNKNOWN = 5;</code>
       */
      public static final int UNKNOWN_VALUE = 5;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      public static StatusCode valueOf(int value) {
        switch (value) {
          case 0: return UNDEFINED;
          case 1: return STARTED;
          case 2: return STOPPED;
          case 3: return PAUSED;
          case 4: return ERROR;
          case 5: return UNKNOWN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          StatusCode> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
              public StatusCode findValueByNumber(int number) {
                return StatusCode.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return protos.ServerAdmin.ServerStatus.getDescriptor().getEnumTypes().get(0);
      }

      private static final StatusCode[] VALUES = values();

      public static StatusCode valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private StatusCode(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protos.ServerStatus.StatusCode)
    }

    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
     */
    public protos.ServerAdmin.ServerStatus.StatusCode getStatus() {
      protos.ServerAdmin.ServerStatus.StatusCode result = protos.ServerAdmin.ServerStatus.StatusCode.valueOf(status_);
      return result == null ? protos.ServerAdmin.ServerStatus.StatusCode.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (status_ != protos.ServerAdmin.ServerStatus.StatusCode.UNDEFINED.getNumber()) {
        output.writeEnum(1, status_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (status_ != protos.ServerAdmin.ServerStatus.StatusCode.UNDEFINED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, status_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protos.ServerAdmin.ServerStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.ServerAdmin.ServerStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.ServerAdmin.ServerStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.ServerAdmin.ServerStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.ServerAdmin.ServerStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);}
    public static protos.ServerAdmin.ServerStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input, extensionRegistry);}
    public static protos.ServerAdmin.ServerStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(PARSER, input);}
    public static protos.ServerAdmin.ServerStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(PARSER, input, extensionRegistry);}
    public static protos.ServerAdmin.ServerStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);}
    public static protos.ServerAdmin.ServerStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input, extensionRegistry);}

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protos.ServerAdmin.ServerStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protos.ServerStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.ServerStatus)
        protos.ServerAdmin.ServerStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protos.ServerAdmin.internal_static_protos_ServerStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protos.ServerAdmin.internal_static_protos_ServerStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protos.ServerAdmin.ServerStatus.class, protos.ServerAdmin.ServerStatus.Builder.class);
      }

      // Construct using protos.ServerAdmin.ServerStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        status_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protos.ServerAdmin.internal_static_protos_ServerStatus_descriptor;
      }

      public protos.ServerAdmin.ServerStatus getDefaultInstanceForType() {
        return protos.ServerAdmin.ServerStatus.getDefaultInstance();
      }

      public protos.ServerAdmin.ServerStatus build() {
        protos.ServerAdmin.ServerStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protos.ServerAdmin.ServerStatus buildPartial() {
        protos.ServerAdmin.ServerStatus result = new protos.ServerAdmin.ServerStatus(this);
        result.status_ = status_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protos.ServerAdmin.ServerStatus) {
          return mergeFrom((protos.ServerAdmin.ServerStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protos.ServerAdmin.ServerStatus other) {
        if (other == protos.ServerAdmin.ServerStatus.getDefaultInstance()) return this;
        if (other.status_ != 0) {
          setStatusValue(other.getStatusValue());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protos.ServerAdmin.ServerStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protos.ServerAdmin.ServerStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int status_ = 0;
      /**
       * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
       */
      public int getStatusValue() {
        return status_;
      }
      /**
       * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
       */
      public Builder setStatusValue(int value) {
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
       */
      public protos.ServerAdmin.ServerStatus.StatusCode getStatus() {
        protos.ServerAdmin.ServerStatus.StatusCode result = protos.ServerAdmin.ServerStatus.StatusCode.valueOf(status_);
        return result == null ? protos.ServerAdmin.ServerStatus.StatusCode.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
       */
      public Builder setStatus(protos.ServerAdmin.ServerStatus.StatusCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .protos.ServerStatus.StatusCode status = 1;</code>
       */
      public Builder clearStatus() {
        
        status_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protos.ServerStatus)
    }

    // @@protoc_insertion_point(class_scope:protos.ServerStatus)
    private static final protos.ServerAdmin.ServerStatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protos.ServerAdmin.ServerStatus();
    }

    public static protos.ServerAdmin.ServerStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerStatus>
        PARSER = new com.google.protobuf.AbstractParser<ServerStatus>() {
      public ServerStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new ServerStatus(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<ServerStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerStatus> getParserForType() {
      return PARSER;
    }

    public protos.ServerAdmin.ServerStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ServerStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protos_ServerStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022server_admin.proto\022\006protos\032\033google/pro" +
      "tobuf/empty.proto\"\232\001\n\014ServerStatus\022/\n\006st" +
      "atus\030\001 \001(\0162\037.protos.ServerStatus.StatusC" +
      "ode\"Y\n\nStatusCode\022\r\n\tUNDEFINED\020\000\022\013\n\007STAR" +
      "TED\020\001\022\013\n\007STOPPED\020\002\022\n\n\006PAUSED\020\003\022\t\n\005ERROR\020" +
      "\004\022\013\n\007UNKNOWN\020\0052\301\001\n\005Admin\022;\n\tGetStatus\022\026." +
      "google.protobuf.Empty\032\024.protos.ServerSta" +
      "tus\"\000\022=\n\013StartServer\022\026.google.protobuf.E" +
      "mpty\032\024.protos.ServerStatus\"\000\022<\n\nStopServ" +
      "er\022\026.google.protobuf.Empty\032\024.protos.Serv",
      "erStatus\"\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_protos_ServerStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_ServerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protos_ServerStatus_descriptor,
        new java.lang.String[] { "Status", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}