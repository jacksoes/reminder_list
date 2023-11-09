public class shopping_list
{
    //shopping_list states
    private String item_name;
    private double quantity;
    private shopping_list next;
        //node 
    public shopping_list(double quantity, String item_name) 
    {
        this.quantity = quantity; 
        this.item_name = item_name; 
        this.next = null;
    }


    public double get_data()
    {
        return this.quantity;
    }


    // for shopping list object
    public void print_list()
    {
        
            do {
            System.out.println(this.quantity);
            this.next = this.next.next;
        } while (this != null);
    }

    public static void iterate(shopping_list head)
    {
        while (head != null)
        {
        System.out.println(head.item_name + head.quantity);
        head = head.next; 
        }
    }

    // may not be used !!!!
    public static void chain(shopping_list first, shopping_list second)
    {
        first.next = second;
        
    }

    public void chain(shopping_list second)
    {
        this.next = second;
    }

}