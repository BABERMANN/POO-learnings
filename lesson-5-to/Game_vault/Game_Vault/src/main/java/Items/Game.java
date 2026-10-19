package Items;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Game extends Item{
    private String plataform;
    private int minimumAge;

    public Game(String id, String title, LocalDate releaseDate, String plataform, int minimumAge) {
        super(id, title, releaseDate);
        this.plataform = plataform;
        this.minimumAge = minimumAge;
    }

    @Override
    public double calculateFee(int days) {
        if(days <= 0) throw new IllegalArgumentException("Quantidade de dias invalidos");
        return 5.00 * days;
    }

    @Override
    public int getMaxLoanDays() {
        return 7;
    }
}
