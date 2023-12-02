import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;

class sum{
    private int var1, var2;
    public sum(int v1, int v2){
        var1 = v1;
        var2 = v2;
    }

    public int add() {
        return var1 + var2;
    }
}

class testsum{
    @Test
    public void test() {
        sum s = new sum(1, 1);
        int sum = s.add();
        assertEquals(2, sum);
    }

}

public class testRunner {
    public static void main(String args[]){
        Result result = JUnitCore.runClasses(testsum.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
