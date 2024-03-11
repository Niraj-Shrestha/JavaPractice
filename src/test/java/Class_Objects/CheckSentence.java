package Class_Objects;

import java.util.ArrayList;
import java.util.List;

public class CheckSentence {
    public static void main(String[] args) {
        usePronoun();
    }

    public static void usePronoun() {
        String sentence = "Niraj is nepali. Niraj lives in United States.";
        String[] sentenceArray = sentence.split(" ");
        List<String> list = new ArrayList<>();
        int count = 0;
        for (String e : sentenceArray) {
            list.add(e);
            if(e.equalsIgnoreCase("niraj")){
                count++;
            }
        }
        if(count<2){
            printList(list);
        }else {
            int counter = 1;
            for(int i=0; i < list.size(); i++){
                if(list.get(i).equalsIgnoreCase("niraj")){
                    if(counter>1){
                        list.set(i,"He");
                    }
                    counter++;
                }
            }
            printList(list);
        }
    }

    public static void printList(List<String> list){
        StringBuilder stringBuilder = new StringBuilder();

        for(String s : list) {
            stringBuilder.append(s + " ");
        }
        System.out.println(stringBuilder);
    }
}
