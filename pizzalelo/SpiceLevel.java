package pizzalelo;

public class SpiceLevel extends Item {
    private String spiceLevel;

    public SpiceLevel(String spiceLevel, int quantity) {
        super(quantity);
        this.spiceLevel = spiceLevel;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    @Override
    public double calculatePrice() {  
        return getPrice();
    }
}
