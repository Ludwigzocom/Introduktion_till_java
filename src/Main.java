
//1.Klassen
// All kod i Java måste bo inuti en "class".
//Namnet (main) MÅSTE stämma överens med filnamet(Main.java)
public class Main{

//2.MAIN-METODEN
//När vi trycker på RUN letar java efter exakt denna rad.
    public static void main(String[] args){

      //System = Javas inbyggda klass för att prata med operativsystemet
      //out = utmatningsdelen - skärmen/consolen.
      //println = Print Line. Skriv ut text gör vi ett radbryte
      //citattecken ("") används alltid för ren text.
      //semikolon(;) avslutar instruktionerna. Javas punkt t.ex. i en mening
      System.out.println("Hello world");
      //print skriver ut och stannar på samma rad i console
      System.out.print("Hello again");

        System.out.println("-- Primitiva Datatyper: Heltal--");

        //VARIABEL-SYNTAX [Datatyp] [Namn] = [värde]
        //1. BYTE (Tar extremt lite plats 1 byte / 8 bits i RAM-minne
        //Kan bara lagra tal från -128 till 127
        //Används sällan idag om vi inte programmerar inbyggda system med lite minne

        //SHORT (Tar 2 bytes) Rymmer upp till ca 32 000.
            short smallNumber = 3000;

        //INT (INTEGER - Tar 4 bytes). Den absolut vanligaste för heltal.
        //Rymmer upp till ca 2.1miljarder. Standarvalet för heltal
            int userAge = 35;
            int bigNumber = 1200000;

        //LONG (Tar 8 bytes). För massiva tal
        //kan uppnå summa på 9 kvintiljoner
        //Måte alltid avslutas med ett L för att Java ska boka de extra 4 byten i minnet

            long databasKod = 612512351230000L;

            System.out.println("Våran användare är " + userAge + " år gammal" );


            System.out.println("------------");
            System.out.println("------------");
            System.out.println("------------");

            System.out.println("--Primitiva Datatyper: Decimaler--");

            //FLOAT (Flyttal: 4 bytes
            // har ca 7 decimalers precision
            // Måste avslutas med f annars tror Java att det är en double
            float cpuTemp = 45.5135f;

            //DOUBLE (Double precision - 8 bytes)
            // har ca 15 decimalers precision. Standardvalet i java för decimaltal
            //Används för exakta beräkningar (förutom valuta beräkningar, då använder vi andra klasser)

            double serverUpTime = 99.99982;


            System.out.println("Server uptime: " +serverUpTime);



        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");

        System.out.println("--- Primitiva Datatyper: Logik & Tecken ---");

        //BOOLEAN ( Sant eller falskt - 1 bit )
        //Grunstenen i all flödeskontroll och "if-satser", de besöker vi på torsdag

        boolean isAdmin = true;
        boolean isOverSpeedLimit = false;

        //CHAR (Character - 2 bytes)
        //Sparar exakt ETT tecken baserat på unicode-tabellen
        char betyg = 'A';
        char dollarSign = '$';

        System.out.println("Are you an admin?" + isAdmin);


        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");

        System.out.println("--Referens-datatyper (Objekt)--");

        //STRING (Textsträng)
        //Använder alltid dubbla citattecken (" ").
        String teacher = "Ludwig";
        String ipAddress = "192.168.1.0";

        System.out.println(teacher +"s " +"Ip address is: " + ipAddress);

        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");


        // String = för texter, int = för heltal, double = för decimaltal, boolean = för sant/falk
        String firstName = "ludwig";
        int age = 28;
        double height = 1.93;
        boolean overAge20 = true;
        System.out.println(firstName + " "+ age);

        age = 29;
       // age = "29"
        firstName = "Isak";
        System.out.println(firstName+ " " + age);

        //för att göra en variabel konstant lägger jag till (final) innan deklaration
        final double pi = 3.14;

        //Beräkningar i java med int/double

        int number = 5;
        double decimalNumber = 5.4;
        System.out.println(number + decimalNumber);

        double combinedNumber = number + decimalNumber;

        int multiplikation = 5*5+22*2;
        System.out.print(multiplikation);


        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");
    //camelCase för att namge variabler t.ex thisIsMyVariable
        String myFirstName = "Ludwig";
        int myAge = 28;
        double myHeight = 1.93;
        boolean coffe = true;


        System.out.println("*********************");
        System.out.println("*My name is: " + myFirstName + "*");
        System.out.println("*My age is: " + myAge + "*");
        System.out.println("*My height is: "+ myHeight + "*");
        System.out.println("*Do I like coffe? : "+ coffe + "*");
        System.out.println("**********************");

        myFirstName = "Albin";
        myAge = 24;
        myHeight = 1.78;
        coffe = false;
        System.out.println("*********************");
        System.out.println("*My name is: " + myFirstName + "*");
        System.out.println("*My age is: " + myAge + "*");
        System.out.println("*My height is: "+ myHeight + "*");
        System.out.println("*Do I like coffe? : "+ coffe + "*");
        System.out.println("**********************");

        int numberOne = 5;
        int numberTwo = 10;
        int numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        String testingText = "Hello";

        System.out.println(testingText + numberOne);
        String discordName = "ludwigDev";
        int unknownNumber;
        unknownNumber = 5;


    } //Här slutar main-metoden
} //Här slutar klassen main