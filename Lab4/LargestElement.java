class LargestElement{
	public static void main(String[] args) {
		int arr[]={4,7,3,8,6,2};
		int max=arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		System.out.println("The largest value in array is: "+max);
	}
}
