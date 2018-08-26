package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

@SuppressWarnings("nullness")
public class Variables {

    {
        @NonNull Object obj = null;

        Object o = null;
        @NonNull  Object no;

        no = o;

        /*-----------------------------------------------*/

        String s2 = null;
        s2.hashCode();

        @NonNull String s;
        s = s2; //failed to catch
    }
}
