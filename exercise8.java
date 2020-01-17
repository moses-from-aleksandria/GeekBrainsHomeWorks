public class exercise8 {
    public static String year(int x){
        if ((x%4 == 0 && x%100 != 0) || x%400 == 0) return "Високосный год";
        else return "Не високосный год";
    }
}
