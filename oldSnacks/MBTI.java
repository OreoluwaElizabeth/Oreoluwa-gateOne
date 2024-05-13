import java.util.Scanner;

public class MBTI {

 public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the MBTI Personality Test!");

       System.out.println("What is your name? ");
       String name = scanner.nextLine();

       String [] questions = {
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

              };

       String [] responses = new String[20];

       for (int i = 0; i < 20; i++) {
           System.out.print(questions[i] + " ");
           String response = scanner.nextLine();
           while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
           System.out.println("Invalid input. Please enter A or B.");
           System.out.print(questions[i] + " ");
           response = scanner.nextLine();
         }
         responses[i] = response.toUpperCase();
        
      }
  

       System.out.println("\nYour responses: ");
       int countA = 0;
       int countB = 0;

       for (int i = 0; i < questions.length; i++) {
           System.out.println(questions[i]);
           System.out.println("You selected: " + responses[i]);
           if (responses[i].equalsIgnoreCase("A")) {
               countA++;
            }
           else if (responses[i].equalsIgnoreCase("B")) {
               countB++;
           }
           else {
               System.out.println("Invalid response: " + responses[i]);
             }

           }

      System.out.println("Number of A selected: " + countA);
      System.out.println("Number of B selected: " + countB);

      String personalityTraits = "";
      if (countA > countB) {
          personalityTraits += "I";
      } else {
          personalityTraits += "E";
      }
      
      if (responses[1].equalsIgnoreCase("A")) {
          personalityTraits += "S";
      } else {
          personalityTraits += "N";
      }

      if (countA > countB) {
          personalityTraits += "T";
      } else {
          personalityTraits += "F";
      }

      if (responses[3].equalsIgnoreCase("A")) {
          personalityTraits += "J";
      } else {
          personalityTraits += "P"; 
      }

      System.out.println("Personality Trait: " + personalityTraits);

      if (personalityTraits.equalsIgnoreCase("INFP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Mediator (16Personalities)");
          System.out.println("The INFP Personality Type");
          System.out.println("\nINFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.");
          System.out.println("INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.");

        }

      if (personalityTraits.equalsIgnoreCase("ISTJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Inspector (16Personalities)");
          System.out.println("The ISTJ Personality Type");
          System.out.println("\nISTJs are Introverted, Sensing, Thinking, Judging, Dependable, responsible, systematic, and detail-oriented. They prefer to work in structured environments and excel in following established procedures.");

        }

      if (personalityTraits.equalsIgnoreCase("ISFJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Protector (16Personalities)");
          System.out.println("The ISFJ Personality Type");
          System.out.println("\nISFJs are Introverted, Sensing, Feeling, Judging,Supportive, warm, and conscientious. They are committed to helping others and are highly organized, often taking on the role of caregivers in their communities.");
             }

        
      if (personalityTraits.equalsIgnoreCase("INFJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Advocate (16Personalities)");
          System.out.println("The INFJ Personality Type");
          System.out.println("\nINFJs are Introverted, Intuitive, Feeling, Judging, Insightful, empathetic, and idealistic. They are deeply committed to their values and strive to make a positive difference in the world, often working towards altruistic goals.");             

          }

        if (personalityTraits.equalsIgnoreCase("INTJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Architect (16Personalities)");
          System.out.println("The INTJ Personality Type");
          System.out.println("\nINTJs are Introverted, Intuitive, Thinking, Judging,Strategic, analytical, and independent. They excel in long-term planning and implementation, often pursuing innovative solutions to complex problems.");

        }

      if (personalityTraits.equalsIgnoreCase("ISTP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Virtuoso (16Personalities)");
          System.out.println("The ISTP Personality Type");
          System.out.println("\nISTPs are ntroverted, Sensing, Thinking, Perceiving,Practical, hands-on problem solvers who thrive in challenging situations. They enjoy exploring how things work and are skilled at troubleshooting and improvising.");
             }

        
      if (personalityTraits.equalsIgnoreCase("ISFP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Composer (16Personalities)");
          System.out.println("The ISFP Personality Type");
          System.out.println("\nISFPs are Introverted, Sensing, Feeling, Perceiving,Artistic, sensitive, and gentle. They have a deep appreciation for beauty and enjoy expressing themselves creatively through various forms of art and craftsmanship.");             

          }

       if (personalityTraits.equalsIgnoreCase("INTP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Logician (16Personalities)");
          System.out.println("The INTP Personality Type");
          System.out.println("\nINTPs are Introverted, Intuitive, Thinking, Perceiving,Analytical, curious, and innovative. They have a thirst for knowledge and enjoy exploring complex theories and ideas, often challenging conventional wisdom..");

        }

      if (personalityTraits.equalsIgnoreCase("ESTP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Entreprenur (16Personalities)");
          System.out.println("The ESTP Personality Type");
          System.out.println("\nESTPs are Extraverted, Sensing, Thinking, Perceiving,Energetic, resourceful, and action-oriented. They thrive in dynamic environments and are skilled at seizing opportunities and making quick decisions..");
             }

        
      if (personalityTraits.equalsIgnoreCase("ESFP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Entertainer (16Personalities)");
          System.out.println("The ESFP Personality Type");
          System.out.println("\nESFPs are Extraverted, Sensing, Feeling, Perceiving,Spontaneous, outgoing, and fun-loving. They enjoy being the center of attention and have a natural talent for entertaining and bringing joy to others.");             

          }

        if (personalityTraits.equalsIgnoreCase("ENFP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Campaigner (16Personalities)");
          System.out.println("The ENFP Personality Type");
          System.out.println("\nENFPs are Extraverted, Intuitive, Feeling, Perceiving,Enthusiastic, imaginative, and empathetic. They are passionate about exploring possibilities and connecting with others on a deep emotional level.");

        }

      if (personalityTraits.equalsIgnoreCase("ESTJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Executive (16Personalities)");
          System.out.println("The ESTJ Personality Type");
          System.out.println("\nESTJs are Extraverted, Sensing, Thinking, Judging,Efficient, organized, and responsible. They excel in leadership roles and thrive in environments that require clear structure and adherence to rules..");
             }

        
      if (personalityTraits.equalsIgnoreCase("ENTP")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Debater (16Personalities)");
          System.out.println("The ENTP Personality Type");
          System.out.println("\nENTPs are Extraverted, Intuitive, Thinking, Perceiving,Innovative, intellectually curious, and persuasive. They enjoy debating ideas and challenging the status quo, often generating new insights and solutions.");             

          }

      if (personalityTraits.equalsIgnoreCase("ESFJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Consul (16Personalities)");
          System.out.println("The ESFJ Personality Type");
          System.out.println("\nESFJs areExtraverted, Sensing, Feeling, Judging,Sociable, supportive, and nurturing. They are dedicated to maintaining harmony in their relationships and communities, often taking on the role of caretakers.");

        }

      if (personalityTraits.equalsIgnoreCase("ENFJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Protagonist (16Personalities)");
          System.out.println("The ENFJ Personality Type");
          System.out.println("\nENFJs are Extraverted, Intuitive, Feeling, Judging,Charismatic, empathetic, and inspiring. They are natural leaders who are passionate about motivating others and championing social causes.");
             }

        
      if (personalityTraits.equalsIgnoreCase("ENTJ")) {
          System.out.println("\nThe Thoughtful Idealist (MBTI)");
          System.out.println("The Commander (16Personalities)");
          System.out.println("The ENTJ Personality Type");
          System.out.println("\nENTJs areExtraverted, Intuitive, Thinking, Judging,Strategic, assertive, and visionary. They excel in leading teams and driving projects to success through their strong leadership and decision-making skills.");             

          }

   

    }
  }