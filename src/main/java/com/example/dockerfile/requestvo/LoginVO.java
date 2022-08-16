package com.example.dockerfile.requestvo;


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

    String userAccount;

    String passwd;

    String username;

}
