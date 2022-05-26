# Test

## Profiles

| PROFILE | ACTIVE BY DEFAULT | REQUIRES | DESCRIPTION |
|-|-|-|-|
| `bar` | `false` | `test` | Running tests of `bar` Spring profile. |
| `foo` | `false` | `test` | Running tests of `foo` Spring profile. |
| `test` | `true` | | Running tests of `test` Spring profile. |

## Testing all profiles

Can be easily test with the
[maven wrapper](https://github.com/takari/maven-wrapper).

```sh
./mvnw --activate-profiles bar,foo,test --batch-mode --no-transfer-progress \
--update-snapshots clean test
```

> ***NOTE:*** You also need [JDK 8 or above](https://adoptium.net).

> ***NOTE:*** If you want to build with the regular `mvn` command, you will need
[Maven 3.5.0 or above](https://maven.apache.org/docs/history.html).

> ***NOTE:*** You may need to increase the amount of memory available to Maven
> by setting a `MAVEN_OPTS` environment variable with the value `-Xmx512m`.
> Remember to set the corresponding property in your _IDE_ as well if you are
> building and running tests there (e.g. in _Eclipse_ go to
> _Preferences→Java→Installed JREs_ and edit the _JRE_ definition so that all
> processes are launched with those arguments). This property is automatically
> set if you use the maven wrapper.

## Testing only one profile

```sh
./mvnw --activate-profiles test --batch-mode --no-transfer-progress \
--update-snapshots clean test
```

```sh
./mvnw --activate-profiles bar,test --batch-mode --no-transfer-progress \
--update-snapshots clean test
```

```sh
./mvnw --activate-profiles foo,test --batch-mode --no-transfer-progress \
--update-snapshots clean test
```

## Docs and refs

### [Maven Model]

* [Descriptor Reference](https://maven.apache.org/ref/current/maven-model/maven.html)

### [Property Expansion]

* [Automatically Expand Properties at Build Time](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.properties-and-configuration.expand-properties)

### [GMavenPlus]

* [Executing a Groovy script](https://github.com/groovy/GMavenPlus/wiki/Usage#executing-a-groovy-script)
