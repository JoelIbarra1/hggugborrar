public class Auto {

    int numRuedas;
    String color;
    String placas;
    Motor motor;

    Dueno dueno;

    double velocidad(){
        double velocidadkh=0;
        velocidadkh=motor.fuerza()*numRuedas;
        return velocidadkh;
    }
}
