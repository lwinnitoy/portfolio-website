/********************* 
Program: HangMan
Author: Liam Winnitoy
Date: 5/30/2023
Purpose: To meet my end at the gallows
**********************/
using System;

class Program
{
    
    static void Main(string[] args)
    {
        //WELCOME
        Console.WriteLine("WELCOME TO HANGMAN :o");

        //Choosing players
        Console.WriteLine("Choose player 1 name");
        string p1 = Console.ReadLine();
        Console.WriteLine("Choose player 2 name");
        string p2 = Console.ReadLine();

        //Main variables
        char gus;
        int tries;
        bool gamend;

        //object (creation)
        Word entry;
        Guess letter;
        Visuals deadman = new Visuals();

        //>>GAMEPLAY LOOP
        do
        {
            //object (initialization)
            entry = new Word();
            letter = new Guess();

            //get and check word
            entry.PrepWord(p1);

            //guess letter loop
            do
            {
                //get letter
                letter.GetLetter(p2);
                gus = Convert.ToChar(letter.ReturnLetter());

                //clear console
                Console.Clear();

                //checks if guess is correct or not
                entry.IsGuess(gus);

                //print Remaining Guesses
                tries = entry.GuessesLeft();

                //print wordOutput
                entry.PrintWord();

                //prints how many tries user has left
                Console.WriteLine($"\nGuesses left: {tries}");

                //calls visuals method
                deadman.PrintVisuals(tries);

            } while (entry.IsGameOver());

            //is game over???
            gamend = YorN();

        } while (gamend);
    }

    //asks if user wants to contiue playing
    //uses a endless do while loop with a try catch to keep crashes from happening. returns false if user enters 'n' and returns true if user enters 'y', ending the gameplay loop
    static bool YorN()
    {
        do
        {
            try
            {
                Console.WriteLine("GAME OVER");
                Console.WriteLine("\nDo you want to play again? y/n");
                char yn = Convert.ToChar(Console.ReadLine());

                if (yn == 'n')
                {
                    return false;
                }
                else if (yn == 'y')
                {
                    return true;
                }
                Console.WriteLine("Invalid entry.");
            }
            catch
            {
                Console.WriteLine("Invalid entry.");
            }
        } while (true);
    }
}

class Word
{
    //attributes ;)
    char[] wordOutput;
    char[] wordSecret;
    int tries = 7;
    int poopy = 0;

    //method to get word from user method to check if word does not include numbers or symbols
    //method uses isletter to check every instance in the string the user enters to make sure it is a valid letter.
    //also checks to make sure the entry is longer than 4 letters.
    //calls newarray method if the value entered passes the checks to create a new array with the letters entered by the user.
    public string PrepWord(string p1)
    {
        string wrds;
        Console.WriteLine($"{p1}, please enter a word. Minimum 4 letters");
        wrds = Console.ReadLine();
        wrds = wrds.ToUpper();
        Console.Clear();

        if (wrds == "") { Console.WriteLine("Invalid entry");  PrepWord(p1); }
        
        foreach (char c in wrds)
        {
            if (!(Char.IsLetter(c) && wrds.Length >= 4))
            {
                Console.WriteLine("Invalid entry");
                return PrepWord(p1);
            }
        }

        NewArray(wrds);
        return wrds;
    }

    //method to get word entered in prepword into an array.
    //fills two arrays: one filled with '_' to output on the console, and the other filled with the word entered.
    //after arrays are filled it prints the output array to the console.
    private void NewArray(string wrds)
    {
        wordOutput = new char[wrds.Length];
        wordSecret = new char[wrds.Length];

        for (int i = 0; i < wrds.Length; i++)
        {
            wordOutput[i] = '_';
            wordSecret[i] = wrds[i];
        }

        for (int i = 0; i < wrds.Length; i++)
        {
            Console.Write($"{wordOutput[i]} ");
        }
    }

    //Prints wordoutput array to the console 
    public void PrintWord()
    {
        for (int i = 0; i < wordOutput.Length; i++)
        {
            Console.Write($"{wordOutput[i]} ");
        }
    }

    //replaces an instance in wordOutput with a character from word secret
    //creates a int variable that = the length of wordsecret array and decreases it by 1 each time the letter the user guesses does not match an instance in the array.
    //if the letter matches an instance in the array, the int variable does not decrease and an different int variable that represents the number of correct guesses the user has made, is increased by 1.
    public void IsGuess(char gus)
    {
        int bumbum = wordSecret.Length;
        for (int i = 0; i < wordSecret.Length; i++)
        {
            if (wordSecret[i] == gus)
            {
                wordOutput[i] = gus;
                poopy++;
            }
            else
            {
                bumbum--;
            }
        }
        if (bumbum == 0)
        {
            tries--;
            Console.WriteLine("Incorrect Guess");
        }
    }

    //returns remaining tries the user has.
    public int GuessesLeft()
    {
        return tries;
    }

    //checks how many guesses the user has left
    //checks if the user has the same amount of correct guesses as the length of the word
    //returns false if game is over / if the user has 0 guesses or if they have guessed all correctly
    public bool IsGameOver()
    { 
        if (tries == 0)
        {
            return false;
        }else if(poopy == wordSecret.Length)
        {
            return false;
        }
        else{return true;}
    }
}

class Guess
{
    int temp;
    bool[] alphabet;

    //fills bool array with 26 false
    //create an array that represents the 26 letter in the alphabet
    public Guess()
    {
        alphabet = new bool[26];
        for (int i = 0; i < alphabet.Length; i++)
        {
            alphabet[i] = false;
        }
    }

    //gets letter from user
    //calls method to change the entry into a capital letter and to make sure it is an letter (not character of anything else)
    //calls method that prints invalid entry if the entry was not a letter and also checks if the letter has been guessed before
    public void GetLetter(string p2)
    {
        Console.WriteLine($"\n{p2}, guess a letter.");
        Console.ForegroundColor = ConsoleColor.Black;
        temp = IsRight(Console.ReadKey().KeyChar);
        Console.ForegroundColor = ConsoleColor.Gray;

        CheckLetter(p2);
    }

    //checks if guessed by calling HasGuessed method
    //prints invalid entry if the entry was not a letter
    private void CheckLetter(string p2)
    {   
        if (temp == 0)
        {
            Console.WriteLine("\nInvalid entry.");
            GetLetter(p2);
        }
        else if (HasGuessed(temp))
        {
            Console.WriteLine("\nAlready guessed.");
            GetLetter(p2);
        }
        else 
        {
            Convert.ToChar(temp);
        }

        Convert.ToChar(temp);
    }

    //checks if letter
    //returns 0 if not
    static int IsRight(char c)
    {
        if (c > 65 && c < 90) return c;
        else if (c >= 97 && c <= 122) return (c - 32);
        else return 0;
    }

    //will return true if already guessed
    //uses alphabet array to check if the insance in the array representing the letter in the alphabet has already been changed and therefore guessed.
    private bool HasGuessed(int temp)
    {
        if (alphabet[temp - 65] == true)
        {
               return true;
        }
        else
        {
              alphabet[temp - 65] = true;
              return false;
        }
    }

    //returns the letter the user guessed
    public int ReturnLetter()
    {
        return temp;
    }
}

//cotains a switch case method for printing different visuals based off how many guesses the user has left
//uses ascii art
class Visuals
{
    public void PrintVisuals(int tries)
    {
        switch (tries)
        {
            case 7:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 6:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 5:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 4:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 3:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("     |\\  |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 2:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("    /|\\  |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 1:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("    /|\\  |    ");
                Console.WriteLine("      \\  |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
            case 0:
                Console.WriteLine("     +---+    ");
                Console.WriteLine("     |   |    ");
                Console.WriteLine("    _=_  |    ");
                Console.WriteLine("     O   |    ");
                Console.WriteLine("    /|\\  |    ");
                Console.WriteLine("    / \\  |    ");
                Console.WriteLine("         |    ");
                Console.WriteLine("   =========  ");
                break;
        }
    }
}



