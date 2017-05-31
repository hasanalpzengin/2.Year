/*
Created By Hasan Alp ZENGIN
IDE : Code::Blocks
Platform : Linux
*/

#include <stdio.h>
#include <stdlib.h>
//program 1 algorithm starts
void program1(){

	int i;
    char exit;
    //for windows
	system("cls");
	//for linux
	system("clear");

	//program's main for
    for(i=1;i<=100;i++){
		//if i%3 and i%5 equals 0
        if(i%3==0 && i%5==0){
			printf("FooBar ");
		}
		else if(i%3==0){
			printf("Foo ");
		}
		else if(i%5==0){
			printf("Bar ");
		}
		else{
			printf("%d ",i);
		}

    }
    //exit check system
    printf("\nPress X to exit : \n");

    fflush(stdin);
    scanf(" %c",&exit);

    if(exit == 'x' || exit == 'X'){
		system("exit");
	}
	else{
		printf("You pressed a wrong number !!");
		program1();
	}

}
//press to start main()
int main(){

	printf("********************\n");
	printf("Welcome to Program 1\n");
	printf("********************\n");
	printf("Press any key to start program : ");

	getchar();

	program1();

	return 0;

}
