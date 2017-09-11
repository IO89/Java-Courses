
public class ObjectsWordPairArray {

    public static void main(String[] args){
        WordPair wordsArray [] = new WordPair[3];
        wordsArray[0]= new WordPair("Class","Luokka");
        wordsArray[1] = new WordPair("object","olio");
        wordsArray[2]= new WordPair("variable","muuttuja");
        for (int i =0;i<wordsArray.length;i++){
            System.out.println(wordsArray[i].wordPairToString());
        }

    }
}
