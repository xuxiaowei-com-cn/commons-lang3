package cn.com.xuxiaowei.filter;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * 日志 过滤器
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Setter
@Component
public class LogHttpFilter extends HttpFilter implements Ordered {

    public static final int ORDERED = Ordered.HIGHEST_PRECEDENCE;

    private int order = ORDERED;

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info(String.valueOf(LocalDateTime.now()));
        log.info(String.valueOf(RandomStringUtils.randomAlphanumeric(8)));
        log.info(String.valueOf(LocalDateTime.now()));

        super.doFilter(request, response, chain);
    }

}
