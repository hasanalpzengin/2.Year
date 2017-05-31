/*
Created By Hasan Alp ZENGIN
IDE : Code::Blocks
Platform : Linux
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//define main for keepgoing function.
int main();
//this function for return column
int setcolumn(){
    int column;
    printf("Please enter a column number : ");
    scanf("%d",&column);

    return column;
}
//keep going function
void keepgoing(){

    int choice;

    printf("\n\nWhat do you wanna do now ?\n");
    printf("1. Main menu\n");
    printf("2. Exit\n");

    printf("Please select an item : ");
    scanf("%d",&choice);

    switch(choice){
        case 1:main();break;
        case 2:system("exit");break;
    }
}
//calculate column sum function
float avg_3(int n,int m, float t1[n][m],int column){

    int count,y=0,sum=0;

    count = m;
        //all column
        for(y=0;y<m;y++){
            sum += t1[column][y];
        }

    return ((float)sum/count);
}
//sum of main diagonal
float avg_2(int n,int m, float t1[n][m]){

    int count=0,x=0,y=0,sum=0;


    //diagonal way
    while(x<n && y<m){

            sum += t1[x][y];
            count++;
            x++;
            y++;
    }

    return ((float)sum/count);
}
//sum of all
float avg_1(int n,int m, float t1[n][m]){

    int count,x,y,sum=0;

    count = n*m;

    for(x=0;x<n;x++){
        for(y=0;y<m;y++){
            sum += t1[x][y];
        }
    }

    return ((float)sum/count);
}

int main(){
    //clear screen
    system("clear");
    system("cls");
    //array assignment starts
    int x,y,choice,ch_array,column;

    srand(time(NULL));

    printf("Please enter a column number to float array : ");
    scanf("%d",&x);

    printf("Please enter a row number to float array : ");
    scanf("%d",&y);

    float t1[x][y];
    //random or manual select start
    printf("1. Random array\n2. Manual array\nPlease select an item : ");
    scanf("%d",&ch_array);

    switch(ch_array){

        case 1:{
            for(int n = 0;n<x;n++){
                for(int m = 0;m<y;m++){
                    //random t1
                    t1[n][m] = rand()%101;
                }
            }

            break;
        }

        case 2:{
            for(int n = 0;n<x;n++){
                for(int m = 0;m<y;m++){
                    //manuel assignment
                    printf("t1[%d][%d] = ",n,m);
                    scanf("%f",&t1[n][m]);
                }
            }

            break;
        }

    }
    //random or manual select end
    system("clear");
    system("cls");

    //menu starts

    printf("*** Program 4 ***\n");
    printf("* 1. Average of all array\n");
    printf("* 2. Average of main diagonal\n");
    printf("* 3. Average of given column\n");

    printf("Please select a menu item : ");
    scanf("%d",&choice);

    switch(choice){

        case 1:{
            printf("Avarage is = %f",avg_1(x,y,t1));
            keepgoing();
            break;
        }

        case 2:{
            printf("Avarage is = %f",avg_2(x,y,t1));
            keepgoing();
            break;
        }

        case 3:{
            printf("Avarage is = %f",avg_3(x,y,t1,setcolumn()));
            keepgoing();
            break;
        }


    }

    return 0;

}
