package pp.block1.cc.test;

import org.junit.Test;
import pp.block1.cc.antlr.PLI;


@SuppressWarnings("javadoc")
public class PLITest{
    private static LexerTester tester = new LexerTester(PLI.class); // TODO fill in once you have the ID6 grammar

    @Test
    public void Test() {
        //I don't really know how to write tests.
        tester.correct("\"1\"");
        tester.correct("\"a\"\"\"");
        tester.yields("\"a\"\"\"", PLI.STRING);
    }

}
