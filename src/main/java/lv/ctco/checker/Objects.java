package lv.ctco.checker;

public class Objects {

    @SuppressWarnings("nullness")
    void constructorCheck() {
        new Dto(null);
    }

    @SuppressWarnings("nullness")
    void redundantCheck() {
        String id = new Dto("").getId();
        int hash = id != null ? id.hashCode() : 0;
    }
}
