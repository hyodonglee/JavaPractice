//2016114965 ��ȿ��
package pb2;
public class PayableInterfaceTest 
{
   public static void main( String[] args )
   {
      Payable[] payableObjects = new Payable[2];
      
      payableObjects[ 0 ] = new Classic("ĳ��",1732,"���ﺧ");
      payableObjects[ 1 ] = new Pop("�ٶ��� �д�", 2004, "�̼Ҷ�" );
 
      for ( Payable currentPayable : payableObjects )
      {
         System.out.printf( "%s\n%s\n", 
            currentPayable.toString(), 
           currentPayable.play() ); 
      } // end for
   } // end main
} // end class PayableInterfaceTest



