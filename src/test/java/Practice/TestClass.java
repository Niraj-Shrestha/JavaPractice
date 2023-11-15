package Practice;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        String Sentence = "My name is niraj shrestha and i will check if my name is repeated or not";
        String[] words = Sentence.toLowerCase().split("\\s");
        List<String> wordList = Arrays.stream(words).toList();

        /*HashMap<String , Integer> map = new HashMap<>();
        for(int i= 0; i< wordList.size(); i++){
            map.put(wordList.get(i),map.getOrDefault(wordList.get(i), 0) + 1);
        }
        for(String word : map.keySet()) {
            if (map.get(word) > 1) {
                System.out.println("'" + word + "' appears " + map.get(word) + " times.");
            }
        }*/
        //checkDuplicate(wordList);

        /*int[] ints = {1,2,3,4,6,8,0,4,2,6,8,2,2,5,7};
        List<Integer> list = new ArrayList<>();
        for(int i : ints){
            list.add(i);
        }
        checkDuplicateInteger(list);*/

        char[] chars = Sentence.toLowerCase().replaceAll(" ","").toCharArray();
        List<Character> list = new ArrayList();
        for(char c : chars){
            list.add(c);
        }
        countDuplicateChar(list);
        //checkDuplicateCharsUsingHashSet(list);
    }

    static void checkDuplicateCharsUsingHashSet(List<Character> chars){
        HashSet<Character> old = new HashSet<>();
        HashSet<Character> newDuplicate = new HashSet<>();

        for(char i : chars){
            if(!old.add(i)){
                newDuplicate.add(i);
            }
        }
        System.out.println(newDuplicate.size());
    }

    static void countDuplicateChar(List<Character> chars){
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i= 0; i< chars.size(); i++){
            map.put(chars.get(i),map.getOrDefault(chars.get(i), 0) + 1);
        }
        System.out.println();
        for(char word : map.keySet()) {
            if (map.get(word) > 1) {
                System.out.println("'" + word + "' appears " + map.get(word) + " times.");
            }
        }
    }

    static void checkDuplicate(List<String> wordList){
        for(int i= 0; i< wordList.size();i++){
            int counter =1;

            for(int j = 0; j < i; j++){
                if( wordList.get(i).equalsIgnoreCase(wordList.get(j))){
                    counter ++;
                }
            }
            if(counter>1) {
                System.out.println("'" + wordList.get(i) + "' appears " + counter + " times.");
            }
        }
    }

    static void checkDuplicateInteger(List<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            int Counter = 1;

            for(int j = 0; j < i ; j++){
                if(numbers.get(i) == numbers.get(j)){
                    Counter++;
                }
            }
            if(Counter>1){
                System.out.println(numbers.get(i)  + " appears " + Counter + " times.");
            }
        }
    }
}



/*JOB DESCRIPTION
Project: Hyatt acquired a hotel chain and are putting 1500 boutique hotels into Hyatt’s booking system
Allowing Hyatt guests to use their booking platform
This team does not have any QA’s, It’s a new team around new initiatives
Working on the backend integrate data from other hotel chain into hyatts system
Tech stack:
5+ years exp
** More frontend focused - Playwright (selenium variant), JavaScript, Strong working with API’s, SQL, Rest, GraphQL, reading api’s and making sure data ends up in correct location

PURPOSE:
The Senior Software Development Engineer in Test (SDET) will ensure that the developed software meets requirements. He or she will be responsible for performing QA/UAT, developing test plans and test scripts, and supporting test efforts, and coaching other SDETs on the team.

POSITION RESPONSIBILITIES:
• Work closely with product, design, and development team members to understand business requirements and to communicate problem impacts/risks
• Create and execute test plans and scripts that accurately and reliably assess application quality.
• Analyze test results to discover and report defects, following best practices as defined by the team.
• Develop, maintain, and enhance automation tests and framework libraries to verify the functionality and reliability of our software (Java, Groovy, Kotlin)
• Conduct regular code reviews to ensure that object-oriented design best practices are followed at all times. Automation code should be easy to extend and support
• Be knowledgeable in the features for which the team is responsible; in collaboration with peers, develop quality assurance measures and testing standards.
• Communicate test progress, test results, and quality of application changes
• Set standards in and coach other QAs in test environment and data setup and management
• Apply a thorough understanding of relevant technology to deliver robust test suites. (web technologies, REST APIs, web services, physical devices, Java, XML, JS, CSS, and HTML)
• Create and maintain CI/CD pipelines for automated testing (Jenkins, Azure, etc.)
• Use creativity and initiative to improve product test reliability, coverage, and accuracy.
• Demonstrate a commitment to Hyatt core values.
• The position responsibilities outlined above are in no way to be construed as all encompassing. Other duties, responsibilities, and qualifications may be required and/or assigned as necessary

EXPERIENCE AND QUALIFICATIONS:
• 5+ years direct experience as an SDET for major application integration and/or major application product release
• Experience working collaboratively with peers and coaching more junior team members
• Proficiency in analyzing business requirements and creating relevant plans and scripts that provide thorough test coverage.
• Proficiency in documenting defects with high level of detail and accuracy, following standards as defined by the team.
• Excellent written and oral communication, active listening, and interpersonal skills
• Proficiency in version control systems like Git and Subversion
• Proficiency in Java, XML, JS, CSS and HTML
• Proficiency in testing APIs/services (REST and SOAP) using SoapUI, Postman or equivalent tools
• Proficiency in cross browser, cross platform web and mobile testing with SauceLabs or equivalent tools
• Deep expertise in Java and/or Groovy, test automation frameworks, Selenium/Appium
• Proficiency in searching system logs and troubleshooting potential defects. (Splunk or similar tools)
• Direct hands-on experience with ad hoc query programs, automated testing tools, and reporting software
• Proficiency in the preparation/maintenance of test data and test scripts.
• Strong knowledge of software testing best practices and methodologies.
• Direct hands-on experience with continuous integration and deployment tools like Jenkins

PREFERRED SKILLS:
• Thorough understanding of Agile/Scrum development process.
• Demonstrable skills in writing JUnit or TestNG tests

EDUCATION:
BS in Computer Science or equivalent combination of technical education and work experience.*/
