static int LeapYear(int year){
//enter your code here
    if(year%400==0){
        return 1;
    } else if(year%100==0){
        return 0;
    } else if(year%4==0){
        return 1;
    } else{
        return 0;
    }
}
