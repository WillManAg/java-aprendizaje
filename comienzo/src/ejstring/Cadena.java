package ejstring;

public class Cadena {
    private String texto;

    // Constructores
    public Cadena(String texto) {
        this.texto = texto;
    }

    public Cadena() {
        this.texto = "";
    }

    // Getter / Setter
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // En mayúsculas
    public String enMayusculas() {
        return texto.toUpperCase();
    }

    // En minúsculas
    public String enMinusculas() {
        return texto.toLowerCase();
    }

    // Dos primeros caracteres (si hay 2+)
    public String dosPrimeros() {
        if (texto.length() >= 2) {
            return texto.substring(0, 2);
        }
        return null;
    }

    // Dos últimos caracteres (si hay 2+)
    public String dosUltimos() {
        if (texto.length() >= 2) {
            return texto.substring(texto.length() - 2);
        }
        return ""; // o null si prefieres
    }

    // Nº de ocurrencias del último carácter
    public int ocurrenciasUltimoCaracter() {
        if (texto.length() == 0) return 0;
        char ultimo = texto.charAt(texto.length() - 1);
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ultimo) cont++;
        }
        return cont;
    }

    // Todas las ocurrencias del primer carácter en mayúsculas
    public String primerCaracterEnMayusculasEnTodaLaCadena() {
        if (texto.length() == 0) return texto;
        char primero = texto.charAt(0);
        char primeroUpper = Character.toUpperCase(primero);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            sb.append(c == primero ? primeroUpper : c);
        }
        return sb.toString();
    }

    // Tres asteriscos delante y detrás
    public String conAsteriscos() {
        return "***" + texto + "***";
    }

    // Cadena invertida
    public String invertida() {
        StringBuilder sb = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }
        return sb.toString();
    }
}
