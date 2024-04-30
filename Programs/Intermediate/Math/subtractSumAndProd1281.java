public class subtractSumAndProd1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(1251));
    }
    public static int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n>0){
            int temp=n%10;
            p*=temp;
            s+=temp;
            n=n/10;
        }
        return p-s;
    }
}
