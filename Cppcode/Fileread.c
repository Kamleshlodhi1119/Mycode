#include <stdio.h>

typedef struct {
    char name[50];
    int rollno;
    char branch[50];
    char papername[50];
    int papermarks;
} Student;

int main() {
    FILE *file;
    Student student;

    // Open the file in write mode
    file = fopen("student.txt", "w");

    if (file == NULL) {
        printf("Error opening the file.\n");
        return 1;
    }

    // Get student details
    printf("Enter student name: ");
    fgets(student.name, sizeof(student.name), stdin);

    printf("Enter roll number: ");
    scanf("%d", &student.rollno);

    printf("Enter branch: ");
    scanf("%s", student.branch);

    printf("Enter paper name: ");
    scanf("%s", student.papername);

    printf("Enter paper marks: ");
    scanf("%d", &student.papermarks);

    // Write student data to the file
    fprintf(file, "Student Name: %s", student.name);
    fprintf(file, "Roll Number: %d\n", student.rollno);
    fprintf(file, "Branch: %s\n", student.branch);
    fprintf(file, "Paper Name: %s\n", student.papername);
    fprintf(file, "Paper Marks: %d\n", student.papermarks);

    // Close the file
    fclose(file);

    printf("Student data has been written to student.txt.\n");

    return 0;
}