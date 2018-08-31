package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Methods {

    @SuppressWarnings("nullness")
    void passNullString() {
        String s = null;
        consumeString(null);
    }

    @SuppressWarnings("nullness")
    void assignNullableResult() {
        @NonNull String res = produceNullString();
    }

    void consumeString(String s) {
    }

    //should produce warning if we remove @Nullable
    @Nullable
    String produceNullString() {
        return null;
    }

}
