package Intervieew;

public class Remove_WhiteSpace {
    public static void main(String[] args) {
        String str="java   programming  and   selenium   course   ";
        System.out.println("before removing space  =>  "+str);
        str=str.replaceAll("\\s","");
        System.out.println("after removing space  =>  "+str);

    }
}
