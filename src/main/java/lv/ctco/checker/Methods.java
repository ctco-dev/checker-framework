package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

@SuppressWarnings("nullness")
public class Methods{

    {
        String s = null;
        consumeString(null);

        @NonNull String res = produceNullString();
    }

    void consumeString(String s){
    }

    @Nullable
    String produceNullString(){
        return null;
    }


}
