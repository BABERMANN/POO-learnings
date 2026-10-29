package Items;

import java.time.LocalDate;

public class Movie extends Item{
    private int duration;

    public Movie(String id, String title, LocalDate releaseDate, int duration) {
        super(id, title, releaseDate);
        this.duration = duration;
    }

    @Override
    public double calculateFee(int days) {
        if(days <= 0) throw new IllegalArgumentException("Quantidade de dias invalidos");
        return 3.00 * days;
    }

    @Override
    public int getMaxLoanDays() {
        return 5;
    }
}
