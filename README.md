1. 此项目仅用于测试 org.apache.commons:commons-lang3:3.15.0 中 RandomStringUtils.randomAlphanumeric(8) 使用时是否正常
2. 如果运行项目不能正常输出一个随机数后程序正常停止，而是软件卡住无响应，则代表无法运行
   org.apache.commons:commons-lang3:3.15.0 中的 RandomStringUtils.randomAlphanumeric(8)
3. 如果在 CentOS 系列中无法运行，请尝试安装运行 rng-tools：
   ```shell
   sudo yum -y install rng-tools
   sudo systemctl enable rngd.service
   sudo systemctl start rngd.service
   ```
4. 运行 https://s01.oss.sonatype.org/content/repositories/public/cn/com/xuxiaowei/test/commons-lang3/ 中的 jar 包可以快速测试
5. 运行 https://hub.docker.com/r/xuxiaoweicomcn/commons-lang3/tags 中的镜像可以快速测试
