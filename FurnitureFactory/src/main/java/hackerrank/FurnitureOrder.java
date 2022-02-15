package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    private final HashMap<Furniture,Integer> mapFurnitures;
    
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
       mapFurnitures = new HashMap<Furniture,Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        Integer count = 0;
        if(mapFurnitures.containsKey(type)){
              count =  mapFurnitures.get(type);
        }
        mapFurnitures.put(type,count + furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return null;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}
