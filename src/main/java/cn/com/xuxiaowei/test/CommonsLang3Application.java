package cn.com.xuxiaowei.test;

import java.security.SecureRandom;

/**
 * 仅用于测试
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class CommonsLang3Application {

    private static final String NAME = "org.apache.commons:commons-lang3:3.15.0";

    private static final String METHOD = "RandomStringUtils.randomAlphanumeric(8)";

    private static final ThreadLocal<SecureRandom> RANDOM = ThreadLocal.withInitial(() -> {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    });

    public static void main(String[] args) {
        System.out.println("项目地址：https://github.com/xuxiaowei-com-cn/commons-lang3");
        System.out.printf("此项目仅用于测试 %s 中 %s 使用时是否正常%n", NAME, METHOD);
        System.out.printf("如果下方不能正常输出一个随机数后程序正常停止，而是软件卡住无响应，则代表无法运行 %s 中的 %s%n", NAME, METHOD);
        System.out.println(RANDOM.get().nextInt());
        System.out.printf("恭喜，你的电脑可以运行 %s 中的 %s 方法", NAME, METHOD);
    }

}
