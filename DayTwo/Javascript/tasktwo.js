const prompt = require("prompt-sync")();

let scores = 0;

for(let count = 0; count < 10; count++){

let score = prompt("Enter a score: ");

scores += score;

}

console.log(scores + " "); 

