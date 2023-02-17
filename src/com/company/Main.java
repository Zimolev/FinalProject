package com.company;

public class Main {

    public static void main(String[] args) {
        String[] massiv  = {"Winter", "Spring", "Summer", "Autumn", "January", "February", "March", "April",
                            "May", "June", "July", "August", "September", "October", "November", "November", " "};
        int sizeMassivTwo = 0;
        for (int i = 0; i < massiv.length; i++) {
            int lenghtWord = massiv[i].length();
            if (lenghtWord <=3) sizeMassivTwo = sizeMassivTwo + 1;
        }

        String[] massivThreeSimbol = new String[sizeMassivTwo];

        for (int i = 0, j = 0; i < massiv.length; i++) {
            int lenghtWord = massiv[i].length();
            if (lenghtWord <=3)
            {
                massivThreeSimbol[j] = massiv[i];
                System.out.print("'" + massivThreeSimbol[j] + "'" + " ");
                j = j + 1;
            }
        }
    }

}
