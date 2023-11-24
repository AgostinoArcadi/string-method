public class Main {
    public static void main(String[] args) {
        String testo = "Ciao";
        String testo2 = "Hello";

        System.out.println(comparaStringhe(testo, testo2));
    }

    public static StringBuilder comparaStringhe(String testo1, String testo2) {
        StringBuilder result = new StringBuilder();

        if(testo1.equals(testo2)) {
            result.append("Le due stringhe sono uguali");
        } else {
            result.append("Le due stringhe sono differenti");
        }
        return result;
    }
}
