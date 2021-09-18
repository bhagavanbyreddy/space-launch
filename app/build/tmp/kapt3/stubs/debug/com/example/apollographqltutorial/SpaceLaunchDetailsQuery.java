package com.example.apollographqltutorial;

import java.lang.System;

@kotlin.Suppress(names = {"NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName", "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006&\'()*+B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0005H\u00c6\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0014\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Operation$Variables;", "launchId", "", "(Ljava/lang/String;)V", "getLaunchId", "()Ljava/lang/String;", "variables", "component1", "composeRequestBody", "Lokio/ByteString;", "scalarTypeAdapters", "Lcom/apollographql/apollo/api/ScalarTypeAdapters;", "autoPersistQueries", "", "withQueryDocument", "copy", "equals", "other", "", "hashCode", "", "name", "Lcom/apollographql/apollo/api/OperationName;", "operationId", "parse", "Lcom/apollographql/apollo/api/Response;", "source", "Lokio/BufferedSource;", "byteString", "queryDocument", "responseFieldMapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "toString", "wrapData", "data", "Companion", "Data", "Launch", "Launch_site", "Links", "Rocket", "app_debug"})
public final class SpaceLaunchDetailsQuery implements com.apollographql.apollo.api.Query<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data, com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data, com.apollographql.apollo.api.Operation.Variables> {
    private final transient com.apollographql.apollo.api.Operation.Variables variables = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String launchId = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPERATION_ID = "f045c0ee2155d734a5aca93d485b4c3c4b011e7ba715ba2cf5ff3291dac55566";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String QUERY_DOCUMENT = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.apollographql.apollo.api.OperationName OPERATION_NAME = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String operationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String queryDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data wrapData(@org.jetbrains.annotations.Nullable()
    com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.Operation.Variables variables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.OperationName name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> responseFieldMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> parse(@org.jetbrains.annotations.NotNull()
    okio.BufferedSource source, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo.api.ScalarTypeAdapters scalarTypeAdapters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> parse(@org.jetbrains.annotations.NotNull()
    okio.ByteString byteString, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo.api.ScalarTypeAdapters scalarTypeAdapters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> parse(@org.jetbrains.annotations.NotNull()
    okio.BufferedSource source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> parse(@org.jetbrains.annotations.NotNull()
    okio.ByteString byteString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.ByteString composeRequestBody(@org.jetbrains.annotations.NotNull()
    com.apollographql.apollo.api.ScalarTypeAdapters scalarTypeAdapters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.ByteString composeRequestBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.ByteString composeRequestBody(boolean autoPersistQueries, boolean withQueryDocument, @org.jetbrains.annotations.NotNull()
    com.apollographql.apollo.api.ScalarTypeAdapters scalarTypeAdapters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchId() {
        return null;
    }
    
    public SpaceLaunchDetailsQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String launchId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery copy(@org.jetbrains.annotations.NotNull()
    java.lang.String launchId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;", "", "__typename", "", "site_name", "(Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getSite_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "marshaller", "Lcom/apollographql/apollo/api/internal/ResponseFieldMarshaller;", "toString", "Companion", "app_debug"})
    public static final class Launch_site {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String __typename = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String site_name = null;
        private static final com.apollographql.apollo.api.ResponseField[] RESPONSE_FIELDS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo.api.internal.ResponseFieldMarshaller marshaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String get__typename() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSite_name() {
            return null;
        }
        
        public Launch_site(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String site_name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site copy(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String site_name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site$Companion;", "", "()V", "RESPONSE_FIELDS", "", "Lcom/apollographql/apollo/api/ResponseField;", "[Lcom/apollographql/apollo/api/ResponseField;", "Mapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;", "invoke", "reader", "Lcom/apollographql/apollo/api/internal/ResponseReader;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site invoke(@org.jetbrains.annotations.NotNull()
            com.apollographql.apollo.api.internal.ResponseReader reader) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.Suppress(names = {"FunctionName"})
            public final com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site> Mapper() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;", "", "__typename", "", "rocket_name", "(Ljava/lang/String;Ljava/lang/String;)V", "get__typename", "()Ljava/lang/String;", "getRocket_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "marshaller", "Lcom/apollographql/apollo/api/internal/ResponseFieldMarshaller;", "toString", "Companion", "app_debug"})
    public static final class Rocket {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String __typename = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rocket_name = null;
        private static final com.apollographql.apollo.api.ResponseField[] RESPONSE_FIELDS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo.api.internal.ResponseFieldMarshaller marshaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String get__typename() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRocket_name() {
            return null;
        }
        
        public Rocket(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String rocket_name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket copy(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String rocket_name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket$Companion;", "", "()V", "RESPONSE_FIELDS", "", "Lcom/apollographql/apollo/api/ResponseField;", "[Lcom/apollographql/apollo/api/ResponseField;", "Mapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;", "invoke", "reader", "Lcom/apollographql/apollo/api/internal/ResponseReader;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket invoke(@org.jetbrains.annotations.NotNull()
            com.apollographql.apollo.api.internal.ResponseReader reader) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.Suppress(names = {"FunctionName"})
            public final com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket> Mapper() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005H\u00c6\u0003J\'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;", "", "__typename", "", "flickr_images", "", "(Ljava/lang/String;Ljava/util/List;)V", "get__typename", "()Ljava/lang/String;", "getFlickr_images", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "marshaller", "Lcom/apollographql/apollo/api/internal/ResponseFieldMarshaller;", "toString", "Companion", "app_debug"})
    public static final class Links {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String __typename = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> flickr_images = null;
        private static final com.apollographql.apollo.api.ResponseField[] RESPONSE_FIELDS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo.api.internal.ResponseFieldMarshaller marshaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String get__typename() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getFlickr_images() {
            return null;
        }
        
        public Links(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> flickr_images) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links copy(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> flickr_images) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links$Companion;", "", "()V", "RESPONSE_FIELDS", "", "Lcom/apollographql/apollo/api/ResponseField;", "[Lcom/apollographql/apollo/api/ResponseField;", "Mapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;", "invoke", "reader", "Lcom/apollographql/apollo/api/internal/ResponseReader;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links invoke(@org.jetbrains.annotations.NotNull()
            com.apollographql.apollo.api.internal.ResponseReader reader) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.Suppress(names = {"FunctionName"})
            public final com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links> Mapper() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0006\u00100\u001a\u000201J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00064"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;", "", "__typename", "", "id", "mission_name", "launch_date_local", "details", "launch_success", "", "launch_site", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;", "rocket", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;", "links", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;)V", "get__typename", "()Ljava/lang/String;", "getDetails", "getId", "getLaunch_date_local", "()Ljava/lang/Object;", "getLaunch_site", "()Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;", "getLaunch_success", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLinks", "()Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;", "getMission_name", "getRocket", "()Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch_site;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Rocket;Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Links;)Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;", "equals", "other", "hashCode", "", "marshaller", "Lcom/apollographql/apollo/api/internal/ResponseFieldMarshaller;", "toString", "Companion", "app_debug"})
    public static final class Launch {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String __typename = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String mission_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object launch_date_local = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String details = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean launch_success = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site launch_site = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket rocket = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links links = null;
        private static final com.apollographql.apollo.api.ResponseField[] RESPONSE_FIELDS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo.api.internal.ResponseFieldMarshaller marshaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String get__typename() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMission_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLaunch_date_local() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getLaunch_success() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site getLaunch_site() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket getRocket() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links getLinks() {
            return null;
        }
        
        public Launch(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String mission_name, @org.jetbrains.annotations.Nullable()
        java.lang.Object launch_date_local, @org.jetbrains.annotations.Nullable()
        java.lang.String details, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean launch_success, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site launch_site, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket rocket, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links links) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch copy(@org.jetbrains.annotations.NotNull()
        java.lang.String __typename, @org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String mission_name, @org.jetbrains.annotations.Nullable()
        java.lang.Object launch_date_local, @org.jetbrains.annotations.Nullable()
        java.lang.String details, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean launch_success, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch_site launch_site, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Rocket rocket, @org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Links links) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch$Companion;", "", "()V", "RESPONSE_FIELDS", "", "Lcom/apollographql/apollo/api/ResponseField;", "[Lcom/apollographql/apollo/api/ResponseField;", "Mapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;", "invoke", "reader", "Lcom/apollographql/apollo/api/internal/ResponseReader;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch invoke(@org.jetbrains.annotations.NotNull()
            com.apollographql.apollo.api.internal.ResponseReader reader) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.Suppress(names = {"FunctionName"})
            public final com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch> Mapper() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Data from the response after executing this GraphQL operation
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Operation$Data;", "launch", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;", "(Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;)V", "getLaunch", "()Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Launch;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "marshaller", "Lcom/apollographql/apollo/api/internal/ResponseFieldMarshaller;", "toString", "", "Companion", "app_debug"})
    public static final class Data implements com.apollographql.apollo.api.Operation.Data {
        @org.jetbrains.annotations.Nullable()
        private final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch launch = null;
        private static final com.apollographql.apollo.api.ResponseField[] RESPONSE_FIELDS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.apollographql.apollo.api.internal.ResponseFieldMarshaller marshaller() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch getLaunch() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch launch) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch component1() {
            return null;
        }
        
        /**
         * Data from the response after executing this GraphQL operation
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data copy(@org.jetbrains.annotations.Nullable()
        com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Launch launch) {
            return null;
        }
        
        /**
         * Data from the response after executing this GraphQL operation
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Data from the response after executing this GraphQL operation
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data from the response after executing this GraphQL operation
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data$Companion;", "", "()V", "RESPONSE_FIELDS", "", "Lcom/apollographql/apollo/api/ResponseField;", "[Lcom/apollographql/apollo/api/ResponseField;", "Mapper", "Lcom/apollographql/apollo/api/internal/ResponseFieldMapper;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data;", "invoke", "reader", "Lcom/apollographql/apollo/api/internal/ResponseReader;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data invoke(@org.jetbrains.annotations.NotNull()
            com.apollographql.apollo.api.internal.ResponseReader reader) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.Suppress(names = {"FunctionName"})
            public final com.apollographql.apollo.api.internal.ResponseFieldMapper<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data> Mapper() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Companion;", "", "()V", "OPERATION_ID", "", "OPERATION_NAME", "Lcom/apollographql/apollo/api/OperationName;", "getOPERATION_NAME", "()Lcom/apollographql/apollo/api/OperationName;", "QUERY_DOCUMENT", "getQUERY_DOCUMENT", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQUERY_DOCUMENT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.apollographql.apollo.api.OperationName getOPERATION_NAME() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}