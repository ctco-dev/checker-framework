package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;

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

        //*---------------------------------------------*/

        String @NonNull [] messages = new String[2];
        messages[0] = null;
    }
}
