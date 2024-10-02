package practice.Accenture;

    public class snakeWaterGun {

        public static int countPlayerAWins(String moves) {
            // You can add your logic here to count the number of rounds A wins
           String word="";
           String A="";
           String B="";
            boolean isA=true;
            for(int i=0;i<moves.length();i++){
                word+=moves.charAt(i);
                if(word.equals("snake") && isA){
                    A+='s';
                    word="";
                    isA=false;
                } else if (word.equals("snake") && !isA) {
                    B+='s';
                    word="";
                    isA=true;
                } else if (word.equals("water") && isA) {
                    A+='w';
                    word="";
                    isA=false;
                } else if (word.equals("water") && !isA) {
                    B+='w';
                    word="";
                    isA=true;
                }else if(word.equals("gun") && isA){
                    A+='g';
                    word="";
                    isA=false;
                } else if (word.equals("gun")  && !isA) {
                    B+='g';
                    word="";
                    isA=true;
                }
            }
            int count=0;
            for(int i=0;i<B.length();i++){
                if(B.charAt(i)=='w'&&A.charAt(i)=='s' || B.charAt(i)=='g' && A.charAt(i)=='w' || B.charAt(i)=='s' && A.charAt(i)=='g'){
                    count++;
                }
            }

            return count; // Placeholder return value
        }

        public static void main(String[] args) {
            // Test cases
            String moves1 = "snakewater";
            String moves2 = "snakewatergunsnake";
            String moves3 = "watergunsnakesnakewater";

            System.out.println("Player A wins (moves1): " + countPlayerAWins(moves1));
            System.out.println("Player A wins (moves2): " + countPlayerAWins(moves2));
            System.out.println("Player A wins (moves3): " + countPlayerAWins(moves3));
        }
    }


