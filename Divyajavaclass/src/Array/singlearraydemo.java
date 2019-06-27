package Array;

public class singlearraydemo {

	public static void main(String[] args) {
		//Array is the collection of similar data type//
		//for example you have write inta, intb, intc......//
		//with the help of array u can write in single line//
		//datatype arrayname[]=new datatype[size];/
		
      int apples[]=new int[5];
      apples[0]=(int) 10;
      apples[1]=12;
      apples[2]=14;
      apples[3]=16;
      apples[4]=18;
      int sizeofarray=apples.length;
      System.out.println(sizeofarray);
      for(int i=0;i<sizeofarray;i++)
      {
    	  System.out.println(apples[i]);
      }
      
	
      int oranges[]=new int[4];
      oranges[0]=(int) 12;
      oranges[1]=13;
      oranges[2]=16;
      oranges[3]=18;
      
      int sizeofArray=oranges.length;
      System.out.println(sizeofArray);
      
      String names[]=new String[4];
      names[0]="divya";
      names[1]="narendra";
      names[2]="vanshika";
      names[3]="ruhitha";
      
     
      System.out.println(names[1]);
      
      //2D array//
      
      int school[][]=new int [2][2];
      
      school[0][0]=10;
      school[0][1]=24;
      school[1][0]=36;
      school[1][1]=48;
      
      System.out.println(school[0][1]);
      
	}
      
      
      
}
