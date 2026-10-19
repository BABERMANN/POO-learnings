package Items;

import java.time.LocalDate;
import java.time.Period;

public abstract class Item implements Indefinable<String>, Reportable {
    private String id;
    private String title;
    private LocalDate releaseDate;

    public Item(String id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public int getAgeInYears(LocalDate date){
        return Period.between(this.releaseDate,date).getYears();
    }







}
