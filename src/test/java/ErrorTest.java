import org.junit.Test;
import util.ErrorUtil;

public class ErrorTest {
    @Test
    public void errorTest(){
        System.out.println(ErrorUtil.mseError(1,0.33,1));
    }
}
