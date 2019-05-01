class BubbleSort{
	public static void bubble(int X[],int N){
		int K,i,Y;
		for (K=1; K<=N-1; K++) {
			for (i=0; i<=(N-1)-K; i++) {
				if (X[i]>X[i+1]) {
					Y=X[i];
					X[i]=X[i+1];
					X[i+1]=Y;
					
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[]={2,3,5,4,1};
		int i;
		System.out.println("Before sorting Array= ");
		for (i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		bubble(arr,5);
		System.out.println();
		System.out.println("After sorting Array= ");
		for (i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}