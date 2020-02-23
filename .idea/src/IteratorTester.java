import java.util.Iterator;
import java.util.Vector;

public class IteratorTester {
    public  static void main(String args[]){
        String[] num = {"one","two","three","four","five",
                        "six","seven","eight","nine","ten"};
        Vector<String> aVector = new Vector<String>(java.util.Arrays.asList(num));
        System.out.println("before vector:"+ aVector);
        Iterator<String> nums = aVector.iterator();
        while(nums.hasNext()){
            String aString = (String) nums.next();
            System.out.println(aString);
            if(aString.length() > 4) nums.remove();
        }
        System.out.println("After Vector:" + aVector);
    }

}
