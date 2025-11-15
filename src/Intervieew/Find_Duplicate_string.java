package Intervieew;

public class Find_Duplicate_string {
    public static void main(String[] args) {
        String str="absccda";
        int count=0;
        char a[]=str.toCharArray();

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println("Duplicate character in string are:" +a[j]);
                    count++;
                }
            }
        }
        System.out.println("duplicate character count "+count);

    }
}
