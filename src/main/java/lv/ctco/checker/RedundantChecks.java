package lv.ctco.checker;

//@SuppressWarnings("nullness")
public class RedundantChecks {

    //non-null by default
    void doStuff(String s) {
        if (s == null) {
            return;
        }

        String s2 = s != null ? s.replace("a", "b") : null;
    }
}
