
public class test{

    public static void main(String[] args) {
        int []a1 = {9,9,9,9,9,9,9};
         int []a2 = {9,9,9,9};
         ListNode  pl1 =new ListNode(a1[0]);
         ListNode  pl2 =new ListNode(a2[1]);
         
        ListNode l1 = pl1;
        ListNode l2 = pl2;
    for (int i=1;i<a1.length ;i++) {
            pl1.next=new ListNode(a1[i]);
            if(i<a1.length)
                pl1=pl1.next;
        }
        for (int i=1;i<a2.length ;i++) {
            pl2.next=new ListNode(a2[i]);
            if(i<a2.length)
                pl2=pl2.next;
        }

        
     ListNode n1= new ListNode(2);
     ListNode n2= new ListNode(4);
      ListNode temp = n1;
      ListNode temp2 = n2;

    ListNode result = addTwoNumbers(l1,l2);
    // for(int i=0;i<a1.length;i++){
    //     System.out.println(result.val);
    //     if(result.next!=null)
    //     result=result.next;
    // }
        
    } 

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempL1=l1;
         ListNode tempL2=l2;
         ListNode returnSum =new ListNode(0);
         ListNode returnSum2 =returnSum;
        
         int i=0;
         while(tempL1!=null && tempL2!=null){
            if((tempL1.val == 0 && tempL2.val == 0))
                     break;
                int val1 = (tempL1 != null) ? tempL1.val : 0;
                int val2 = (tempL2 != null) ? tempL2.val : 0;

              int sum = val1+val2;
                sum+=returnSum.val;
                returnSum.val = sum %10;
                System.out.println(sum +" , "+val1+" , "+val2+ " , "+returnSum.val+" , ");
            // if((tempL1.next == null&&tempL2.next == null&&sum/10>0))
                returnSum.next=new ListNode(sum/10);
            
                 if((tempL1.next == null && tempL2.next == null))
                    break;
            tempL1=(tempL1.next != null)?tempL1.next: new ListNode(0);
            tempL2=(tempL2.next != null)?tempL2.next:new ListNode(0);
    
             returnSum=returnSum.next;
            }
     return    returnSum2;
     }
} 
