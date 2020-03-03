Using H2 database to test the project: localhost:8080/db

The program stores kids and one of their parent (or both) and when I search the name of the parent the program should display the name of kid (or kids).

Two interfaces needed:

- name of parents and kids (name of parent is unique, so in case if it already exists then we just insert the name of the kid (and its parent_id)
- when I search on the name of the parent the program displays his/her kid (or kids).

PARENTS table:
ID (PK, NN, AI, int)           
NAME (NN, String)    

KIDS table: 
ID (PK, NN, AI, int)           
NEV (NN, String)            
PARENTS_ID (NN, int)

The program should use an FK and OneToMany, ManyToOne connection which able to use search and save.
