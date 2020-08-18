package com.itheilv.login.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author WSQ
 * @since 2020/6/8
 * 支付宝第三方登录
 */
@Controller
@RequestMapping("/sys_user")
public class AlipayLoginController {

    private static final String APP_ID = "******";
    private static final String APP_PRIVATE_KEY = "*******";
    private static final String CHARSET = "UTF-8";
    private static final String ALIPAY_PUBLIC_KEY = "******";
    private static final String REDIRECT_URI = "http%3A%2F%2Fitheilv.com%2Fsys_user%2Fconnection";
    private static final String URL = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=" + APP_ID + "&scope=auth_user&redirect_uri=" + REDIRECT_URI + "";
    //

    @RequestMapping("/loginByAliPay")
    public void login(HttpServletResponse response) throws IOException {
        response.sendRedirect(URL);
    }

    @RequestMapping("/connection")
    public String redirect(String auth_code, Model model) {
        String accessToken = "";
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
        request.setCode(auth_code);
        request.setGrantType("authorization_code");
        try {
            AlipaySystemOauthTokenResponse oauthTokenResponse = alipayClient.execute(request);
            accessToken = oauthTokenResponse.getAccessToken();
        } catch (AlipayApiException e) {
            //处理异常
            e.printStackTrace();
        }
        String response = getAliPayUserInfo(accessToken);
        model.addAttribute("response", JSONObject.parse(response));
        return "show";
    }

    /**
     * accessToken换取用户的基本身份信息
     *
     * @param accessToken the token
     * @return the String
     */
    private String getAliPayUserInfo(String accessToken) {
        String response = "";
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
        AlipayUserInfoShareRequest request = new AlipayUserInfoShareRequest();
        String auth_token = accessToken;
        try {
            AlipayUserInfoShareResponse userinfoShareResponse = alipayClient.execute(request, auth_token);
            response = userinfoShareResponse.getBody();
            System.out.println("responseBody=======" + userinfoShareResponse.getBody());
        } catch (AlipayApiException e) {
            //处理异常
            e.printStackTrace();
        }
        return response;
    }
}
