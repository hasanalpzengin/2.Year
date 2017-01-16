/*
Hasan Alp Zengin
Wojownik Online Project

Ide : Code::Blocks
Platform : Linux, Windows
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

//character file
FILE *ch_file;
//call the move referance because we have to call move function on top of it.
void move();

//character struct /w linked list
typedef struct character{
        char name[16];
        int age;
        int char_class;
        char gender;
        int level;
        int exp;
        int heal;
        int strength;
        int sword;
        int shield;
        int location[2];
        struct character * next;
}character_t;


//save values to file;
void saveValues(character_t *ch){

    ch_file = fopen("character.dat","w");
        //save new values to file on every turn..
    fprintf(ch_file, "%d\n%d\n%s\n%c\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d",ch->location[0],ch->location[1],ch->name, ch->gender, ch->age, ch->char_class,ch->level,ch->exp,ch->heal,ch->strength,ch->sword,ch->shield);

    fclose(ch_file);

}
//get values from file;
struct character getValues(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    //getfile for check end of file
    int getfile = 0;

    ch_file = fopen("character.dat","r");
    //get all character values
    while(getfile!=12){
        switch(getfile){
            //just fscanfs to get value from file;
            case 0:{fscanf(ch_file,"%d",&(ch->location[0]));break;}
            case 1:{fscanf(ch_file,"%d",&(ch->location[1]));break;}
            case 2:{fscanf(ch_file,"%s",(ch->name));break;}
            case 3:{fscanf(ch_file," %c",&(ch->gender));break;}
            case 4:{fscanf(ch_file,"%d",&(ch->age));break;}
            case 5:{fscanf(ch_file,"%d",&(ch->char_class));break;}
            case 6:{fscanf(ch_file,"%d",&(ch->level));break;}
            case 7:{fscanf(ch_file,"%d",&(ch->exp));break;}
            case 8:{fscanf(ch_file,"%d",&(ch->heal));break;}
            case 9:{fscanf(ch_file,"%d",&(ch->strength));break;}
            case 10:{fscanf(ch_file,"%d",&(ch->sword));break;}
            case 11:{fscanf(ch_file,"%d",&(ch->shield));break;}
        }
        getfile++;
    }

    fclose(ch_file);

    return *ch;

}

int isDead(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();
    //if heal smaller than 0 it returns 1 and it means player has dead.
    if(ch->heal<=0){
        printf("RIP\nYou are dead.\nYou were a good hero. But you can't be immortal :(");
        remove("character.dat");
        return 1;
    }else{
        return 0;
    }
}

void isLoot(){
    int lootCheck;
    srand(time(NULL));
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    //lootCheck random;
    lootCheck = rand()%14;
    //check presents.
    //sword
    if(lootCheck==5){
        printf("You found a new weapon.. Sword = (%d)+1\n",ch->sword);
        ch->sword++;
        saveValues(ch);
    //youth potion
    }else if(lootCheck==4){
        printf("You found a youth potion.. Age = (%d)-1\n",ch->age);
        ch->age--;
        saveValues(ch);
    //heal potion
    }else if(lootCheck==3){
        printf("You found a heal potion.. Heal = (%d)+1\n",ch->heal);
        ch->heal++;
        saveValues(ch);
    }
    //strange potion
    else if(lootCheck==2){
        printf("You found a strange potion.. Age = (%d)+1\n",ch->age);
        ch->age++;
        saveValues(ch);
    //heal potion
    }else if(lootCheck==1){
        printf("You found a heal potion.. Heal = (%d)+1\n",ch->heal);
        ch->heal++;
        saveValues(ch);
    }else if(lootCheck==0){
        printf("You found a shield upgrade.. Shield = (%d)+1\n",ch->shield);
        ch->shield++;
        saveValues(ch);
    }
}
//this function starts after attack function and includes combat physics
int combat(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    int playerHeal = 5;
    int enemyHeal = 5;
    int playersAttack;
    int enemysAttack;
    char combatChoice;

    //player attack power equalisation
    playersAttack = ch->sword+ch->strength;
    //while heals greater then 0. Combat can't finish.
    while(playerHeal > 0 && enemyHeal > 0){
        printf("----\n");
        printf("Your Heal = (%d) | Enemy's Heal = (%d)\n",playerHeal,enemyHeal);
        printf("Attack -> A Escape -> E : ");
        scanf(" %c",&combatChoice);

        if(combatChoice == 'A' || combatChoice == 'a'){
            //random enemy attack power
            enemysAttack = (rand()%(playersAttack))+(playersAttack/2)-(ch->shield)+ch->level;
            //if enemy's attack point is greater than player's attack enemy will give damage;
            if(enemysAttack>playersAttack){
                printf("You got (%d) damage\n",enemysAttack-playersAttack);
                playerHeal = playerHeal-(enemysAttack-playersAttack);
            }
            //else player's attack point is greater than enemy's attack power, player will give damage;
            else if(enemysAttack<playersAttack){
                printf("Enemy got (%d) damage\n",playersAttack-enemysAttack);
                enemyHeal = enemyHeal-(playersAttack-enemysAttack);
            }
            //if attack power's equals no one gets damage;
            else{
                printf("Impressive same power. No damage for both side\n");
            }

        }else if(combatChoice == 'e' || combatChoice == 'E'){
            printf("You have escaped successfully but you loose some strenght (%d)-1\n",ch->strength);
            ch->strength--;
            saveValues(ch);
            // if escape break the while loop
            break;
        }else{
            printf("Undefined Choice!\n");
        }

    }

    if(playerHeal > 0 && enemyHeal > 0){
        //1 means escape
        return 1;
    }else if(playerHeal <= 0){
        //2 means player lose
        return 2;
    }else{
        //0 means player won
        return 0;
    }

}

void attack(){
    int isdead_bool;
    int combat_score;
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    combat_score = combat();

    if(combat_score == 2){
        printf("Enemy hurted you. Heal Point (%d)-1\n",ch->heal);
        ch->heal--;
        saveValues(ch);
        isdead_bool = isDead();
        if(isdead_bool == 1){
            system("exit");
        }else{
            move();
        }
    }else if(combat_score == 0){
        printf("You beat the enemy. Gained some exp (%d)+10\n",ch->exp);
        //exp up
        ch->exp = ch->exp+10;
        saveValues(ch);
        // level up check
        if(ch->exp==100){
            printf("!! Level Up !!\nHeal = (%d)+1, Strength = (%d)+1\n",ch->heal,ch->strength);
            ch->level++;
            ch->heal++;
            ch->strength++;
            ch->exp = 0;
            saveValues(ch);
            isLoot();
        }
        move();

    }else{
        //escape result
        move();
    }
}

void run(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    //check character's age to check escapability.
    if(ch->age<40){
        printf("----\n");
        printf("You escaped successfully. But you get old.\n");
        ch->age++;
        saveValues(ch);
        printf("Your new age is %d\n",ch->age);
        move();
    }else{
        printf("You can't escape because you are too old to escape !\n");
        attack();
    }

}

void isAttack(){
    int percent;
    char choice;

    srand(time(NULL));
    //random attack percent
    percent = rand()%100+1;
    //if attack percent bigger than 50 make attack
    if(percent>50){
        printf("----\n");
        printf("!! You got attack !!\n");
        printf("What do you want to do now ?\n");
        printf("Run -> R Attack -> A : ");
        scanf(" %c",&choice);

        switch(choice){
            case 'A':attack();break;
            case 'a':attack();break;
            case 'R':run();break;
            case 'r':run();break;
            default:printf("Instability is biggest mistake !\n");attack();break;
        }

    }else{
        isLoot();
        move();
    }

}

void move(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    char move_c = 's';

        printf("Your Turn : ");
        scanf(" %c",&move_c);
        printf("----\n");
        switch(move_c){

        case '0':{
            system("exit");
            break;
        }
        case '2':{
            ch->location[1]++;
            printf("Down %dx%d\n",ch->location[0],ch->location[1]);
            saveValues(ch);
            isAttack();
            break;
        }
        case '4':{
            ch->location[0]--;
            printf("Left %dx%d\n",ch->location[0],ch->location[1]);
            saveValues(ch);
            isAttack();
            break;
        }
        case '8':{
            ch->location[1]--;
            printf("Up %dx%d\n",ch->location[0],ch->location[1]);
            saveValues(ch);
            isAttack();
            break;
        }
        case '6':{
            ch->location[0]++;
            printf("Right %dx%d\n",ch->location[0],ch->location[1]);
            saveValues(ch);
            isAttack();
            break;
        }
        default:{
            printf("Undefined Key\n");
            move();
            break;
        }
    }
}

void startGame(){

    //windows and linux clean terminal commands
    system("clear");
    system("cls");

    printf("Press 0 to exit..\n");
    printf("You can control your character with numlock keys. (2-4-6-8) \n");
    printf("Have fun :)\n");

    move();

}

void createCharacter(){
    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));

    //windows and linux clean terminal commands
    system("clear");
    system("cls");
    //create character menu
    printf("Welcome to Wojownik Online\n");
    printf("Create a Character\n");
    printf("Enter a Character Name : ");
    scanf("%s",(ch->name));
    printf("Enter a gender (Male-> M Female-> F) : ");
    scanf(" %c",&(ch->gender));
    printf("1. Warrior\n");
    printf("2. Mage\n");
    printf("3. Archer\n");
    printf("Select your character's class : ");
    scanf("%d",&(ch->char_class));
    //standart values at creating char
    ch->level = 0;
    ch->exp = 0;
    ch->location[0] = 100;
    ch->location[1] = 100;
    ch->age = 15;
    ch->shield = 0;
    //this values change with character's class
    switch(ch->char_class){
        case 1:{
            ch->sword = 2;
            ch->strength = 2;
            ch->heal = 5;
            break;
        }
        case 2:{
            ch->sword = 1;
            ch->strength = 1;
            ch->heal = 8;
            break;
        }
        case 3:{
            ch->sword = 1;
            ch->strength = 2;
            ch->heal = 6;
            break;
        }
        default:{
            printf("Wrong class number...");
            createCharacter();
        }
    }

    saveValues(ch);

    startGame();

}

void openCharacter(){
    //clean terminal
    system("clear");
    system("cls");

    //linked list pointer define
    character_t * ch = NULL;
    ch = malloc(sizeof(character_t));
    *ch = getValues();

    int boolean;
    char name[16];

    printf("1-> Open Character 0-> Create new character\n");
    printf("Select an menu item : ");
    scanf("%d",&boolean);
    //if user selects open character
    if(boolean == 1){
        printf("Enter your character's name : ");
        scanf("%s",name);
        if(strcmp(name,ch->name)==0){
            startGame(name);
        }
        else{
            printf("Wrong character name !!\n");
            openCharacter();
        }

    }else if(boolean == 0){
        createCharacter();
    }else{
        printf("Wrong chooice !");
        openCharacter();
    }

}


int main(){
    //open file for check is it exist
    ch_file = fopen("character.dat","r");
    //if character file doesnt exist, else file exist
    if(ch_file == NULL){
        createCharacter();
    }else{
        openCharacter();
    }

    return 0;
}
