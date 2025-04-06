public class v203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)  return null;

        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode poi=dummy;
        while(poi.next!=null){
            if(poi.next.val==val){
                poi.next=poi.next.next;
            }else{
                poi=poi.next;
            }
        }
        return dummy.next;
    }
}
