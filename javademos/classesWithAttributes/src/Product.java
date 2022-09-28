public class Product {
    public Product(int _id,String _name,double _price, int _stockAmount){
        System.out.println("yapıcı blok çalıştı");
        this._id=_id;
    }
    private int _id;
    private String _name;
   private String _descripption;
    private double _price;
    private int _stockAmount;
    private String _kod;

    public int getId(){
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_descripption() {
        return _descripption;
    }

    public void set_descripption(String _descripption) {
        this._descripption = _descripption;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }
}
