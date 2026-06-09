package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Av. Almirante Latorre",
                "Ancud",
                "Los Lagos"
        );

        Persona persona1 = new Persona(
                "Ignacio Fuentes",
                "12.345.678-9",
                direccion1
        );

        GuiaTuristico guia1 = new GuiaTuristico(
                "Mario Soto",
                "15.984.125-7",
                direccion1,
                "Turismo Aventura"
        );

        System.out.println(direccion1);
        System.out.println(persona1);
        System.out.println(guia1);
    }
}