import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(premutationList("", "abc"));

    }
   static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }
   }

   static ArrayList<String> premutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String> ans=new ArrayList<>();
       for(int i=0;i<=p.length();i++){
           String f=p.substring(0,i);
           String s=p.substring(i);
           ans.addAll(premutationList(f+ch+s,up.substring(1)));
       }
        return ans;
   }
}
