class BMI{
public static void main(String args[]){
double height=150;
double weight=60;
double bmi=(weight/(height*height))*10000;
System.out.println("BMI is "+bmi);
/*
below 18.5---you are under weight range
below 18.5 and 24.9---you are in healthy weight range
below 25 and 29.9 ------ you are in the overweight range
below 30 and 39.9-- you are in the obese range
*/
if(bmi<18.5){
System.out.println("you are under weight range");
}
else if(bmi>18.5 && bmi<24.9){
System.out.println("you are healthy weight range");
}
else if(bmi>25 && bmi<29.9){
System.out.println("you are over weight range");
}
else if(bmi>30 && bmi<39.9){
System.out.println("you are obese range");
}
else
{
System.out.println("more than obeses");
}
}
}
