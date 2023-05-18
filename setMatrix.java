public class setMatrix {
    static void markRow(int i,int m,int a[][]){
        for(int j=0;j<m;j++){
            if(a[i][j]!=0)
            a[i][j]=-1;
            
        }
    }
    static void markCol(int j,int n,int a[][]){ 
        for(int i=0;i<n;i++){
        if(a[i][j]!=0)
        a[i][j]=-1;
        
        }
    }

    
    public static void main(String[] args) {
        int n=3, m=3;
        int i,j;
        int[][] a={{1,0,1},{0,1,1},{1,1,0}};
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(a[i][j]==0){
                    markRow(i,m,a);
                    markCol(j,n,a);
                }
            }
        }
        System.out.println("new matrix");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(a[i][j]==-1){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]);
    }
    System.out.println();
}
    
}
}