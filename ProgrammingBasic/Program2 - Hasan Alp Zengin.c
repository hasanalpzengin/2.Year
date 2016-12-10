/*
Created By Hasan Alp ZENGIN
IDE : Code::Blocks
Platform : Linux
*/


#include <stdio.h>
#include <stdlib.h>
//keepProgram defination for program2() function
void keepProgram();

//program2 is main algorithm;
void program2(){

	system("cls");
	system("clear");

	int day;

	printf("Please Enter a Number of Day : ");
	scanf("%d",&day);

	switch(day){
		case 1:printf("%d -> Monday ",day);keepProgram();break;
		case 2:printf("%d -> Tuesday ",day);keepProgram();break;
		case 3:printf("%d -> Wednesday ",day);keepProgram();break;
		case 4:printf("%d -> Thursday ",day);keepProgram();break;
		case 5:printf("%d -> Friday ",day);keepProgram();break;
		case 6:printf("%d -> Saturday ",day);keepProgram();break;
		case 7:printf("%d -> Sunday ",day);keepProgram();break;
		default:printf("It's a wrong number please enter again !! \n");program2();break;
	}

}
//this function created for ask exit
void keepProgram(){

	char choice;

	printf("Do you want to enter new number ? Yes(Y),No(N) : ");
	scanf(" %c",&choice);

	switch(choice){
		case 'Y':program2();break;
		case 'N':system("exit");break;
		case 'y':program2();break;
		case 'n':system("exit");break;
		default:printf("Undefined Choice !!\n");keepProgram();
	}
}

//press to start
int main(){

	printf("********************\n");
	printf("Welcome to Program 2\n");
	printf("********************\n");
	printf("Press any key to start program : ");

	getchar();

	program2();

	return 0;

}
