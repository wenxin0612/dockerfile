package com.example.dockerfile.contronller.requestvo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginVO {

    String username;

    String password;

}
