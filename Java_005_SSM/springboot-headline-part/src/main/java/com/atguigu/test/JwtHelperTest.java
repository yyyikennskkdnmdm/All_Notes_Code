package com.atguigu.test;

import com.alibaba.druid.util.StringUtils;
import com.atguigu.utils.JwtHelper;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import java.util.Date;
// 获取token   根据token获取id  查看token是否过期
@SpringBootTest
public class JwtHelperTest {
    @Autowired
    private JwtHelper jwtHelper;

    private String tokenSignKey = "headline123456";
    private Integer tokenExpiration = 120;


    @Test
    public void JwtHelperTest001(){
        String token = jwtHelper.createToken(1L);
        System.out.println("token = " + token);

        //解析用户标识
        int userId = jwtHelper.getUserId(token).intValue();
        System.out.println("userId = " + userId);

        //校验是否到期! false 未到期 true到期
        boolean expiration = jwtHelper.isExpiration(token);
        System.out.println("expiration = " + expiration);
    }


    /**
     * String token = Jwts.builder()：创建一个用于构建 JWT 的对象，并将返回的 JWT 字符串存储在变量 token 中。
     *
     * .setSubject("YYGH-USER")：设置 JWT 的主题（Subject），这里将其设置为 "YYGH-USER"，表示该令牌与用户 "YYGH-USER" 相关联。
     *
     * .setExpiration(new Date(System.currentTimeMillis() + 120*1000*60))：设置 JWT 的过期时间。使用 System.currentTimeMillis() 获取当前时间，然后加上 120 分钟的毫秒数来设置过期时间。这里的计算会使令牌在 120 分钟后过期。
     *
     * .claim("userId", 1L)：向 JWT 的载荷（Payload）添加一个声明（Claim）。这里的声明是 "userId"，值为 1L，表示用户的唯一标识为 1。
     *
     * .signWith(SignatureAlgorithm.HS512, "headline123456")：使用 HS512 算法和密钥 "headline123456" 对 JWT 进行签名。这将确保 JWT 的完整性和真实性。
     *
     * .compressWith(CompressionCodecs.GZIP)：对 JWT 进行压缩，使用 GZIP 压缩算法。这可以减小 JWT 的大小，提高传输效率。
     *
     * .compact()：构建 JWT，并将其压缩为一个字符串表示。最后，将该字符串存储在变量 token 中
     */
    @Test
    public void JwtHelperTest002(){
        String token = Jwts.builder()
                .setSubject("YYGH-USER")
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration*1000*60)) //单位分钟
                .claim("userId", 1L)
                .signWith(SignatureAlgorithm.HS512, tokenSignKey)
                .compressWith(CompressionCodecs.GZIP)
                .compact();
        System.out.println(token);
    }


    private String token = "eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA_6tWKi5NUrJSiox099ANDXYNUtJRSq0oULIyNDcwNbGwNDI31FEqLU4t8kwBitUCANNN_uMvAAAA.zdmS2Xwen5v0ybpiHdhHedAt1l-8I8F0NBQ42A7rY-nFehFbEV1pYF4I2XowftJuDgvBvRgXsI79RzWbD6LH1w";
    // eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA_6tWKi5NUrJSiox099ANDXYNUtJRSq0oULIyNDcwNbGwNDI31FEqLU4t8kwBitUCANNN_uMvAAAA.zdmS2Xwen5v0ybpiHdhHedAt1l-8I8F0NBQ42A7rY-nFehFbEV1pYF4I2XowftJuDgvBvRgXsI79RzWbD6LH1w
    @Test
    public void JwtHelperTest003(){
        Long userId = jwtHelper.getUserId(token);
        System.out.println(userId);
    }

    @Test
    public void JwtHelperTest004(){
        boolean empty = StringUtils.isEmpty(token);
        System.out.println(empty);

        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
    }
}
