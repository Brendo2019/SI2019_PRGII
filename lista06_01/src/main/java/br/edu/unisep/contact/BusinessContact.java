package br.edu.unisep.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessContact extends Contact {

    private String company;
    private String role;
    private String businessPhone;

    @Override
    public String getInfo() {
        // The keyword "super", is a reference to the superclass
        // Here super.getInfo() executes the superclass version of the method
        var info = super.getInfo();

        info = info + "\nCompany: " + this.company + "\n" +
                "Role: " + this.role + "\n" +
                "Business Phone: " + this.businessPhone;
        return info;
    }
}
