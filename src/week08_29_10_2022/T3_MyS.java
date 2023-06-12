package week08_29_10_2022;

public class T3_MyS {
    public static void main(String[] args) {
        String[] str={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count=0;
        for (String each : str) {

            each=each.toLowerCase();
                     if (each.charAt(0)==each.charAt(each.length()-1)){
               count++;
            }
        }
        System.out.println(count);
    }
}
/*/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
 */