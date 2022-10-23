 class fiboniccess {
public static void main(String[] args) {
    
int f = 0; 
int s = 1;
int next;

System.out.print(f+" "+s);
for (int i = 1; i <=10; i++) {
    
    next = f+s;//0+1=1<--next//1=0+1=1//1+1=2//1+2=3  
    f=s;//0//1//1//2
    s=next;//1//1//2//3
    System.out.print(" "+next);
}

}    
}
