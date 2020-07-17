static int  MaxInteger(int a ,int b, int c){
//Enter your code here
    if(a>=b && a>=c) return a;
    if(b>=a && b>=c) return b;
    if(c>=a && c>=b) return c;
    
    return -1;
}
