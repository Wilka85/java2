package task6;

public class Main {
    public static void main(String[] args) {
        String input = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String res = replacer(input,"object-oriented programming","OOP");
        System.out.println(res);
    }
    public static String replacer(String input, String target,String replacement){
        String lowerInput = input.toLowerCase();
        String lowerTarget = target.toLowerCase();
        int counter =0;
        int index=0;
        StringBuilder stringBuilder = new StringBuilder(input);
        while ((index = lowerInput.indexOf(lowerTarget,index))!=-1){
            counter++;
            if(counter%2==0){
                stringBuilder.replace(index,index+target.length(),replacement);
            }
            index+=target.length();
        }
        return stringBuilder.toString();
    }
}
