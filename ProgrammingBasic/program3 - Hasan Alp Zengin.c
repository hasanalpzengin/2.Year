/*
Created By Hasan Alp ZENGIN
IDE : Code::Blocks
Platform : Linux
*/

#include <stdio.h>
#include <stdlib.h>
//define menu function for keepgoing()
void menu();
    //keep in program function
void keepgoing(){

    int choice;

    printf("\n\nWhat do you wanna do now ?\n");
    printf("1. Turn to main menu\n");
    printf("2. Exit from program\n");
    printf("Please make your choice : ");

    scanf("%d",&choice);

    switch(choice){
        case 1:menu();break;
        case 2:system("exit");break;
    }
}
    //sum of divisible by 3 numbers
int sumdiv_three(int min_all, int max_all){

    int sum=0,x;

    for(x=min_all;x<=max_all;x++){

        if(x%3 == 0 && x != 0){
            sum += x;
        }

    }

    return sum;
}
    //sum of even numbers
int sumeven(int min_all, int max_all){

    int sum=0,x;

    for(x = min_all;x <= max_all;x++){

        if(x%2==0){
            sum += x;
        }

    }

    return sum;
}
    //sum of all numbers
int sumall(int min_all, int max_all){

    int sum=0,x;

    for(x = min_all;x <= max_all;x++){

        sum += x;

    }

    return sum;
}

    //menu function
void menu(){

    system("cls");
    system("clear");

    int max,min;
    int item;

    printf("Please enter a min value to range : ");
    scanf("%d",&min);

    printf("Please enter a max value to range : ");
    scanf("%d",&max);

    system("cls");
    system("clear");

    printf("---- Program 3 ----\n");
    printf("-Your range is %d to %d\n",min,max);
    printf("- 1. Sum of all numbers\n");
    printf("- 2. Sum of even numbers\n");
    printf("- 3. Sum of divisible by 3 numbers\n");
    printf("- 4. EXIT\n");

    printf("Please select an menu item : ");
    scanf("%d",&item);

    switch(item){

        case 1:{
            int sum = sumall(min, max);
            printf("Sum of all numbers on this range = %d",sum);
            keepgoing();
            break;
        }

        case 2:{
            int sum = sumeven(min, max);
            printf("Sum of all even numbers on this range = %d",sum);
            keepgoing();
            break;
        }

        case 3:{
            int sum = sumdiv_three(min, max);
            printf("Sum of all numbers divisible by 3 on this range = %d",sum);
            keepgoing();
            break;
        }

    }

}

int main(){
    //call menu
    menu();
    //test invocation
    sumdiv_three(0,0);
    sumeven(0,0);
    sumall(0,0);

    return 0;
}
