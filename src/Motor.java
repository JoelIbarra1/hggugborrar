public class Motor {

    int cilindraje;
    int valvulas;
    String combustible;
    double fuerza(){
        double fuerzanm=0;
        if(combustible.equals("gasolina")) {
            fuerzanm = cilindraje * valvulas;
        }
        return fuerzanm;
    }
}
