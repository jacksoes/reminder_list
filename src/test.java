
public class test extends shopping_list
{
    public test(double quantity, String item_name)
    {
        super(21.4, "dont care");
    }
    public static void main(String[] args) throws Exception 
    {
        shopping_list jack = new shopping_list(10, "apple");
        shopping_list jack1 = new shopping_list(20, " pear");
        shopping_list jack2 = new shopping_list(30, "zukini");


        //shopping_list.link(jack, jack1);
        //shopping_list.link(jack1, jack2);

        jack.chain(jack1);
        jack1.chain(jack2);

        shopping_list.iterate(jack);

        //test.print_list();

        //master.command_add();

        //master.command_add();
    }
    
}
