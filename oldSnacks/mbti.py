print("Welcome to the MBTI Personality Test!")

name = str(input("What is your name? "))

questions = [

    "Expend energy, enjoy groups (A) or conserve energy, enjoy one-on-one (B)?",
    "Interpret literally (A) or look for meaning and possibilities (B)?",
    "Logical, thinking, questioning (A) or empathetic, feeling, accommodating (B)?",
    "Organized, orderly (A) or flexible, adaptable (B)?",
    "More outgoing, think out loud (A) or more reserved, think to yourself (B)?",
    "Practical, realistic, experiential (A) or imaginative, innovative, theoretical (B)?",
    "Candid, straightforward, frank (A) or tactful, kind, encouraging (B)?",
    "Plan, schedule (A) or unplanned, spontaneous (B)?",
    "Seek many tasks, public activities, interaction with others (A) or seek private, solitary activities with quiet to concentrate (B)?",
    "Standard, usual, conventional (A) or different, novel, unique (B)?",
    "Firm, tend to criticize, hold the line (A) or gentle, tend to appreciate, conciliate (B)?",
    "Regulated, structured (A) or easy-going, live and let live (B)?",
    "External, communicative, express yourself (A) or internal, reticent, keep to yourself (B)?",
    "Focus on here-and-now (A) or look to the future, global perspective, big picture (B)?",
    "Tough-minded, just (A) or tender-hearted, merciful (B)?",
    "Preparation, plan ahead (A) or go with the flow, adapt as you go (B)?",
    "Active, initiate (A) or reflective, deliberate (B)?",
    "Facts, things, what is (A) or ideas, dreams, what could be, philosophical (B)?",
    "Matter of fact, issue-oriented (A) or sensitive, people-oriented, compassionate (B)?",
    "Control, govern (A) or latitude, freedom (B)?"
]

responses = []

for question in questions:
    response = input(question + " ")
    while response.upper() not in ['A', 'B']:
        print("Invalid input. Please enter A or B.")
        response = input(question + " ")
    responses.append(response.upper())

print("\nYour responses: ")

count_a = responses.count('A')
count_b = responses.count('B')

for i in range(len(questions)):
    print(questions[i])
    print(name    +    " selected: "   +   responses[i])

print("Number of A selected: " + str(count_a))
print("Number of B selected: " + str(count_b))

personality_traits = ""

if count_a > count_b:
    personality_traits += "I"
else:
    personality_traits += "E"

if responses[1] == "A":
    personality_traits += "S"
else:
    personality_traits += "N"

if count_a > count_b:
    personality_traits += "T"
else:
    personality_traits += "F"

if responses[3] == "A":
    personality_traits += "J"
else:
    personality_traits += "P"

print("Personality Trait: " + personality_traits)

if personality_traits == "INFP":
    print("\nThe thoughtful Idealist (MBTI)")
    print("The Mediator (16Personalities)")
    print("The INFP Personality Type")
    print("\nINFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.")
    print("INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.")

if personality_traits == "ISTJ":
    print("\nThe thoughtful Idealist (MBTI)")
    print("The Inspector (16Personalities)")
    print("The ISTJ Personality Type")
    print("\nISTJs are Introverted, Sensing, Thinking, Judging, Dependable, responsible, systematic, and detail-oriented. They prefer to work in structured environments and excel in following established procedures.")

if personality_traits == "ISFJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Protector (16Personalities)")
    print("The ISFJ Personality Type")
    println("\nISFJs are Introverted, Sensing, Feeling, Judging, Supportive, warm, and conscientious. They are committed to helping others and are highly organized, often taking on the role of caregivers in their communities.")
             
if personality_traits == "INFJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Advocate (16Personalities)")
    print("The INFJ Personality Type")
    print("\nINFJs are Introverted, Intuitive, Feeling, Judging, Insightful, empathetic, and idealistic. They are deeply committed to their values and strive to make a positive difference in the world, often working towards altruistic goals.")            


if personality_traits == "INTJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Architect (16Personalities)")
    print("The INTJ Personality Type")
    print("\nINTJs are Introverted, Intuitive, Thinking, Judging, Strategic, analytical, and independent. They excel in long-term planning and implementation, often pursuing innovative solutions to complex problems.")


if personality_traits == "ISTP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Virtuoso (16Personalities)")
    print("The ISTP Personality Type")
    print("\nISTPs are introverted, Sensing, Thinking, Perceiving, Practical, hands-on problem solvers who thrive in challenging situations. They enjoy exploring how things work and are skilled at troubleshooting and improvising.")
             

        
if personality_traits == "ISFP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Composer (16Personalities)")
    print("The ISFP Personality Type")
    print("\nISFPs are Introverted, Sensing, Feeling, Perceiving, Artistic, sensitive, and gentle. They have a deep appreciation for beauty and enjoy expressing themselves creatively through various forms of art and craftsmanship.")             


if personality_traits == "INTP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Logician (16Personalities)")
    print("The INTP Personality Type")
    print("\nINTPs are Introverted, Intuitive, Thinking, Perceiving, Analytical, curious, and innovative. They have a thirst for knowledge and enjoy exploring complex theories and ideas, often challenging conventional wisdom.")

        
if personality_traits == "ESTP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Entreprenur (16Personalities)")
    print("The ESTP Personality Type")
    print("\nESTPs are Extraverted, Sensing, Thinking, Perceiving, Energetic, resourceful, and action-oriented. They thrive in dynamic environments and are skilled at seizing opportunities and making quick decisions.")
             

        
if personality_traits == "ESFP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Entertainer (16Personalities)")
    print("The ESFP Personality Type")
    print("\nESFPs are Extraverted, Sensing, Feeling, Perceiving, Spontaneous, outgoing, and fun-loving. They enjoy being the center of attention and have a natural talent for entertaining and bringing joy to others.")            

if personality_traits == "ENFP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Campaigner (16Personalities)")
    print("The ENFP Personality Type")
    print("\nENFPs are Extraverted, Intuitive, Feeling, Perceiving, Enthusiastic, imaginative, and empathetic. They are passionate about exploring possibilities and connecting with others on a deep emotional level.")

if personality_traits == "ESTJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Executive (16Personalities)")
    print("The ESTJ Personality Type")
    print("\nESTJs are Extraverted, Sensing, Thinking, Judging, Efficient, organized, and responsible. They excel in leadership roles and thrive in environments that require clear structure and adherence to rules.")
             

        
if personality_traits == "ENTP":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Debater (16Personalities)")
    print("The ENTP Personality Type")
    print("\nENTPs are Extraverted, Intuitive, Thinking, Perceiving, Innovative, intellectually curious, and persuasive. They enjoy debating ideas and challenging the status quo, often generating new insights and solutions.")             

if personality_traits == "ESFJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Consul (16Personalities)")
    print("The ESFJ Personality Type")
    print("\nESFJs are Extraverted, Sensing, Feeling, Judging, Sociable, supportive, and nurturing. They are dedicated to maintaining harmony in their relationships and communities, often taking on the role of caretakers.")


if personality_traits == "ENFJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Protagonist (16Personalities)")
    print("The ENFJ Personality Type")
    print("\nENFJs are Extraverted, Intuitive, Feeling, Judging, Charismatic, empathetic, and inspiring. They are natural leaders who are passionate about motivating others and championing social causes.")
           
if personality_traits == "ENTJ":
    print("\nThe Thoughtful Idealist (MBTI)")
    print("The Commander (16Personalities)")
    print("The ENTJ Personality Type")
    print("\nENTJs areExtraverted, Intuitive, Thinking, Judging, Strategic, assertive, and visionary. They excel in leading teams and driving projects to success through their strong leadership and decision-making skills.")             
