#include <stdio.h>
#include <string.h>
#include <stdlib.h>

const char* units[] = {
    "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
    "eighteen", "nineteen"
};

const char* tens[] = {
    "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
};

char* convertNumberToWords(int number) {
    if (number < 0 || number > 999) {
        printf("Number should be between 0 and 999\n");
        return "";
    }

    if (number == 0) {
        return strdup("zero");
    }

    if (number < 20) {
        return strdup(units[number]);
    }

    int hundreds = number / 100;
    int tensDigit = (number % 100) / 10;
    int unitsDigit = number % 10;

    char* wordBuilder = (char*)malloc(100 * sizeof(char));
    strcpy(wordBuilder, "");

    if (hundreds > 0) {
        sprintf(wordBuilder, "%s hundred ", units[hundreds]);
    }

    if (tensDigit > 1) {
        sprintf(wordBuilder + strlen(wordBuilder), "%s ", tens[tensDigit]);
    }

    if (unitsDigit > 0) {
        sprintf(wordBuilder + strlen(wordBuilder), "%s", units[unitsDigit]);
    }

    return wordBuilder;
}

int main() {