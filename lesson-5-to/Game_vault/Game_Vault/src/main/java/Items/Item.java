package Items;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Item implements Indefinable<String>, Reportable {
    private String id;
    private String title;
    private LocalDate releaseDate;

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Item(String id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public int getAgeInYears(LocalDate date){
        return Period.between(this.releaseDate,date).getYears();
    }

    @Override
    public String[] reportContent() {
        String[] report = new String[3];
        report[0] = id;
        report[1] = title;
        report[2] = releaseDate.format(FORMAT);

        return report;
    }

    @Override
    public String getId() {
        return id;
    }

    public abstract double calculateFee(int days);

    public abstract int getMaxLoanDays();








}
