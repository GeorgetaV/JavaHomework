import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(Activity::getPrice).thenComparing(Activity::getFinish).thenComparing(Activity::getStart));
        List<Activity> res = new ArrayList<>();
        print(list);

        System.out.println("--------------------");



        Activity last = list.get(list.size() - 1);
        int first = last.getStart(); // предыдущее свободное время
        res.add(last);


        for(int i = list.size() - 2; i > -1; i--) {
            if(list.get(i).getFinish() <= first) {
                first = list.get(i).getStart();
                res.add(list.get(i));
            }
        }
        res.sort(Comparator.comparingInt(Activity::getFinish));
        print(res);
    }

    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.getName() + "  " + e.getStart() + "->" + e.getFinish() + " - price: " + e.getPrice());
        }
    }
}