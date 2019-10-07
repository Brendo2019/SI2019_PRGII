package br.edu.unisep.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalContact extends Contact {

    private String nickname;
    private String twitter;
    private String facebook;

    @Override
    public String getInfo() {
        var info = "Nickname: " + this.nickname + "\n" +
                "Name: " + this.name + "\n" +
                "Phone: " + this.cellPhone + "\n" +
                "E-mail: " + this.email;
        return info;
    }
}
