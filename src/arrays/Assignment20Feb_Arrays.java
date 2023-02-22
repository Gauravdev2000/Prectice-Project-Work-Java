package arrays;

public class Assignment20Feb_Arrays {
    public static void main(String[] args){
        String brands [] = {"Iphone", "Samsung", "One Plus", "Oppo","Vivo", "Sony", "Motorola", "Asus"};
        System.out.println(brands[0]);
        for(int i=0; i<brands.length; i++){
            System.out.println("All Mobile Brands : "+brands[i]);

        }
        int j= 0;
        while(j<brands.length){
            System.out.println("All Mobile Brands : "+brands[j]);
            j++;
        }
        for(String var : brands){
            System.out.println("India All Brands : "+var);
        }
        int ages [] = {30, 28, 25, 23, 18, 14, 11, 9, 5};
        for(int k= 0; k<ages.length; k++){
            System.out.println("All Person's Age : "+ages[k]);
        }
        for(int var : ages){
            System.out.println("Printing All Ages : "+var);
        }
        double salaries [] = {25000.543, 18000.546, 15000.564, 12000.536, 10000.589, 8000.647};
        for(double var : salaries){
            System.out.println("All Person Salaries : "+var);
        }



    }
}
