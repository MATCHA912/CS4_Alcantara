package Ex05_GLU_AlcantaraLS;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    
        this.name = name;

        earnings = 0.0;

        itemList = new ArrayList<>();

        storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public ArrayList<Item> getItemList() {
        return new ArrayList<>();
    }
  public void sellItem(int index){
    
    if (index >= 0 && index < itemList.size()) {
           
            Item itemAtIndex = itemList.get(index);
            this.earnings += itemAtIndex.getCost();

            System.out.printf("%s sold %s for %.2f%n%n",this.name, itemList.get(index).getName(), itemList.get(index).getCost());
        } else {
            // Print statement that there are only x items in the store
            System.out.printf("There are only %d items in the store%n%n", itemList.size());
        }
  }
  public void sellItem(String name){
    
        for (Item item : itemList) {
            if (item.getName().equals(name)) {
               
                this.earnings += item.getCost();

                System.out.printf("%s sold %s for %.2f%n%n",this.name, name, item.getCost());

                return;
            }
        }

        System.out.printf("Store doesn't sell %s%n%n", name);
  }
  public void sellItem(Item i){

    for (Item item : itemList) {
            if (item.getName().equals(i.getName())) {
               
                this.earnings += item.getCost();

                System.out.printf("%s sold %s for %.2f%n%n",this.name, i.getName(), item.getCost());

                return;
            }
        }

        System.out.printf("Store doesn't sell %s%n%n", i.getName());
  } 
  public void addItem(Item i){
  
    this.itemList.add(i);
  }
  public void filterType(String type){

    for(Item i: itemList){
        if(i.getType().equals(type)){
            System.out.println(i.getName());
        }
    }
        System.out.println();
  }
  public void filterCheap(double maxCost){

    for(Item i: itemList){
        if(i.getCost()<=maxCost){
            System.out.println(i.getName());
        }
    }
        System.out.println();
  }
  public void filterExpensive(double minCost){

    for(Item i: itemList){
        if(i.getCost()>=minCost){
            System.out.println(i.getName());
        }
    }
        System.out.println();
  }
  public static void printStats(){

    for(Store s: storeList){
        System.out.printf("Name: %s%nEarnings: %f%n%n", s.getName(), s.getEarnings());
    }
        System.out.println();
  }
}
