# Reflection

## 1. Which AI tools or models did you use?
I used ChatGPT as my AI assistant during the development of this project.

## 2. Which prompt was the most useful? Why?
The most useful prompt was asking the AI to act as an Architect Agent and suggest the class design for Team and MatchRecord.  
It helped me understand how to connect Player, Hero, and Team using composition instead of inheritance.

## 3. Which AI-generated suggestion was wrong, incomplete, or misleading?
In the beginning, AI suggested making MatchRecord inherit from Team.  
I realized this was incorrect because a match record is not a type of team, so I chose composition instead.

## 4. How did you check whether AI-generated code was correct?
I compiled and ran the program in Eclipse.  
I also manually tested adding players to teams and checking match results to ensure the logic worked as expected.

## 5. What bugs did you fix yourself instead of asking AI to fix?
I fixed the duplicate player bug in Team.addMember() myself.  
AI reminded me of the risk, but I wrote the final null-check and duplicate-check logic manually.

## 6. What Java concept did you understand better after using AI?
I understood composition, encapsulation, and collection usage (List<Player>, List<Hero>) much better through this project.

## 7. What Java concept are you still unsure about?
I am still unsure about designing immutable classes and when to use interfaces versus abstract classes.

## 8. Did AI make the project easier, harder, or both? Explain.
AI made the project easier overall.  
It helped me design faster and avoid syntax errors, but I still had to think critically and test manually to ensure correctness.

## 9. Which parts of the final project were mainly written by you?
The final design decisions, bug fixes, testing, and all Git commits were done by me.  
I also wrote the reflection and documentation myself.

## 10. Which parts were mainly generated or heavily assisted by AI?
Class structure suggestions, method skeletons, and documentation templates were AI-assisted.  
I reviewed and modified all generated code before committing.
