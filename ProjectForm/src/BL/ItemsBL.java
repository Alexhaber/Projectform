package BL;

//Calse donde se guardan los datos relacionados con la db del inventario, y luego se mandan manda(getters)
//a otras clase para la edicion de datos
public class ItemsBL 
{
    private String Name;
    private String Brand;
    private String Category;
    private float Price;
    private int QuantityAvailable;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantityAvailable() {
        return QuantityAvailable;
    }

    public void setQuantityAvailable(int QuantityAvailable) {
        this.QuantityAvailable = QuantityAvailable;
    }
    
}
