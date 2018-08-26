package lv.ctco.checker;

import org.checkerframework.checker.nullness.qual.Nullable;

@SuppressWarnings("nullness")
public class GenericMethods<@Nullable A> {

    {
        consumeClassGeneric(null);//false positive
        consumeNonNullGeneric(null);
        consumeNullableGeneric(null); //false positive
    }

    void consumeClassGeneric(A val) {
    }


    <C> void consumeNonNullGeneric(C c) {
    }

    <@Nullable C> void consumeNullableGeneric(@Nullable C c) {
    }
}
