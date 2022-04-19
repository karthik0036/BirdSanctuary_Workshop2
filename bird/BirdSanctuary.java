package com.bridge.bird;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuary {
        static List<Bird>  birdList = new ArrayList<>();

        public static List<Bird> getBirdList() {
                return birdList;
        }

        public void addBird(Bird bird){
                for(int i =0;i<birdList.size();i++){
                        if(birdList.get(i).name==bird.name){
                                bird.incCount();
                        }
                }
                birdList.add(bird);
        }


}
