package test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import com.company.Main;

@SuppressWarnings("ALL")
public class test {
    static Main main = new Main();

    //Test1
    @org.testng.annotations.Test(dataProvider = "intProvider")
    public void Test1(int k, int res) {
        assertEquals(main.method1(k),res);
    }

    @DataProvider
    public Object[][]  intProvider() {
        return new Object[][] {{13573, 5}};
    }

    //Test2
    @org.testng.annotations.Test(dataProvider = "boolProvider")
    public void Test2(int k, boolean res){
        assertEquals(main.method2(k), res);
    }

    @DataProvider
    public Object[][] boolProvider() { return  new Object[][] {{30,false}};}

    //Test3
    @org.testng.annotations.Test(dataProvider = "stringProvider")
    public void Test3(int a, int b, int c, String res) { assertEquals(main.method3(a,b,c), res);}

    @DataProvider
    public Object[][] stringProvider() { return  new Object[][] {{1,7,5, "A = -1, B = -7, C = -5"}};}

    //Test4
    @org.testng.annotations.Test(dataProvider = "stringProvider1")
    public void Test4(int k, String res) { assertEquals(main.method4(k), res);}

    @DataProvider
    public Object[][] stringProvider1() { return  new Object[][] {{15,"15 учебных заданий"}};}

    //Test5
    @org.testng.annotations.Test(dataProvider = "intProvider1")
    public void Test5(int k, int p, int res) { assertEquals(main.method5(k,p), res);}

    @DataProvider
    public Object[][]  intProvider1() {
        return new Object[][] {{2,4, 31}};
    }

    //Test6
    @org.testng.annotations.Test(dataProvider = "intProvider2")
    public void Test6(int k, String res){
        assertEquals(main.method6(k), res);
    }

    @DataProvider
    public Object[][]  intProvider2() {
        return new Object[][] {{12345, "54321"}};
    }

    //Test7
    @org.testng.annotations.Test(dataProvider = "arrProvider")
    public void Test7(int[] k, String res){
        assertEquals(main.method7(k), res);
    }

    @DataProvider
    public Object[][]  arrProvider() {
        return new Object[][] {{new int[]{1,2,3,4,5,6,7,8,9,10}, "1 2 10 9 3 4 8 7 5 6 6 5 7 8 4 3 9 10 2 1 "}};
    }

    //Test8
    @org.testng.annotations.Test(dataProvider = "arrProvider1")
    public void Test8(int[] k, int res){
        assertEquals(main.method8(k), res);
    }

    @DataProvider
    public Object[][]  arrProvider1() {
        return new Object[][] {{new int[] {2, 5, 1, 6, 4, 1}, 2}};
    }

    //Test9
    @org.testng.annotations.Test(dataProvider = "arrProvider2")
    public void Test9(int[][] k,  int l, int res){
        assertEquals(main.method9(k, l)[0], res);
    }

    @DataProvider
    public Object[][]  arrProvider2() {
        return new Object[][] {{new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},3, 24}};
    }
}
