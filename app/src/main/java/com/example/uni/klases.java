package com.example.uni;

public class klases {

    public static int Choises(String choice, String text)
    {
        switch (choice) {
            case "Chars":

                    return text.length();

            case "Words":

                int WordAmount = 0, amount;
                int stringLength = text.length();

                for (int i = 0 ; i < stringLength - 1; i++)
                {
                    amount = i + 1;

                    if (Character.isLetter(text.charAt(amount)) && amount == stringLength - 1 || Character.isLetter(text.charAt(i)) && text.charAt(amount) == ',' || Character.isLetter(text.charAt(i)) && text.charAt(amount) == '.' || Character.isLetter(text.charAt(i)) && text.charAt(amount) == ' ')
                    {
                        WordAmount++;
                    }
                }

                return WordAmount;



        }

        return 0;
    }

}
