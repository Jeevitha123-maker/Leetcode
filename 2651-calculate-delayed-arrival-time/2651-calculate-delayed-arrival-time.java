class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       int tot=arrivalTime+delayedTime;
       if(tot==24){
        return 0;
       }else if(tot<24){
        return tot;
       }else{
        return tot-24;
       }
       
        }
    }