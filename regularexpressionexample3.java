import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressionexample3{
    public static void main(String[] args) {
        String target= "2f5g7i% df7$ dfdf#";
        
        Pattern p = Pattern.compile("\\D");
        Matcher m =p.matcher(target);
        int ctr=0;
        
        while (m.find())
        {
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
        }
        System.out.println(ctr);
    }
}
