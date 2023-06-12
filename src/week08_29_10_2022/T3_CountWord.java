package week08_29_10_2022;

public class T3_CountWord {
    public static void main(String[] args) {

        String[] str = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};
        int count = 0;
        for (String name : str) {
            name=name.toLowerCase();
            if (name.charAt(0)==name.charAt(name.length()-1)){
                count++;
            }

/*
            String first = name.charAt(0) + "";
            String last = name.charAt(name.length() - 1) + "";
            if (first.equalsIgnoreCase(last)) {
                count++;
            }

 */
        }
        System.out.println(count);
    }
}
/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
 */