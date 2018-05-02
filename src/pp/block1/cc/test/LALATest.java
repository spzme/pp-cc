package pp.block1.cc.test;

import org.junit.Test;
import pp.block1.cc.antlr.LALA;


@SuppressWarnings("javadoc")
public class LALATest{
    private static LexerTester tester = new LexerTester(LALA.class);

    @Test
    public void Test() {
        //I don't really know how to write tests.
        tester.correct("La");
        tester.correct("LaLa");
        tester.correct("LaLaLaLi");
        tester.correct("Laaaaaaaaaa      ");
        tester.correct("Laaaa   Laaa");
        tester.yields("LaaaLaLaa Laaa   LaLiLaa",
                LALA.LALA, LALA.LALALALI, LALA.LA);
        tester.wrong("LaLaLi");
        tester.wrong("LALALALI");
        tester.wrong("Laa a");
    }

}
