from datetime import datetime, timedelta

print("Hi sweethearts:), Welcome to Menstrual App")

name = input("kindly enter your name: ")

length = int(input("Kindly enter your average cycle length: "))

last_period_date = input("Kindly enter the start date of your last period in this format (MM/dd/yyyy): ")
last_period_dates = datetime.strptime(last_period_date, "%m/%d/%Y")

present_date = datetime.now()

average_cycle_length = length

next_period_date = last_period_dates + timedelta(days=average_cycle_length)

ovulation_date = next_period_date - timedelta(days=14)

safe_period_start = ovulation_date + timedelta(days=1)

safe_period_end = next_period_date - timedelta(days=1)

fertile_window_start = last_period_dates + timedelta(days=10)

fertile_window_end = ovulation_date

print(f"{name} your next period date is:", next_period_date.strftime("%m/%d/%Y"))

print(f"{name} your ovulation date is:", ovulation_date.strftime("%m/%d/%Y"))

print(f"{name} your safe period is from:", safe_period_start.strftime("%m/%d/%Y"), "to", safe_period_end.strftime("%m/%d/%Y"))

print(f"{name} you are most likely to get pregnant within this duration:", fertile_window_start.strftime("%m/%d/%Y"), "to", fertile_window_end.strftime("%m/%d/%Y"))