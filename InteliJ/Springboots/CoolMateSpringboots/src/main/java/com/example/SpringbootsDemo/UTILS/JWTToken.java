package com.example.CoolMateSpringboots.UTILS;

import com.example.CoolMateSpringboots.DAL.OtherObject.MyUserDetails;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class JWTToken {
    // Đoạn JWT_SECRET này là bí mật, chỉ có phía server biết
    private final String JWT_SECRET = "WebBanshangfMafTooiLamfDdeerHojcTaajpVifDDamMee";

    //Thời gian hiệu lực
    private final long JWT_EXPIRATION = 604800000L;

    public String generateToken(MyUserDetails userDetails){
        Date now = new Date();
        //Set hạn sử dụng (expiration date)
        Date expirationDate = new Date(now.getTime() + JWT_EXPIRATION);

        //Set claims là những thông tin cần thiết trong việc sử dụng trong quá trình sử dụng web và code web
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", userDetails.getUser().getUserId());
        claims.put("username", userDetails.getUser().getUserName());
        claims.put("name", userDetails.getUser().getLastName() + " " + userDetails.getUser().getFirstName());
        claims.put("roles", userDetails.getAuthorities());

        //Tạo chuỗi json web token từ id của user
        return Jwts.builder()
                .subject(Long.toString(userDetails.getUser().getUserId()))
                .issuedAt(now)
                .claims(claims)
                .expiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, JWT_SECRET.getBytes())
                .compact();
    }

    //Lấy thông tin user từ jwt
    public Long getUserIdFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(JWT_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return Long.parseLong(claims.getSubject());
    }

    //Kiểm duyệt token
    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET.getBytes()).build().parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {
            log.error("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            log.error("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty.");
        }
        return false;
    }
}
