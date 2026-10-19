import Items.Reportable;

import java.util.List;

public interface Formater <T extends Reportable>{
    String format(List<T> elements);
}
