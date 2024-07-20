1. 此项目仅用于测试 org.apache.commons:commons-lang3:3.15.0 中 RandomStringUtils.randomAlphanumeric(8) 使用时是否正常
2. 如果运行项目不能正常输出一个随机数后程序正常停止，而是软件卡住无响应，则代表无法运行
   org.apache.commons:commons-lang3:3.15.0 中的 RandomStringUtils.randomAlphanumeric(8)
3. 如果在 CentOS 系列中无法运行，请尝试安装运行 rng-tools：
   ```shell
   sudo yum -y install rng-tools
   sudo systemctl enable rngd.service
   sudo systemctl start rngd.service
   ```
