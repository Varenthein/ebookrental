package com.kodilla.ebooklibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LoginDto {
  private String login;
  private String password;
}
