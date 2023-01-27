
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * desafio
 */
public class desafio {

    /**
     * @param vetor
     * @param dict
     * @return
     */
    public boolean chec(String[] vetor, String word) {

        List letras = Arrays.asList(vetor).stream().sorted().collect(Collectors.toList());
        List palavra = Arrays.asList(word.replace(" ", "").toLowerCase().split(""))
                .stream().sorted().collect(Collectors.toList());

        System.out.println("letras: " + letras + "\n");
        System.out.println("palavra: " + palavra + "\n");

        if (letras.size() < palavra.size()) {
            return false;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < palavra.size()) {

            for (j = 0; j < letras.size(); j++) {

                if (letras.get(j).equals(palavra.get(i))) {
                    k++;
                }

            }

            i++;

        }
        
        if (k >= palavra.size()) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        desafio d1 = new desafio();
        String[] vetor = { "a", "s", "o", "f", "r", "e", "l", "p", "o", "t", "e" };

        System.out.println(d1.chec(vetor, "fresa"));
        System.out.println(d1.chec(vetor, "pote"));
        System.out.println(d1.chec(vetor, "floresta"));
        System.out.println(d1.chec(vetor, "name"));
    }

}
