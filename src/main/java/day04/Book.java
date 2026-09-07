package day04;

public class Book {
    private String name;
    private  int page;
    private double fee;
    public Book(){
        this.name = "未知";
        this.page = 0;
        this.fee = 0;

    }

    public Book(String name, int page, double fee) {
        this.name = name;
        this.page = page;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void show(){
        System.out.println(page);
        System.out.println(fee);
        System.out.println(name);
    }

}
