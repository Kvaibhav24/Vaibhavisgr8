public class Stack {
     int Top=-1;
     int n=5;
     int[] arr=new int[n];
    void push(int item){
         if(Top>=n-1){
            System.out.println("Overflow");
         }
else{
            arr[++Top]=item;
         }
    }
    int pop(){
        int temp=0;
        if(Top<0){
            System.out.println("Underflow");
        }
else{
            temp=arr[Top--];
        }
        return temp;
    }
    void display(){
        for(int i=Top;i>=0;i--)
{
            System.out.println("Top element of stack= "+arr[i]);
        }
    }
 
   
 public static void main(String[] abc) {
System.out.println("Vaibhav, 2102283, IT-C2");
 Stack obj=new Stack();
obj.push(10)
obj.push(13);
obj.push(12);
obj.display();
obj.pop();
obj.display();
    }
}
