public class shopping_list
// is this loading all the memory from main twice?
{
    //shopping_list states
    private node head;
    private node middle;
    private node tail;

    public shopping_list(node head)
    {
        this.head = head;
    }
    public node get_head()
    {
        return this.head;
    }

    public int get_data(node head)
    {
        return head.quantity;
    }

    public void print_list(node head)
    {
        while (head != null)
        {
            System.out.println(head.quantity);
            head = head.next;
        }
    }

}