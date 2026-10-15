package FunctionInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    static void main(String[] args) {
        Consumidor eredin = new Consumidor("Eredin","19982043798");
        Consumidor apolo = new Consumidor("Apolo","19999999999");
        bemVindo(eredin);
        bemVindoConsumer.accept(eredin);
        System.out.println();
        bemVindoConsumer2.accept(eredin,false);
        bemVindoConsumer2.accept(apolo,true);

    }

    //functions

    static BiConsumer<Consumidor, Boolean > bemVindoConsumer2 = (consumidor,mostrarTelefone) ->
            System.out.println("Ola, " + consumidor.name
                    + ", Obrigado por registrar seu telefone: "
                    + (mostrarTelefone ? consumidor.phone : "***********") + " em nossa loja!!");


    static void bemVindo(Consumidor consumidor){
        System.out.println("Ola, " + consumidor.name
                + ", Obrigado por registrar seu telefone: "
                + consumidor.phone + " em nossa loja!!");
    }

    static Consumer<Consumidor> bemVindoConsumer = consumidor ->
          System.out.println("Ola, " + consumidor.name
                  + ", Obrigado por registrar seu telefone: "
                  + consumidor.phone + " em nossa loja!!");





    //class
    static class Consumidor{
        private final String name;
        private final String phone;

        public Consumidor(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
