package cart;

import java.util.LinkedList;
public class Items {
    private int id;
    private String name;
    private Double price;
    private Double quantity;
    private Double total;
    private LinkedList<Items> item;  

    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price=price;
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantity(Double quantity) {
        this.quantity=quantity;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setTotal(Double total) {
        this.total=total;
    }

    public Double getTotal() {
        return total;
    }
    
    public void setItem(LinkedList<Items> item)
    {
        this.item=item;
    }
     
    public LinkedList<Items> getItem() {
        return item;
    }

}