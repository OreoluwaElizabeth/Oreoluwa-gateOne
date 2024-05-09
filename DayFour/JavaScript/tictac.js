const prompt = require('prompt-sync')();

console.log("Welcome to X and O game!!!");
console.log("Rules -> You are only allowed to write either X or O");

const name = prompt("Enter your name: ");

for (let counter = 0; counter < 9; counter++) {
    const input = prompt("Enter a letter either X or O: ");
    const choice = input.trim().toUpperCase();
    const validInput = choice === 'X' || choice === 'O';

    if (!validInput) {
        console.log("Invalid input. Please enter a letter either X or O.")
        continue;
    }

    let column;
    while (true) {
         const column = prompt("Which column do you want to place your letter (1-9): ");
         column = parseInt(column);
         if (column >= 1 && column <= 9) {
             break;
          }
         else {
           console.log("Invalid column. Please enter a number between 1 and 9");
         }
       }

 }

console.log("Game Over!!!");