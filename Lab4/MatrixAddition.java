class MatrixAddition
{
	public static void main(String[] args) {
		int A[][]={{1,2,3},{4,5,2},{6,3,1}};
		int B[][]={{2,3,1},{4,5,1},{4,8,6}};
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B[i].length; j++) {
				System.out.print(A[i][j]+B[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}
}