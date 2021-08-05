package DesignPattern.Strategy;

public class Sort implements ISort {
    private ISort sort;

    public Sort(SortStrategy sortStrategy){
        setStrategy(sortStrategy);
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    public void setStrategy(SortStrategy sortStrategy){
        switch (sortStrategy){
            case BubbleSort:
                sort = new BubbleSort();
                break;
            case InsertSort:
                sort = new InsertSort();
                break;
            case SelectSort:
                sort = new SelectSort();
                break;
            default:
                System.out.println("没有这个策略");
        }
    }
}
