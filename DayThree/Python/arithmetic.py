import random

def arithmetic_question():
	name = input("Welcome to Arithmetic questions! Enter your name: ")
	number_questions = 10
	score = 0

	for counter in range(number_questions):
		number1 = random.randint(1, 10)
		number2 = random.randint(1, 10)

		operator_index = random.randint(0, 2)
		operator = "+"
		result = 0

		if operator_index == 0:
                  	operator = "+"
                  	result = number1 + number2
 		elif operator_index == 1:
     			operator = "-"
                  	result = number1 - number2
 		else:
                  	operator = "*"
                  	result = number1 * number2

     		answer = int(input(f"Question {counter + 1}: {number1} {operator} {number2} = ? "))

    		if answer == result:
            		print(f"Congratulations, {name}! You are right :)")
          		score += 1
         	else:
                  	print(f"Oops, try again, {name}. The correct answer is {result}.")

        	print("==============================")
    		print(f"Final score: {score} out of {num_questions}")