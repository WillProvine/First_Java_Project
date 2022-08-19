public class JavaClass {

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.print("How are you\n I hope you are well");

        int numDwarves; // instantiation
        numDwarves = 7; // initialization

        int numStooges = 3; // both instantiation and initialization

        System.out.println("There are" +numDwarves+ " dwarves in my basement");
        System.out.println("There were" +numStooges+ " Stooges until curly died");

        numStooges= numStooges + 1;
//        numStooges +=1;
//        numStooges ++;
        System.out.println("Now with Shemp there are " +numStooges+" stooges");

        int a = 0;
        while (a<10)
        {
            a = a + 2;
            System.out.println(a);
        }
    }

}
