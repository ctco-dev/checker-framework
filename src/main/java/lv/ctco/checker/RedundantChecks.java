package lv.ctco.checker;

public class RedundantChecks {

    @SuppressWarnings("nullness")
    void doStuff(String s) {

        //should get warning
        if (s == null) {
            return;
        }

        //should get warning even with s marked as @Nullable
        String s2 = s != null ? s.replace("a", "b") : null;
    }
}
