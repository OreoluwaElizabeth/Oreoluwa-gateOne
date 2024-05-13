number_of_students = int(input("How many students do you have? "))

number_of_subjects = int(input("How many subjects do they offer? "))

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>")

print("Saved sucessfully")

scores = [[0 for _ in range(number_of_subjects)] for _ in range(number_of_students)]

for counter in range(number_of_students):
	total_score = 0
	for count in range(number_of_subjects):
		while True:
			print(f"Entering score for student {counter+1}:")
			print(f"Enter score for subject {count+1}:")

			score = int(input())
			if 0 <= score <= 100:
				scores[counter][count] = score
				total_score += score
				break
			else:
				print("Invalid score. Please enter a value between 0 and 100.")

print("=============================================================")
print("STUDENT\t", end="")
for counter in range(number_of_subjects):
	print(f"\tSUB{counter+1:4}", end="")
print("\tTOT\tAVE\tPOS")
print("=============================================================")


for loop in range(number_of_students):
	total_score = 0
	average = 0.0

	print(f"STUDENT{loop+1}", end="")
	for looping in scores[loop]:
		print(f"\t{looping}", end="")
		total_score += looping

	average = total_score / number_of_subjects
	print(f"  {total_score:.2f}  {average:.2f}", end="")

	current_position = 1
	for continuation in range(number_of_students):
		if sum(scores[continuation]) > total_score:
			current_position += 1
	print(f"\t{current_position}")

print("================================================================")
subject_positions = [1] * number_of_subjects

for looped in range(number_of_subjects):
	passes = 0
	fails = 0
	for loops in range(number_of_students):
		if scores[loops][looped] >= 50:
			passes += 1
		else:
			fails += 1

	print(f"\nSubject {looped+1} Summary:")
	print(f"Number of Passes: {passes}")
	print(f"Number of Fails: {fails}")

print("\n================================================================\n")
