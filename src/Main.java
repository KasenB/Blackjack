public class Main {

    public Card [] deck;

    public static void main(String[] args) {
        Main casino = new Main();
    }

    public Main(){
        System.out.println("Game Starting!");
        deck = new Card[52];

        int counter = 0;
        for (int s = 1; s <=4; s++) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, s);
                deck[counter] = c;
                counter ++;
//                deck[i - 1].printCard();
            }
        }

        shuffle();


        printDeck();
        deal();
    }

    public void shuffle() {
        // first, swap deck[o] and deck[1] cards
        for (int z = 0; z < 52; z ++) {
            Card temp = deck[z];
            int r = (int) (Math.random() * 52);
            deck[z] = deck[r];
            deck[r] = temp;
            // eventually, loop through all deck
            // swapping each card into random index
        }

    }

    public void deal(){

    }
    public void printDeck(){
        for (int i = 0; i < 52; i++){
            deck[i].printCard();
        }
    }
}
