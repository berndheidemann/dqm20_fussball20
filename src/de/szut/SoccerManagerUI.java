package de.szut;

public class SoccerManagerUI {

    public static void main(String[] args) {
        Player p=new Player("Heidemann", 44, 8, 10, 10, 0, 2);
        System.out.println(p);
        System.out.println();
        Coach c=new Coach("Müller", 23, 9);
        System.out.println(c);
        System.out.println(p.shootAtGoal());


        Goalkeeper k=new Goalkeeper("Kahn", 48, 9, 0, 7, 23, 8, 8);

        for(int i=0;i<100;i++) {
            int power=p.shootAtGoal();
            System.out.println(k.ballHold(power));
        }
    }
}
