# Test Cases

## Test Case 01: Create Team
Function: Team constructor  
Input: Team name "SKT"  
Expected Output: Team object created with name "SKT"  
Actual Output: Team created successfully  
Result: Pass

## Test Case 02: Add Player to Team
Function: Team.addMember()  
Input: Player "Faker"  
Expected Output: Player added to team  
Actual Output: Player added  
Result: Pass

## Test Case 03: Prevent Duplicate Player
Function: Team.addMember()  
Input: Add "Faker" twice  
Expected Output: Player added only once  
Actual Output: Duplicate ignored  
Result: Pass

## Test Case 04: Add Hero to Team
Function: Team.addHero()  
Input: Hero "Yasuo"  
Expected Output: Hero added to team  
Actual Output: Hero added  
Result: Pass

## Test Case 05: Record Win
Function: Team.recordWin()  
Input: Call recordWin()  
Expected Output: Wins increase by 1  
Actual Output: Wins = 1  
Result: Pass

## Test Case 06: Record Loss
Function: Team.recordLoss()  
Input: Call recordLoss()  
Expected Output: Losses increase by 1  
Actual Output: Losses = 1  
Result: Pass

## Test Case 07: Create MatchRecord
Function: MatchRecord constructor  
Input: TeamA="SKT", TeamB="T1", Winner="SKT"  
Expected Output: MatchRecord created  
Actual Output: Created successfully  
Result: Pass

## Test Case 08: Get Winning Team
Function: MatchRecord.getWinningTeam()  
Input: Existing match record  
Expected Output: "SKT"  
Actual Output: "SKT"  
Result: Pass

## Test Case 09: Invalid Player Input
Function: Team.addMember(null)  
Expected Output: No change  
Actual Output: Ignored safely  
Result: Pass

## Test Case 10: Team Overview Display
Function: Print team info  
Expected Output: Shows name, members, wins/losses  
Actual Output: Display correct  
Result: Pass
