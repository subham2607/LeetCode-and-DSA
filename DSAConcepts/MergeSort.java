package DSAConcepts;

public class MergeSort {
	
	public static void main(String args[]) {
		
		int[] arr= {23,12,45,5,67,11};
//		for(int visited: arr)
//			System.out.println(visited);  12,23,45,67,11
		MergeSort MS = new MergeSort();
		MS.sort(arr, 0, arr.length - 1);
		MS.print(arr);
		
	}
	
	public void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int visited: arr)
			System.out.println(visited);
		
		
	}

	public void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		
		for(int i = 0; i<n1;i++) {
			L[i] = arr[i+l];
		}
		for(int j = 0; j<n2;j++) {
			R[j] = arr[mid+1+j];
		}
		int i =0;
		int j =0;
		int k =l;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	public void sort(int[] arr,int l,int r) {
		if(l<r) {
			int mid = l + (r-l)/2;
			
			sort(arr, l, mid);
			sort(arr, mid + 1, r);
			
			merge(arr,l,mid,r);
			
			
		}
		
	}

}
