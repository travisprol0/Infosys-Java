import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tester {
    
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		//Map<String, Integer> salesNew = new HashMap<String, Integer>();
		
		List<String> employeeNames = new ArrayList<String>();
		List<Integer> employeeSaleNums = new ArrayList<Integer>();
		for (Map.Entry<String, Integer> employeeSales : sales.entrySet()) {
		    employeeNames.add(employeeSales.getKey());
		    employeeSaleNums.add(employeeSales.getValue());
		}
		System.out.println(employeeNames);
		System.out.println(employeeSaleNums);
		
		// Bubble Sort Time
		int size = sales.size(); 
        for (int i = 0; i < size - 1; i++) 
            for (int j = 0; j < size - i - 1; j++) 
                if (employeeSaleNums.get(j) < employeeSaleNums.get(j+1)) 
                { 
                    int tempNumber = employeeSaleNums.get(j); 
                    employeeSaleNums.set(j, employeeSaleNums.get(j+1)); 
                    employeeSaleNums.set(j+1, tempNumber); 
                    
                    String tempString = employeeNames.get(j); 
                    employeeNames.set(j, employeeNames.get(j+1)); 
                    employeeNames.set(j+1, tempString); 
                } 
		return employeeNames;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}