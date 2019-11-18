package br.edu.unisep.music;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Plan {

    private String client;
    private String email;

    public abstract Double calculateValue();

}
