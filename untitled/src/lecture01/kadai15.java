package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};

        for(int i=0;i<score.length;i++){
            if(score[i]<60){
                    System.out.println(i+"番 "+score[i]+"点　不可");
            }else if(score[i]<70){
                System.out.println(i+"番 "+score[i]+"点　可");
            }else if(score[i]<80){
                System.out.println(i+"番 "+score[i]+"点　良");
            }else if(score[i]<90){
                System.out.println(i+"番 "+score[i]+"点　優");
            }else{
                System.out.println(i+"番 "+score[i]+"点　秀");
            }
        }


        int mini=min(score);
        int maxi=max(score);
        double ave=average(score);
        System.out.println("最低点"+mini);
        System.out.println("最高点"+maxi);
        System.out.println("平均点"+ave);
    }
    static int min(int[] score){
       int mini= score[0];
       for(int i=0;i<score.length;i++){
           if(mini>score[i]){
               mini=score[i];
           }
       }
       return mini;
    }

    static int max(int[] score){
        int maxi= score[0];
        for(int i=0;i<score.length;i++){
            if(maxi<score[i]){
                maxi=score[i];
            }
        }
        return maxi;
    }

    static double average(int[] score){
        int sum= 0;
        for(int i=0;i<score.length;i++){
           sum=sum+score[i];
        }
        return (double)sum/score.length;
    }
}
