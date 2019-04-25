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

```
gradlew clean build bintrayUpload -PdryRun=false

```

2. maven central

```
 gradle uploadArchives
```


