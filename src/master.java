// remember to write documentation
import java.util.Scanner;
import java.util.HashMap;

public class master
{
    //binary search array 
    // if closest to middle start from middle, end start from end, begining start from beginning
    final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static void main(String[] args) throws Exception 
    {
        // prompt for valid command
        try {args[0].length();}
        catch ( IndexOutOfBoundsException e ) 
        {
            System.out.println("\nInsert command. Functionality shoppinglist.java ... \n"+
            "\tadd : Add items to your shopping cart.\n"+
            "\tremove : Remove items form your shopping cart.\n"+
            "\thelp : list all commands.");
            return; 
        }
        if (!(args.length == 1))
        {
            System.out.println("\n use one command");
            return;
        }

        //check for valid command
        switch(args[0])
        {
            case "add":
                command_add();
                break;
            case "remove":
                // command_ remove
                System.out.println("Remove coming soon!");
                break;
            default:
                System.out.println("input a valid command");



        }
        return;
        //System.out.println("this is zero: " + args[0] + "\nthis is one: " + args[1]);
    }
    
    // add item to txt in alphabetical order.
    public static void command_add()
    {
        // ask for number of data.
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many items to add?");
        int add_item_count = kbd.nextInt();
        node[] add_item = new node[add_item_count];
        //prompt for items to add.
        for (int i = 0; i < add_item.length; i++)
        {
            add_item[i] = new node(kbd.nextInt());
        }
        // IN-PROGRESS - add nodes to text file, if empty start a linked list, else connect them in alphabetical order
    }


    //public static void sortor something integrate?     // insert in linked list based on alphabet[].



    public static void command_remove()
    {
            //
    }
    
}
