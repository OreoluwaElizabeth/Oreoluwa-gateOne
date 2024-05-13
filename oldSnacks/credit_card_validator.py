card_number = input("Enter your credit card number: ")

if card_number.startswith("4"):
	card_type = "Visa"
elif card_number.startswith("5"):
	card_type = "MasterCard"
elif card_number.startswith("37"):
	card_type = "American Express"
elif card_number.startswith("6"):
	card_type = "Discover"
else:
	card_type = "Invalid Card Type"

sum = 0
is_even = False
for i in range(len (card_number) -1, -1, -1):
	char = card_number[i]
	if char.isdigit():
		digit = int(char)
		if is_even:
			digit *= 2
			digit = digit % 10 + digit // 10 if digit >= 10 else digit
		sum += digit
		is_even = not is_even


if card_type == "Invalid Card Type":
	print(f"Invalid Card Type: {card_number}")
elif sum % 10 == 0:
	print(f"{card_type} card - Valid: {card_number}")
else:
	print(f"{card_type} card_Invalid: {card_number}")