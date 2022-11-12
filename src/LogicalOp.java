public class LogicalOp {

    //1

    public void Ex1(int number) {
        int i=number;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=100);
    }

    //2

    public void Ex2(int number){
        int i=number;
        do{
            System.out.println(i);
            i--;
        }
        while(i>=-100);
    }

    //3

public void Ex3(int x, int y) {
    while(x<=y) {
        System.out.println(x);
        x++;
    }
}

    //4

public void Ex4(int x, int y){
        while(x>y){
            System.out.println(y);
            y++;
        }
        while(y>=x){
            System.out.println(x);
            x++;
        }
}

    //5

public void Ex5(){
        int i=2;
        while(i<=100){
            System.out.println(i);
            i=i+2;
        }
}
    //6

    public void Ex6(){
        int i=1;
        while(i<=100){
            System.out.println(i);
            i=i+2;
        }
    }

    //7

    public float Ex7(int x,int y){
        float sum=0;
        int count=0;
        while(x<=y){
            count++;
            sum=sum+x;
            x++;
        }
        System.out.println(sum);
        return sum/count;
    }

    //8

    public float Ex8(int x, int y){
        float sum=0;
        int count=0;
        while(x<=y){
            count++;
            sum=sum+x;
            x +=7;
        }
        return sum/count;
    }

    //9

    public void Ex9(){
        int i=1,n=20,x=0,y=1;
        while(i<=n){
            System.out.println(x);
            int nextSequence = x+y;
            x=y;
            y=nextSequence;
            i++;
        }
    }
}
