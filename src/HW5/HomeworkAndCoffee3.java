package HW5;



public class HomeworkAndCoffee3 {

		
		public int maxElement(int[][] x) {
			
						int init = x[0][0]; 
						for (int i = 0; i <x.length; i++) {
						
					for (int j = 0; j <x[i].length; j++) {
						if (init < x[i][j]) {
							init = x[i][j];
						}		
					}
						}	
						return init;
		}
							
		
		 public double maxElement(double [][] x) {
			
						double init = x[0][0]; 
						for (int i = 0; i <x.length; i++) {
							
							for (int j = 0; j <x[i].length; j++) { 
								if (init < x[i][j]) {
									init = x[i][j];
								}
							}
						}
						return init;
		}
		
		void main() {
			
			HomeworkAndCoffee3 x = new HomeworkAndCoffee3();
			
			int [][] intArray = {{1, 6, 3},
								{9, 5, 2}};
			
			double [][] doubleArray = {{1.2, 3.5, 2.2},
										{7.4, 2.1, 8.2}};
			
			
			IO.println(x.maxElement(intArray));
			IO.println(x.maxElement(doubleArray));
				
			}
		}


	