1.启动zooker：先安装zookeeper默认配置，都不动，直接启动 zkServer.cmd
2.启动kafka：下载kafka http://kafka.apache.org/downloads， 在命令行中输入：.\bin\windows\kafka-server-start.bat .\config\server.properties   回车
3.启动工程：mvnw.cmd直接build工程,import工程,以maven工程导入,build工程,在idea右侧Maven Projects栏中刷新,自动下载所有依赖
  运行SpringKfkApplication类的main方法

4.测试： 浏览器串输入 http://localhost:8080/kafka/send?message=35e2362
  看到Listener类下的listen方法被调用，则实验成功!