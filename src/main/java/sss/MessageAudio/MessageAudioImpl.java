// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageAudio.proto

package sss.MessageAudio;

public final class MessageAudioImpl {
  private MessageAudioImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sss_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sss_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sss_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sss_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sss_AudioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sss_AudioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sss_AudioRespon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sss_AudioRespon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MessageAudio.proto\022\003sss\"!\n\016MessageRequ" +
      "est\022\017\n\007request\030\001 \001(\t\"\"\n\017MessageResponse\022" +
      "\017\n\007message\030\001 \001(\t\"!\n\014AudioRequest\022\021\n\taudi" +
      "osend\030\001 \001(\014\"$\n\013AudioRespon\022\025\n\raudiorecei" +
      "ved\030\001 \001(\0142~\n\014MessageAudio\022:\n\013PushMessage" +
      "\022\023.sss.MessageRequest\032\024.sss.MessageRespo" +
      "nse\"\000\0222\n\005Audio\022\021.sss.AudioRequest\032\020.sss." +
      "AudioRespon\"\000(\0010\001B&\n\020sss.MessageAudioB\020M" +
      "essageAudioImplP\001b\006proto3"
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
        }, assigner);
    internal_static_sss_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sss_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sss_MessageRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_sss_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sss_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sss_MessageResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_sss_AudioRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sss_AudioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sss_AudioRequest_descriptor,
        new java.lang.String[] { "Audiosend", });
    internal_static_sss_AudioRespon_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sss_AudioRespon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sss_AudioRespon_descriptor,
        new java.lang.String[] { "Audioreceived", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}