/***
 * created by gp
 */
public class Main {
    public static void main(String[] args) {

        int[] table = {7,4,5,9,8,2,1};

        int[] shortedTable = bubbleSort(table);

        for (int j : shortedTable) {
            System.out.print(j + " ");
        }


    }

    private static int[] bubbleSort(int[] table){

        int temp;

        for (int i=0; i<table.length-1; i++){

            boolean flag = false;

            for (int j=0; j<(table.length-1) - i; j++){

                if (table[j] > table[j+1]){

                    temp = table[j];

                    table[j] = table[j+1];

                    table[j+1] = temp;

                    flag = true;
                }
            }

            if (!flag){
                break;
            }
        }
        return table;
    }
}