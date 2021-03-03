class Bill {
	private static Object[] availableItems;
	
	static {
		availableItems = new Object[] {
				new Object[]{1001, "Puma", "T-shirt", new int[] {34,36}, 25.0},
				new Object[]{1002, "Puma", "Skirt", new int[] {38,40}, 20.0},
				new Object[]{1003, "Reebok", "T-shirt", new int[] {34,36}, 23.0},
				new Object[]{1004, "Reebok", "Skirt", new int[] {38,40}, 18.0},
		};
	}
	
	public double findPrice(int itemId) {
		
		for(int i=0; i<availableItems.length; i++) {
			Object[] comparisonItem = (Object[]) availableItems[i];
			int comparisonItemId = (int)comparisonItem[0];
			double comparisonItemPrice = (double)comparisonItem[4];
			
			if (comparisonItemId == itemId) {
				return comparisonItemPrice;
			}
		}
		
		return 0.0;
	}
	
	public double findPrice(String brandName, String itemType, int size) {
		
		for(int i=0; i<availableItems.length; i++) {
			Object[] comparisonItem = (Object[]) availableItems[i];
			String comparisonItemBrandName = (String)comparisonItem[1];
			String comparisonItemItemType = (String)comparisonItem[2];
			int[] comparisonItemSizes = (int[])comparisonItem[3];
			double comparisonItemPrice = (double)comparisonItem[4];
			
			if (comparisonItemBrandName.equals(brandName) && comparisonItemItemType.equals(itemType)) {
				for(int j = 0; j < comparisonItemSizes.length; j++) {
					if(comparisonItemSizes[j] == size) {						
						return comparisonItemPrice;
					}
				}
			}
		}
		
		return 0.0;
	}
}