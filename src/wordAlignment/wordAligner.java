package wordAlignment;

public class wordAligner {

    public static String alignTwoWords(String strA, String strB){

        int spaces = 0;

        for (int i = 0; i < strA.length(); i++){
//            System.out.println("w");

            for (int j = 0; j < strB.length(); j++){
                String a = strA.substring(i, i+1);
                String b = strB.substring(j, j+1);

                if (a.contains(b)){
                    if (i-j >= 0){
                       spaces = i-j;
                       System.out.println(strA);
                       for (int k = 0; k < spaces; k++){
                           System.out.print(" ");
                       }
                       System.out.print(strB+"\n");
                       return "done";
                    }else{
                        spaces = i-j;
                        spaces = Math.abs(spaces);
                        for (int k = 0; k < spaces; k++){
                            System.out.print(" ");
                        }
                        System.out.print(strA+"\n");
                        System.out.print(strB);
                        return "done";
                    }
                }

            }

        }



        return "";
    }

}
