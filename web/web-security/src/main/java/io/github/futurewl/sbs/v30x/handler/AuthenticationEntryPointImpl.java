package io.github.futurewl.sbs.v31x.handler;

import com.alibaba.fastjson.JSON;
import io.github.futurewl.sbs.v31x.common.ResponseResult;
import io.github.futurewl.sbs.v31x.utils.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException authException
    ) throws IOException, ServletException {
        ResponseResult result = new ResponseResult(HttpStatus.UNAUTHORIZED.value(), "认证失败，请重新登录");
        String json = JSON.toJSONString(result);
        WebUtils.renderString(response, json);
    }
}
