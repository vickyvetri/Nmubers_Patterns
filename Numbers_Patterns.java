package Patterns;

public class Numbers_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers_Patterns obj = new Numbers_Patterns();		
//		obj.Print_0();
//		obj.Print_1();
//		obj.Print_2();
//		obj.Print_3();
//		obj.Print_4();
//		obj.Print_5();
//		obj.Print_6();
//		obj.Print_7();
//		obj.Print_8();
//		obj.Print_9();
		
	}

	private void Print_0() {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++) {
			if(row==1) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	
	private void Print_1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row<=7) {
				for(int a=1;a<=7;a++) {
					if(a+row==5||row==7||a==4) {
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==4) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						if(row==1&&n==1) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						if(row==4&&n==7) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	
	private void Print_4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row<=7) {
				for(int n=1;n<=7;n++) {
					if(row==6||row+n==7||n==6) {	 
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==6) {
				System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	

	
	private void Print_5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(row==5&&n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++) {
			if(row==1) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						if(row==4&&n==1) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						if(row==1&&n==1) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	
	private void Print_7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row<=7) {
				for(int a=1;a<=7;a++) {
					if(row+a==8||row==1) {
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}

	private void Print_8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						System.out.print("  ");
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	

	private void Print_9() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			if(row==1||row==5) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						if(n==7&&row==5) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) {
			if(row==4) {
				for(int n=1;n<=7;n++) {
					if(n==1||n==7) {
						System.out.print("  ");
						}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==7) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

}