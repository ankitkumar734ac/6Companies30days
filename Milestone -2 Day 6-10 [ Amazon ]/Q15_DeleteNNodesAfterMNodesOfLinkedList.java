class Q15_DeleteNNodesAfterMNodesOfLinkedList{
    static void linkdelete(Node head, int M, int N)
    {
        Node temp=head;
        int n=1,m=N;
        while(temp!=null){
            if(n==M){
                Node p=temp;
                while(p!=null && m-->0){
                    p=p.next;
                }
                if(p!=null)
                temp.next=p.next;
                else
                temp.next=p;
                n=0;
                m=N;
            }
            n++;
            temp=temp.next;
        }
    }
}


