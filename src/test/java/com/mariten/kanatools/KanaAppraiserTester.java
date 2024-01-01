package com.mariten.kanatools;
import com.mariten.kanatools.KanaAppraiser;

public abstract class KanaAppraiserTester
{
    public KanaAppraiserTester()
    {
        // Test instantiation
        KanaAppraiser kana_evaluator_object = new KanaAppraiser();
    }

    public boolean unusedMethod(boolean x) {
        x = true;

        String foo = null;
        System.out.println(foo.length());

        return x;
    }

    public boolean unusedMethod1(boolean x) {
        x = true;

        String foo = null;
        System.out.println(foo.length());

        return x;
    }
}
