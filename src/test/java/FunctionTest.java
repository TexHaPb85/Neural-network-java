import org.junit.Test;
import util.FunctionUtil;

public class FunctionTest {

    @Test
    public void sigmoidFuncTest(){
        System.out.println(FunctionUtil.sigmoidFunc(0.78));
        System.out.println(FunctionUtil.sigmoidFunc(0.45));
        System.out.println(FunctionUtil.sigmoidFunc(-0.672));
    }
}
