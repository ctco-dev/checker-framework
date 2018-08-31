package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GenericVariables<@NonNull A> {

    @SuppressWarnings("nullness")
    void assignment() {
        A a1 = null; //@NonNull at class declaration is not respected
        @NonNull A a2 = null;
    }

    @SuppressWarnings("nullness")
    void list() {
        List<@NonNull String> list = new ArrayList<>();
        list.add(null);
    }

    @SuppressWarnings("nullness")
    void cast() {
        List<? extends @NonNull CharSequence> ls;
        ls = new ArrayList<@NonNull String>();    // OK
        ls = new ArrayList<@Nullable String>();   // error: @Nullable is not a subtype of @NonNull
    }
}
