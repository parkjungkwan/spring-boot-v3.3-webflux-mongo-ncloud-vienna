package com.example.demo.security.domain;
import lombok.*;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("tokens")
public class TokenModel {

    @Id
    private String tokenId;
    private String refreshToken;
    private String email;
    private Date expiration;

    @Override
    public String toString() {
      return "RefreshTokenModel [tokenId=" + tokenId +
       ", refreshToken=" + refreshToken + 
       ", email=" + email + 
       ", expiration=" + expiration + 
       "]";
    }

    
}
