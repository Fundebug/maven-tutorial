### 打包

```bash
mvn package
```

### 运行

使用 java 命令运行：

```bash
java -cp target/hello-1.0.jar:$HOME/.m2/repository/org/json/json/20180813/json-20180813.jar com.fundebug.Hello
```

使用 mvn 命令运行：

```bash
mvn exec:java -Dexec.mainClass="com.fundebug.Hello"
```
