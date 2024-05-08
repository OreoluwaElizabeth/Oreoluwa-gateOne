const randomNumber = Math.random();
console.log(randomNumber);

   const name = prompt("Welcome to Arithmetic question! Enter your name: ");

   const = prompt("You have 10 minutes!! to answer these questions!....GOODLUCK!!!");

   const numberOfQuestions = 10;
   let score = 0;

   for (let counter = 0; counter < numberOfQuestions; counter++) {
        const number1 = randomNumberInt(1, 10);
        const number2 = randomNumberInt(1, 10);

        const operatorIndex = Math.random(3);
        let operator = '+';
        let result = 0;

            if (operatorIndex == 0) {
                operator = '+';
                result = number1 + number2;
             }
            else if (operatorIndex == 1) {
                 operator = '-';
                 result = number1 - number2;
              }
            else if (operatorIndex == 2) {
                 operator = '*';
                 result = number1 * number2;
              }
            else {
               console.log("Invalid");
              } 

        const answer = ("Question %d: %d %c %d = ?\n", counter + 1, number1, operator, number2);

        if (answer === result) {
           console.log("Congratulations, " + name + "! You are correct. :) ");
           score++;
         }
        else {
            console.log("You are wrong, " +  name  + " Try again");
          }
        
     }


console.log("==============================");
console.log("Final score is: " + score); 
  

  }

}