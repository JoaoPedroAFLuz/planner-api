package br.com.joaopedroafluz.timely.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewUserDTO {

    private String name;
    private String email;
    private String password;

}
