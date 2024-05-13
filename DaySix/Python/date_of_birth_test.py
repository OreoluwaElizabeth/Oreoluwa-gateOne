from date_of_birth import calculate_age
from datetime import datetime

def test_calculate_age():
	current_year = datetime.today()
	assert calculate_age("22/11/2001", current_year) == 23