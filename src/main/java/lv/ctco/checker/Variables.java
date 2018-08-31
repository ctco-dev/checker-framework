package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Variables {

    @SuppressWarnings("nullness")
    void nullAssignment() {
        @NonNull Object obj = null;
    }

    @SuppressWarnings("nullness")
    void nullAssignmentViaReference() {
        Object o = null;
        @NonNull Object no;

        no = o;

    }

    @SuppressWarnings("nullness")
    void missingCheck() {
        String s2 = "";
        s2.hashCode();
    }

    @SuppressWarnings("nullness")
    void arrays() {
        String @NonNull [] messages = new String[2];
        messages[0] = null;
    }
}
