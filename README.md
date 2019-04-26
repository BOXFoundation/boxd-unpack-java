# boxd-unpack-java： Boxd Java SDK API

  Boxd-unpack-java is a java library for working with integrating with clients(Boxd Rpc Node) on the Boxd network.

## Features

- Complete implementation of Boxd's RPC client API
- Boxd account related implementations
- Signature related implementations

## Getting started

The project is based on Java8. If your Java version is less than Java8, please upgrade your Java version first.  

Add the relevant dependency to your project:

### Maven

```
<dependency>
  <groupId>one.contentbox.boxd</groupId>
  <artifactId>boxd-client</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle

```
implementation 'one.contentbox.boxd:boxd-client:0.0.1'
```

### SBT

```
libraryDependencies += "one.contentbox.boxd" % "boxd-client" % "0.0.1"
```

### Ivy

```
<dependency org="one.contentbox.boxd" name="boxd-client" rev="0.0.1" />
```

###  Grape

```
@Grapes(
  @Grab(group='one.contentbox.boxd', module='boxd-client', version='0.0.1')
)
```

### Buildr

```
'one.contentbox.boxd:boxd-client:jar:0.0.1'
```

### Bazel

```
maven_jar(
    name = "boxd-client",
    artifact = "one.contentbox.boxd:boxd-client:0.0.1",
    sha1 = "7980490ab9c8de4ddad79fa49302f60a82ade908",
)
```

## Start sending requests

To send requests:

```
String host = "39.97.169.1";
int port = 19111;
BoxdClient boxdClient = new RpcBoxdClientImpl(host, port);
int height = boxdClient.getBlockHeight();
```

To listen the block event:

```
String host = "39.97.169.1";
int port = 19111;
BoxdDaemon boxdDaemon = new BoxdDaemon(host, port);
boxdDaemon.setBlockListener(new BlockListener() {
  @Override
  public void blockDetected(BlockDetail blockDetail) {
    try {
      one.contentbox.boxd.protocol.core.response.block.BlockDetail bd = ProtobufSerdeUtils
                            .protobufToJavaBean(blockDetail,     one.contentbox.boxd.protocol.core.response.block.BlockDetail.class);

      System.out.println(JSON.toJSONString(bd, true));
    }catch (BoxdException e){
      e.printStackTrace();
    }
  }
});
boxdDaemon.start();
```


## Snapshot Dependencies

Snapshot versions of boxd-unpack-java follow the \<major\>.\<minor\>.\<build\>-SNAPSHOT convention.
  
If you would like to use snapshots instead please add a new maven repository pointing to:

```
https://oss.sonatype.org/content/repositories/snapshots
```

Please refer to the [maven](https://maven.apache.org/guides/mini/guide-multiple-repositories.html "maven") or [gradle](https://maven.apache.org/guides/mini/guide-multiple-repositories.html "gradle") documentation for further detail.

Sample gradle configuration:

```
repositories {
   maven {
      url "https://oss.sonatype.org/content/repositories/snapshots"
   }
}
```

Sample maven configuration:

```
<repositories>
  <repository>
    <id>sonatype-snasphots</id>
    <name>Sonatype snapshots repo</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
  </repository>
</repositories>
```


