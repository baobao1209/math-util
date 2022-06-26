
import com.babao.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class MathUlityTest {
    // day la class se du dung cac ham cua thu vien/framework JUnit
    // de kiem thu code chinh - ham tinh giai thua()
    // viet code de tinh code ben kia
    // @Test ban chat la public void main() hau truong
    // co nhieu @test ung voi nhieu case khac nhau de kiem thu ham tinh !
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 5 ;
        long expected = 120 ;
        long actural = MathUtil.getFactorial(n) ;
//        System.out.println("5! expected = " + expected );
//        System.out.println("5! actural = " + actural );
        // so sanh mong doi va thuc te( expected : actural) bang framework
       Assert.assertEquals(1, MathUtil.getFactorial(1));
       Assert.assertEquals(2, MathUtil.getFactorial(2));
       Assert.assertEquals(6, MathUtil.getFactorial(3));
       Assert.assertEquals(24, MathUtil.getFactorial(4));
       Assert.assertEquals(120, MathUtil.getFactorial(5));
       Assert.assertEquals(720, MathUtil.getFactorial(6));
           
    }
    //Test Case:
    //Input: -5
    //expected: IllegalArgumentException xuat hien
   
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongtArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    //cach 2 sai Lambda
      @Test
    public void testGetFactorialGivenWrongtArgumentThrowsException_Lambda(){
        Assert.assertThrows(IllegalArgumentException.class, 
                ()-> MathUtil.getFactorial(-5));
    }
    //test 3 theo cach try cath
         @Test
    public void testGetFactorialGivenWrongtArgumentThrowsException_TryCath(){
             try 
             {
                 MathUtil.getFactorial(-5) ;
             } 
             catch (Exception e) 
             {
                 Assert.assertEquals("Invalid argument. N must be between", e.getMessage());
             }
    } 
}
