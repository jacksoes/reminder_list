// remember to write documentation
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class master
{
    //binary search array 
    // if closest to middle start from middle, end start from end, begining start from beginning
    final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static void main(String[] args) throws Exception 
    {
        // prompt for valid command
        /* 
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
    */
    // dont touch ^^^^^^

    // start testing here.
        command_add();
    }
    
    
    // add item to txt in alphabetical order.
    public static void command_add()
    {
        // ask for number of data.
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many items to add?");
        int add_item_count = kbd.nextInt();

        ArrayList<shopping_list> item_list = new ArrayList<shopping_list>();
        //prompt for items to add.
        while(0 < add_item_count)
        {
            System.out.println("item: ");
            String item = kbd.next();
            System.out.println("Amount: ");
            item_list.add(new shopping_list( kbd.nextDouble(), item));
            add_item_count--;
        }

        // returns list of nodes.
        
        /* RESUME HERE 
         * to do
         * - sort list of nodes in alphabetical order w sort and binary search assiging each letter a number( what sort function to use??)          In Progress.
         * 
         * -text file will be imported as a linked list. will be assumed its sorted.
         * 
         * - put alphabeticall sorted nodes into linked list.
         *  starting from index0 and head respectively or index-1 and tail respectively. get middle index and start iterating head on left side of list. start tail for right side.
         *  start from head if first letter of string
         * 
         * -text file will be imported as a linked list. will be assumed its sorted.
         */


        //shopping_list.print_list(item_list.get(0));


        // IN-PROGRESS - add nodes to text file, if empty start a linked list, else connect them in alphabetical order
    }

    // sort array, after sort chain each index together and return head.
    public static double sort(ArrayList<shopping_list> list)
    {
        final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};



        return 2.0;
        // if item.charat(i) == alphabet[i] return i.
        // binary search according to chars in String. assign rank for ordering.
    }

    //public static void sortor something integrate?     // insert in linked list based on alphabet[].



    public static void command_remove()
    {
        // coming soon
    }
    
}
