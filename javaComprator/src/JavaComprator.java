import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComprator {
    public static class Player{
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    public static class Check implements Comparator<Player>{
        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score!= o2.score){
                return o2.score-o1.score;
            }
            return o1.name.compareTo(o2.name);
        }
    }


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        Player [] players=new Player[n];
        for (int i=0;i<n;i++){
            String name=in.next();
            int score=in.nextInt();
            players[i]=new Player(name,score);
        }
        Arrays.sort(players, new Check());
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }

}
