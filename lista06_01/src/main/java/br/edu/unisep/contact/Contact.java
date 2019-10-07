package br.edu.unisep.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

    protected String name;
    protected String email;
    protected String cellPhone;
    private String address;
    private String city;

    public String getInfo() {
        var info = "Name : " + this.name + "\n" +
            "E-mail: " + this.email + "\n" +
            "Phone: " + this.cellPhone + "\n" +
            "Address: " + this.address + " - " + this.city;

        return info;
    }
}
