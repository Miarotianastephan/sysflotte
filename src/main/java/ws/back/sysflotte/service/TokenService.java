package ws.back.sysflotte.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

// @Service
public class TokenService {
    //  @Value("${jwt.secret}")
    // private String secret;

    // @Value("${jwt.expiration}")
    // private long expiration;

    // public String generateToken(String username) {
    //     byte[] secretBytes = secret.getBytes();
    //     Key key = new SecretKeySpec(secretBytes, SignatureAlgorithm.HS256.getJcaName());
    //     // Key key = Keys.hmacShaKeyFor(secret.getBytes());

    //     Date now = new Date();
    //     Date expirationDate = new Date(now.getTime() + expiration);

    //     return Jwts.builder()
    //             .setSubject(username)
    //             .setIssuedAt(now)
    //             .setExpiration(expirationDate)
    //             .signWith(SignatureAlgorithm.HS256, key)
    //             .compact();
    // }

    // public String getUsernameFromToken(String token) {
    //     byte[] secretBytes = secret.getBytes();
    //     Key key = new SecretKeySpec(secretBytes, SignatureAlgorithm.HS256.getJcaName());

    //     return Jwts.parserBuilder()
    //             .setSigningKey(key)
    //             .build()
    //             .parseClaimsJws(token)
    //             .getBody()
    //             .getSubject();
    // }

}
