class prac2 {

  public static void main(String[] args){
    // Declaration and Allocation of 3x3 2D Array
    int[][] matrix = new int[3][3];

    // Assigning values
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;

    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    // could you also do:
    //int[][] matrix ={
    //{1, 2, 3},
    //{4, 5, 6},
    //{7, 8, 9},
    // };

    System.out.println("Length of Row"+ matrix.length);
    System.out.println("Length of Column"+ matrix[0].length);
    System.out.println("=========================");

    System.out.println("Length of Row"+ matrix.length);
    System.out.println("Length of Column"+ matrix[0].length);
    System.out.println();
    System.out.println("====================");

    System.out.println("Accessing 2D Array Through Index:");
    System.out.println("Element at [1][2] ="+ matrix[1][2]);
    System.out.println("=====================");

    System.out.println("Accessing 2D Array Through Nested For-Loop:");
    for (int i = 0)
  }
  
}
