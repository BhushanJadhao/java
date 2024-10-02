package practice.Accenture;

public class latestFileVersion {
    public static void main(String[] args) {
        String [] arr={"File_1","File_10","File_23s","File_3"};
        int latestVer=latestVer(arr);
        System.out.println(latestVer);
    }
    static int latestVer(String [] arr){
        int latestVerion=-1;
        boolean isDigit=false;
        for(String str:arr){
            if(str.length()>=0 && str.substring(0,6).equals("File_")){
                int version=0;
                for(int i=6;i<str.length();i++){
                    int ch=str.charAt(i)-'0';
                    if(ch>=48 && ch<=57){
                        isDigit=true;
                        version=version*10+ch;
                    }
                }
                if(isDigit){
                    latestVerion=Math.max(version,latestVerion);
                }
            }
        }

        return latestVerion;
    }
}
