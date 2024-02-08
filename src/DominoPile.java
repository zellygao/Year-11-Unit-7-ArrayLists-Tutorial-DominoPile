import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile (){
        pile = new ArrayList <Domino>();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for(int i =0; i<=6; i++){
            for(int j = i; j<=6; j++){
                Domino domino = new Domino(i,j);
                pile.add(domino);
            }
        }
    }

    public void shuffle(){
        ArrayList <Domino> newPile = new ArrayList<Domino>();
        Random random = new Random();
        while(!pile.isEmpty()){
            int index = random.nextInt(pile.size());
            Domino domino = pile.remove(index);
            newPile.add(domino);
        }
        pile = newPile;
    }

}
