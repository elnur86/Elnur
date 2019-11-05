package Day191029;

import java.util.ArrayList;

public class Holder {
    private int total;
    private int count;
    private ArrayList<String> wrong;

    public Holder() {
        this(0,0,new ArrayList<>());
    }


    public Holder(int total, int count, ArrayList<String> wrong) {
        this.total = total;
        this.count = count;
        this.wrong = wrong;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<String> getWrong() {
        return wrong;
    }

    @Override
    public String toString() {
        System.out.printf("%d %d %s",this.getTotal(),this.getCount(),this.getWrong());
        return super.toString();


    }
}
