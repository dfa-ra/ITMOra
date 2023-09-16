class lab1 {
    public static void main(String[] args) {
		//Пункт 1
    	long[] c = {22, 20, 18, 16, 14, 12, 10, 8, 6, 4};
		
		//Пункт 2
		float min = -10;
		float max = 12;
    	double x[];
		x = new double[15];
    	for (int i = 0; i < 15; i++){
    		x[i] = (Math.random() * ((max - min) + 1)) + min;
		}   	
		
		//Пункт 3
		double a[][] = new double[10][15];
		for (int i = 0; i < c.length; i++){
			for (int j = 0; j < x.length; j++){
				if (c[i] == 8){
					a[i][j] = Math.atan(Math.sin(Math.pow(3.0 * Math.log(Math.abs(x[j])),3)));
				}
				else if (c[i] == 4 || c[i] == 6 || c[i] == 12 || c[i] == 14 || c[i] == 16){
					a[i][j] = 2 / Math.pow((Math.asin((x[j] + 1.5) / 23) - 1) * (x[j] - 1.0 / 2.0) / 2, 3);
				}
				else{
					a[i][j] = Math.sin(Math.cbrt(Math.exp(Math.pow(0.25/(x[j] - 1),3))));
				}
			}
		}

		//Пункт 4
		for (int i = 0; i < c.length; i++){
			for (int j = 0; j < x.length; j++){
				System.out.printf("%10.3f ", a[i][j]);
			}
			System.out.println();
		}
    }
}
