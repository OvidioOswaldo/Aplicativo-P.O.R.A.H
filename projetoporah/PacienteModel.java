package com.ovidiooswaldo.projetoporah;

public class PacienteModel {
    String nomedopaciente;
    String info;

    int image;

    public PacienteModel(String nomedopaciente, String info, int image) {
        this.nomedopaciente = nomedopaciente;
        this.info = info;
        this.image = image;
    }

    public String getNomedopaciente() {
        return nomedopaciente;
    }

    public String getInfo() {
        return info;
    }

    public int getImage() {
        return image;
    }
}
