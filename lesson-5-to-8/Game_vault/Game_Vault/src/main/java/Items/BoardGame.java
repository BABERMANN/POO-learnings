package Items;

import java.time.LocalDate;

public class BoardGame extends Item{
    private int maxPlayers;

    public BoardGame(String id, String title, LocalDate releaseDate, int maxPlayers) {
        super(id, title, releaseDate);
        this.maxPlayers = maxPlayers;
    }

    @Override
    public double calculateFee(int days) {
        if(days <= 0)throw new IllegalArgumentException("Dias invalidos");
        return 8.00 + (2.00 * days);
    }

    @Override
    public int getMaxLoanDays() {
        return 10;
    }

    @Override
    public String[] reportContent() {
        String[] bg = super.reportContent().clone();
        bg[bg.length + 1] = String.valueOf(maxPlayers);
    } // out of bounds procurar metodo realoc
}
