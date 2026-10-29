package org.infra;

import org.example.FakeEmployeeRepository;
import org.example.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Main {
    static void main(String[] args) {
//        System.out.println("ola");

        Repository<String,Jogador> repository = new FakeJogadorRepository();

        RegisterJogador registerJogador = new RegisterJogador(repository);
        FindJogador findJogador = new FindJogador(repository);

        repository.save(new Jogador("01","Eredin","Sentinela",67,1313.13, LocalDate.of(2005,2,2)));
        repository.save(new Jogador("02","Felipe","Duelista",68,1313.12, LocalDate.of(2005,5,12)));
        repository.save(new Jogador("03","Rafael","Controlador",69,1313.11, LocalDate.of(2005,6,2)));
        repository.save(new Jogador("04","Eric","Iniciador,",70,1313.10, LocalDate.of(2005,11,4)));
        repository.save(new Jogador("05","Guilherme","Duelista,",66,1311.12, LocalDate.of(2005,9,12)));
        repository.save(new Jogador("06", "Bruno", "Duelista", 75, 1420.50, LocalDate.of(2004, 3, 15)));
        repository.save(new Jogador("07", "Lucas", "Iniciador", 62, 1250.80, LocalDate.of(2005, 7, 22)));
        repository.save(new Jogador("08", "Gabriel", "Controlador", 80, 1600.00, LocalDate.of(2003, 11, 5)));
        repository.save(new Jogador("09", "Matheus", "Sentinela", 55, 1100.25, LocalDate.of(2006, 1, 10)));
        repository.save(new Jogador("10", "Pedro", "Duelista", 91, 1850.90, LocalDate.of(2002, 5, 19)));
        repository.save(new Jogador("11", "Thiago", "Iniciador", 64, 1290.40, LocalDate.of(2005, 9, 14)));
        repository.save(new Jogador("12", "Gustavo", "Controlador", 73, 1380.75, LocalDate.of(2004, 12, 1)));
        repository.save(new Jogador("13", "Vinicius", "Sentinela", 69, 1320.00, LocalDate.of(2005, 4, 28)));
        repository.save(new Jogador("14", "Rodrigo", "Duelista", 88, 1740.15, LocalDate.of(2003, 8, 8)));
        repository.save(new Jogador("15", "Vitor", "Iniciador", 70, 1350.60, LocalDate.of(2004, 6, 30)));
        repository.save(new Jogador("16", "Arthur", "Controlador", 58, 1150.45, LocalDate.of(2006, 3, 3)));
        repository.save(new Jogador("17", "Caio", "Sentinela", 77, 1490.30, LocalDate.of(2004, 10, 25)));
        repository.save(new Jogador("18", "Daniel", "Duelista", 83, 1620.85, LocalDate.of(2003, 2, 11)));
        repository.save(new Jogador("19", "Eduardo", "Iniciador", 61, 1210.20, LocalDate.of(2005, 12, 12)));
        repository.save(new Jogador("20", "Felipe", "Controlador", 72, 1395.40, LocalDate.of(2004, 5, 24)));
        repository.save(new Jogador("21", "Leonardo", "Sentinela", 66, 1285.90, LocalDate.of(2005, 1, 15)));
        repository.save(new Jogador("22", "Marcelo", "Duelista", 95, 1990.00, LocalDate.of(2001, 7, 7)));
        repository.save(new Jogador("23", "Henrique", "Iniciador", 74, 1410.55, LocalDate.of(2004, 4, 18)));
        repository.save(new Jogador("24", "Murilo", "Controlador", 63, 1230.10, LocalDate.of(2005, 8, 9)));
        repository.save(new Jogador("25", "Otavio", "Sentinela", 79, 1515.65, LocalDate.of(2003, 10, 31)));
        repository.save(new Jogador("26", "Douglas", "Duelista", 81, 1580.40, LocalDate.of(2003, 6, 14)));
        repository.save(new Jogador("27", "Diego", "Iniciador", 67, 1315.25, LocalDate.of(2005, 2, 20)));
        repository.save(new Jogador("28", "igor", "Controlador", 71, 1370.80, LocalDate.of(2004, 9, 5)));
        repository.save(new Jogador("29", "Renan", "Sentinela", 59, 1180.35, LocalDate.of(2006, 4, 12)));
        repository.save(new Jogador("30", "Alex", "Duelista", 86, 1690.95, LocalDate.of(2003, 1, 29)));
        repository.save(new Jogador("31", "Andre", "Iniciador", 76, 1460.10, LocalDate.of(2004, 8, 22)));
        repository.save(new Jogador("32", "Samuel", "Controlador", 65, 1270.50, LocalDate.of(2005, 10, 3)));
        repository.save(new Jogador("33", "Wesley", "Sentinela", 73, 1400.00, LocalDate.of(2004, 7, 17)));
        repository.save(new Jogador("34", "Marcos", "Duelista", 90, 1810.20, LocalDate.of(2002, 12, 25)));
        repository.save(new Jogador("35", "Ricardo", "Iniciador", 68, 1330.45, LocalDate.of(2005, 3, 8)));
        repository.save(new Jogador("36", "Alan", "Controlador", 60, 1195.90, LocalDate.of(2006, 5, 14)));
        repository.save(new Jogador("37", "Fabricio", "Sentinela", 78, 1530.70, LocalDate.of(2003, 9, 19)));
        repository.save(new Jogador("38", "Hugo", "Duelista", 84, 1650.35, LocalDate.of(2003, 5, 11)));
        repository.save(new Jogador("39", "Julio", "Iniciador", 62, 1245.15, LocalDate.of(2005, 11, 30)));
        repository.save(new Jogador("40", "Luis", "Controlador", 75, 1440.80, LocalDate.of(2004, 2, 13)));
        repository.save(new Jogador("41", "Yuri", "Sentinela", 70, 1365.25, LocalDate.of(2004, 11, 21)));
        repository.save(new Jogador("42", "Danilo", "Duelista", 92, 1890.60, LocalDate.of(2002, 4, 4)));
        repository.save(new Jogador("43", "Breno", "Iniciador", 72, 1385.00, LocalDate.of(2004, 6, 17)));
        repository.save(new Jogador("44", "Caetano", "Controlador", 57, 1120.40, LocalDate.of(2006, 7, 9)));
        repository.save(new Jogador("45", "Victor", "Sentinela", 81, 1575.85, LocalDate.of(2003, 3, 26)));
        repository.save(new Jogador("46", "Ruan", "Duelista", 85, 1675.10, LocalDate.of(2003, 10, 12)));
        repository.save(new Jogador("47", "Kaique", "Iniciador", 69, 1340.30, LocalDate.of(2005, 1, 7)));
        repository.save(new Jogador("48", "Nicolas", "Controlador", 74, 1425.95, LocalDate.of(2004, 8, 3)));
        repository.save(new Jogador("49", "Erick", "Sentinela", 64, 1265.50, LocalDate.of(2005, 9, 28)));
        repository.save(new Jogador("50", "Thomas", "Duelista", 89, 1790.40, LocalDate.of(2002, 11, 16)));
        repository.save(new Jogador("51", "Jonathan", "Iniciador", 77, 1510.20, LocalDate.of(2004, 1, 22)));
        repository.save(new Jogador("52", "Augusto", "Controlador", 66, 1295.75, LocalDate.of(2005, 6, 11)));
        repository.save(new Jogador("53", "Sandro", "Sentinela", 73, 1415.30, LocalDate.of(2004, 4, 5)));
        repository.save(new Jogador("54", "Christian", "Duelista", 94, 1940.85, LocalDate.of(2002, 8, 14)));
        repository.save(new Jogador("55", "Leandro", "Iniciador", 70, 1360.00, LocalDate.of(2004, 10, 9)));

        System.out.println("------------------------------------------------");
        Jogador[] leud = findJogador.findAll();
        for(Jogador leudAtletas : leud){
            leudAtletas.jiglePrint();
        }

        System.out.println("-------------------------------------------------");

        System.out.println(findJogador.findById("02"));

    }

}
