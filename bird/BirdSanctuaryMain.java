package com.bridge.bird;

import java.util.List;

public class BirdSanctuaryMain {
    BirdSanctuary birdSanctuary = new BirdSanctuary();
    static BirdSanctuaryMain a = new BirdSanctuaryMain();

    public static void main(String[] args) {

            Bird peacock = new Peacock();
            Bird peacock1 = new Peacock();

            Bird parrot = new Parrot();
            Bird duck = new Duck();



            a.birdSanctuary.addBird(peacock);
            a.birdSanctuary.addBird(peacock1);
            a.birdSanctuary.addBird(parrot);
            a.birdSanctuary.addBird(duck);

            List<Bird> birdList = BirdSanctuary.getBirdList();
            for(int i =0; i<birdList.size();i++){
                System.out.println(birdList.get(i));
            }

            System.out.println("num of parrots are: "+parrot.getCount());
            System.out.println("num of ducks are: "+duck.getCount());
            System.out.println("num of peacocks are: "+peacock.getCount());



    }
}
