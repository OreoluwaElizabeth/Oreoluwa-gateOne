const prompt = require("prompt-sync")();

let scores = [];

for(let count = 0; count < 10; count++){

let score = prompt("Enter a score: ");

scores[count] = score;

}

console.log(scores); 


