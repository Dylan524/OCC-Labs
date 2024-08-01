import java.util.ArrayList;

public class Sandwich {
    private double baseCost;
    private double costPerItem;
    private String breadType;
    private ArrayList<String> items;
    
    public Sandwich(double baseCost, double costPerItem, String breadType){
        this.baseCost = baseCost;
        this.costPerItem = costPerItem;
        this.breadType = breadType;
        this.items = new ArrayList<>();
    }

    public double getBaseCost(){
        return baseCost;
    }

    public double getCostPerItem(){
        return costPerItem;
    }

    public String getBreadType(){
        return breadType;
    }

    public ArrayList<String> getItems(){
        return items;
    }

    public void addItem(String item){
        items.add(item);
    }
    
    public double getTotalCost(){
        double totalCost = baseCost + (costPerItem * items.size());
        return totalCost;
    }

}
