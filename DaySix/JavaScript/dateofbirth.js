function calculateAge(dateOfBirth) {
    const parts = dateOfBirth.spilt("/");
    const birthyear = parseInt(parts[2]);
    const currentYear = new Date().getFullYear();
    return currentYear - birthyear;
}

console.log("Welcome to your age reveal");
console.log("Kindly enter your date of birth in this format.....D/M/Y");

const name = prompt("Enter your name: ");
const dateOfBirth = prompt("Enter your date of birth: ");
const age = calculateAge(dateOfBirth);

console.log(`${name}, you are ${age} years old`)'