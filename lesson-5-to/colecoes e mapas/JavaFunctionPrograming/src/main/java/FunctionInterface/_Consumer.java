package FunctionInterface;

import java.util.function.Consumer;

public class _Consumer {
    static void main(String[] args) {
        Consumidor eredin = new Consumidor("Eredin","19982043798");
        bemVindo(eredin);
        bemVindoConsumer.accept(eredin);
    }

    static void bemVindo(Consumidor consumidor){
        System.out.println("Ola, " + consumidor.name
                + ", Obrigado por registrar seu telefone: "
                + consumidor.phone + " em nossa loja!!");
    }

  static Consumer<Consumidor> bemVindoConsumer = consumidor ->
          System.out.println("Ola, " + consumidor.name
                  + ", Obrigado por registrar seu telefone: "
                  + consumidor.phone + " em nossa loja!!");


    static class Consumidor{
        private final String name;
        private final String phone;

        public Consumidor(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
