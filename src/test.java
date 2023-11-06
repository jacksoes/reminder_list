public class test 
{
    public static void main(String[] args) throws Exception 
    {
        node jack = new node(10);
        node jack1 = new node(20);
        node jack2 = new node(30);

        jack.next = jack1;
        jack1.next = jack2;
        
        shopping_list test = new shopping_list(jack);
        
        test.print_list(test.get_head());
    }
    
}
