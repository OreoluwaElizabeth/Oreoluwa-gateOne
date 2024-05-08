let numbers = [12, 45, 13, 26, 80, 14]

function arrayEven(array){

let result = [];

for(let count = 0; count < array.length; count++) 

if(count % 2 == 0) {

result.push(array[count]);
        }
    return result;
     }

console.log(arrayEven(numbers));