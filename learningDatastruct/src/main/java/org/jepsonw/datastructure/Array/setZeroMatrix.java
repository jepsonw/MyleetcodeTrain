package org.jepsonw.datastructure.Array;

/**
 * 在距阵中，如果某个位置为0，则将其所在的行和列都置为0
 * Created by jepsonw on 16-12-15.
 */
public class setZeroMatrix {

    public static void zeroGood(int[][] matrix){
        boolean row[] =new boolean[matrix.length];
        boolean columns[]=new boolean[matrix[0].length];

        int i,j;
        //判断矩阵中是否存在0 ，将存在0的相应的列或行都设置为true
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    columns[j]=true;
                }
            }
        }

        //将矩阵中存在true的行和列都设置为0
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(row[i]||columns[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }

    /**
     * @param args
     *
     */
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},{2,3,4,5},{6,5,3,4},{8,6,9,0},{4,7,0,1}};

        //打印矩阵数组
        for(int i=0;i<matrix.length;i++){
            String matrixStr=" ";
            for(int j=0;j<matrix[j].length;j++){
                matrixStr+=matrix[i][j]+" ";
            }
            System.out.println(matrixStr);
        }

        //将矩阵数组里面为0的整个行和列设置为0
        System.out.println("set Zero ....");
        zeroGood(matrix);

        for(int i=0;i<matrix.length;i++){

            String matrixStr=" ";
            for(int j=0;j<matrix[i].length;j++){

                matrixStr+=matrix[i][j]+" ";
            }
            System.out.println(matrixStr);
        }
    }

}
