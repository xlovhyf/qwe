package PK;


import java.util.ArrayList;

public interface IParams {
    int big = 0;
    int medium=0;
    int small=0;
    ArrayList<Integer>PlanParking=new ArrayList<>();

    public void set(int big,int medium,int small);
    public int getBig();

    public int getMedium();

    public int getSmall();
  
    public ArrayList<Integer> getPlanParking();
    public void add(int i);
}