# boxd-unpack-java

##  Add the dependency

1.  Using jitpack

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.wangjunbao2018:boxd-unpack-java:v0.0.1'
	}
```

2. Using jcenter

```
buildscript {
    repositories {
        jcenter()
    }
}

dependencies {
	        implementation 'com.github.wangjunbao2018:boxd-unpack-java:v0.0.1'
}
```

3. Using mavenCenter

```
buildscript {
    repositories {
        mavenLocal()
    }
}

dependencies {
	        implementation 'com.github.wangjunbao2018:boxd-unpack-java:v0.0.1'
}
```

4. Using raw github

```
repositories {
    maven {
        url 'https://raw.github.com/wangjunbao2018/maven-repo/master/0.0.1'
    }
}

dependencies {
    compile 'one.contentbox.boxd:boxd-client:0.0.1'
}

```



## Upload the jar to mvn repos

1.  jcenter

- config
```
bintray.user=
bintray.apikey=
```

- upload

```
gradlew clean build bintrayUpload -PdryRun=false
```

2. maven central

- config
```
signing.keyId=
signing.password=
signing.secretKeyRingFile=

NEXUS_USERNAME=
NEXUS_PASSWORD=
```

- upload
```
 gradle uploadArchives
```


## Create keys

```
brew  install -v gpg
gpg  --generate-key
gpg -k
gpg --export-secret-keys 067781F5FD36625E3F39DCE2104256C8753F5D10 > secret.gpg
gpg --keyserver keyserver.ubuntu.com --send-keys 067781F5FD36625E3F39DCE2104256C8753F5D10
gpg --keyserver keys.gnupg.net --send-keys 067781F5FD36625E3F39DCE2104256C8753F5D10
gpg --keyserver pool.sks-keyservers.net --send-keys 067781F5FD36625E3F39DCE2104256C8753F5D10
```
