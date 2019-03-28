#!/bin/sh

  cp -r build/generated/source/proto/main/java/one/ src/main/java/
  mkdir src/main/java/contentbox/boxd/rpc
  cp -r build/generated/source/proto/main/grpc/one/contentbox/boxd/proto/*.java	 src/main/java/contentbox/boxd/rpc
