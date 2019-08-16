//2016114965 이효동
package pb2;
public class PayableInterfaceTest 
{
   public static void main( String[] args )
   {
      Payable[] payableObjects = new Payable[2];
      
      payableObjects[ 0 ] = new Classic("캐논",1732,"파헬벨");
      payableObjects[ 1 ] = new Pop("바람이 분다", 2004, "이소라" );
 
      for ( Payable currentPayable : payableObjects )
      {
         System.out.printf( "%s\n%s\n", 
            currentPayable.toString(), 
           currentPayable.play() ); 
      } // end for
   } // end main
} // end class PayableInterfaceTest



