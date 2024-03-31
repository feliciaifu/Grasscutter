// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarChangeCostumeNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarChangeCostumeNotifyOuterClass {
  private AvatarChangeCostumeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarChangeCostumeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarChangeCostumeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     * @return Whether the entityInfo field is set.
     */
    boolean hasEntityInfo();
    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     * @return The entityInfo.
     */
    emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityInfo();
    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     */
    emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 1644
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code AvatarChangeCostumeNotify}
   */
  public static final class AvatarChangeCostumeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarChangeCostumeNotify)
      AvatarChangeCostumeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarChangeCostumeNotify.newBuilder() to construct.
    private AvatarChangeCostumeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarChangeCostumeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarChangeCostumeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarChangeCostumeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 58: {
              emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder subBuilder = null;
              if (entityInfo_ != null) {
                subBuilder = entityInfo_.toBuilder();
              }
              entityInfo_ = input.readMessage(emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityInfo_);
                entityInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.internal_static_AvatarChangeCostumeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.internal_static_AvatarChangeCostumeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.class, emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.Builder.class);
    }

    public static final int ENTITY_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo entityInfo_;
    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     * @return Whether the entityInfo field is set.
     */
    @java.lang.Override
    public boolean hasEntityInfo() {
      return entityInfo_ != null;
    }
    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     * @return The entityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityInfo() {
      return entityInfo_ == null ? emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : entityInfo_;
    }
    /**
     * <code>.SceneEntityInfo entity_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityInfoOrBuilder() {
      return getEntityInfo();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (entityInfo_ != null) {
        output.writeMessage(7, getEntityInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getEntityInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify other = (emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify) obj;

      if (hasEntityInfo() != other.hasEntityInfo()) return false;
      if (hasEntityInfo()) {
        if (!getEntityInfo()
            .equals(other.getEntityInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasEntityInfo()) {
        hash = (37 * hash) + ENTITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEntityInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 1644
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code AvatarChangeCostumeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarChangeCostumeNotify)
        emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.internal_static_AvatarChangeCostumeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.internal_static_AvatarChangeCostumeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.class, emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (entityInfoBuilder_ == null) {
          entityInfo_ = null;
        } else {
          entityInfo_ = null;
          entityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.internal_static_AvatarChangeCostumeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify build() {
        emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify result = new emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify(this);
        if (entityInfoBuilder_ == null) {
          result.entityInfo_ = entityInfo_;
        } else {
          result.entityInfo_ = entityInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify.getDefaultInstance()) return this;
        if (other.hasEntityInfo()) {
          mergeEntityInfo(other.getEntityInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo entityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> entityInfoBuilder_;
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       * @return Whether the entityInfo field is set.
       */
      public boolean hasEntityInfo() {
        return entityInfoBuilder_ != null || entityInfo_ != null;
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       * @return The entityInfo.
       */
      public emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityInfo() {
        if (entityInfoBuilder_ == null) {
          return entityInfo_ == null ? emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : entityInfo_;
        } else {
          return entityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public Builder setEntityInfo(emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityInfo_ = value;
          onChanged();
        } else {
          entityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public Builder setEntityInfo(
          emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityInfoBuilder_ == null) {
          entityInfo_ = builderForValue.build();
          onChanged();
        } else {
          entityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public Builder mergeEntityInfo(emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityInfoBuilder_ == null) {
          if (entityInfo_ != null) {
            entityInfo_ =
              emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder(entityInfo_).mergeFrom(value).buildPartial();
          } else {
            entityInfo_ = value;
          }
          onChanged();
        } else {
          entityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public Builder clearEntityInfo() {
        if (entityInfoBuilder_ == null) {
          entityInfo_ = null;
          onChanged();
        } else {
          entityInfo_ = null;
          entityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder getEntityInfoBuilder() {
        
        onChanged();
        return getEntityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      public emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityInfoOrBuilder() {
        if (entityInfoBuilder_ != null) {
          return entityInfoBuilder_.getMessageOrBuilder();
        } else {
          return entityInfo_ == null ?
              emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance() : entityInfo_;
        }
      }
      /**
       * <code>.SceneEntityInfo entity_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
          getEntityInfoFieldBuilder() {
        if (entityInfoBuilder_ == null) {
          entityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(
                  getEntityInfo(),
                  getParentForChildren(),
                  isClean());
          entityInfo_ = null;
        }
        return entityInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AvatarChangeCostumeNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarChangeCostumeNotify)
    private static final emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify();
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarChangeCostumeNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarChangeCostumeNotify>() {
      @java.lang.Override
      public AvatarChangeCostumeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarChangeCostumeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarChangeCostumeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarChangeCostumeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarChangeCostumeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarChangeCostumeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AvatarChangeCostumeNotify.proto\032\025Scene" +
      "EntityInfo.proto\"B\n\031AvatarChangeCostumeN" +
      "otify\022%\n\013entity_info\030\007 \001(\0132\020.SceneEntity" +
      "InfoB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SceneEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarChangeCostumeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarChangeCostumeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarChangeCostumeNotify_descriptor,
        new java.lang.String[] { "EntityInfo", });
    emu.grasscutter.net.proto.SceneEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
