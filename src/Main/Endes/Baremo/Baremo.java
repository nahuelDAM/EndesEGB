package Main.Endes.Baremo;

public class Baremo {
    public String comprobarBaremo(String dni, int baremo) {
        if (baremo > 5 && baremo <= 10 && comprobarDni(dni)) {
            return "Adjudicada";
        } else if (baremo < 5 && baremo > 0 && comprobarDni(dni)) {
            return "No adjudicada";
        }
        return "Dato no Válido";
    }
        public boolean comprobarDni(String dni) {
            String regex = "\\d{7}[A-Z]";
            return dni.matches(regex);
        }

}
