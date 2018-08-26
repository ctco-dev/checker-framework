package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("nullness")
public class GenericVariables<@NonNull A> {

    {
        A a1 = null; //null check doesn't work
        @NonNull A a2 = null;

        List<@NonNull String> list = new ArrayList<>();
        list.add(null);

        List<? extends @NonNull CharSequence> ls;
        ls = new ArrayList<@NonNull String>();    // OK
        ls = new ArrayList<@Nullable String>();   // error: @Nullable is not a subtype of @NonNull
    }
}
