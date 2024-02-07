package src.string;

public class CheckVowel {

    public static void main(String[] args) {
        String inputString = "Good Morning";
        CheckVowel checkVowel = new CheckVowel();
         Boolean result = checkVowel.isCheckVowel(inputString);
        System.out.println(result);
    }

    public Boolean isCheckVowel(String input){
        Boolean isVowel = false;
        if(input.isEmpty()){
            return isVowel;
        }

        for (char c : input.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i'||c == 'o'||c == 'u'){
                isVowel = true;
                return isVowel;
            }
        }

        return isVowel;
    }
}
