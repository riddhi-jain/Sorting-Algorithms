package Sorting;

public class Bubble {

	public static void main(String[] args) {
		int a[]= {2,-8,6,5,1};
		int temp=0;
		for(int i=0;i<(a.length)-1;i++) {
			for(int j=0;j<(a.length)-i-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
	

	}
		for(int item:a){
			System.out.print(" "+item);
		}

}
	}
