void main() {
    int n = 123;
    int m = n;
    int sum = 0;
    int prod = 1;
    while(n != 0){
        int d = n%10;
        sum = sum+d;
        prod = prod *d;
        n=n/10;
    }
    if(sum == prod)
        System.out.println("Yes, it is a spy number");
    else
        System.out.println("no");

}
