import java.util.*;
public class Am{
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        String user;
        
        System.out.println("Enter Number from 1 to _____ ");
	    user = scan.nextLine();
        
        armloop(user);

    }
        public static void armloop(String num){
            
            int val;
            val = Integer.parseInt(num);
            for(int i = 1; i <= val; i++){
                String in = String.valueOf(i);
                armstrong(in);
            }

        }

        public static void armstrong(String num){
            
            ArrayList<Integer> amstr = new ArrayList<Integer>();
            ArrayList<Integer> as = new ArrayList<Integer>();
            String str, ians, knum;
            int i,inum,pw, lent, am, j, ans, ansStr, an, k;
            char ch;
            ans = 0;

            inum = Integer.parseInt(num);

            // Length of k value
            lent = num.length();

            for(i = 1; i <= lent; i++){

                //Getting Each Character 
                ch = num.charAt(i-1);
                str = String.valueOf(ch);
                am = Integer.parseInt(str);
                
                //Each Character to the power of the length
                pw = (int)Math.pow(am,lent);
                amstr.add(pw);
                
            }
            for(j = 0; j < amstr.size(); j++){
                ans += amstr.get(j);
            }
            if(ans == inum){
                System.out.println(inum);
            }
        }
}