Honor of Kings Information Management System

Java Coursework Project Plan

1. Project Goal

The core goal of this project is to develop a console-based Honor of Kings Information Management System using core Java programming technologies. This system aims to realize standardized digital management of classic Honor of Kings game resources and user operation data, including player and administrator account management, hero and equipment information maintenance, team data management, and match record archiving.

The system is designed to achieve basic business logic encapsulation and data persistent storage, fully applying object-oriented programming ideas and common Java core technologies. It provides a simple, stable and interactive management platform for simulating the daily data maintenance work of the Honor of Kings game background. Meanwhile, this project consolidates core Java knowledge including inheritance, polymorphism, collections and file I/O, meeting the assessment requirements of university Java programming coursework.

2. Requirement Analysis

This system is divided into two user roles (Player and Admin) and supports four core business modules, with complete functional requirements as follows:

2.1 User Login & Identity Authentication

• Player Login: Ordinary players can register accounts, log into the system, view personal information, browse hero/equipment data, check team information and personal historical match records.

• Admin Login: Administrators have exclusive privileged login permissions. After logging in, they can modify, add, delete and audit all system core data, which ordinary players cannot operate.

• Basic verification functions include account password matching, illegal input interception, and repeated login verification.

2.2 Hero Information Management

Realize full lifecycle management of Honor of Kings hero data, including adding new heroes, querying hero attributes (occupation, difficulty, skills, positioning), modifying hero information, and deleting invalid hero data. All hero data supports persistent saving.

2.3 Team Information Management

Support the creation of in-game teams, query team member information, modify team attributes (team name, captain, team level), add/remove team members, and view team overall data statistics.

2.4 Auxiliary Functional Requirements

• Equipment information viewing and basic maintenance

• Automatic recording and persistent storage of user match records

• Data sorting and querying based on Java collection tools

• Local file permanent storage of all system data (no data loss after system restart)

3. Core Java Concepts Applied

This project comprehensively applies foundational and core advanced Java knowledge specified in the coursework syllabus, with detailed application scenarios as below:

3.1 Inheritance

Build a unified parent class Person to encapsulate the public attributes and methods of all system users (name, ID, password, basic information display). The Player class and Admin class inherit the Person parent class, reuse public code, and extend exclusive attributes and methods respectively, realizing code reuse and hierarchical design.

3.2 Polymorphism

Implement method overriding in subclasses of Player and Admin for core methods such as showInfo() and loginVerify(). Different role objects call different functional logic through the same method name, completing polymorphic display of administrator privileged functions and ordinary player basic functions.

3.3 Java Collections

Use mainstream collection frameworks for data storage and management:

• ArrayList for dynamic storage of hero lists, equipment lists, team member lists and match records

• Realize dynamic addition, deletion, traversal and sorting of data, solving the problem of uncertain data volume in game management

• Replace fixed-length arrays to improve system flexibility and scalability

3.4 File I/O Stream

Apply Java IO stream technology (character stream/buffered stream) to realize local file persistent storage. All data including user accounts, hero information, team data and match records will be written into local TXT files. The system automatically reads file data during startup and updates file data in real time after operation, avoiding in-memory data loss.

4. System Class Design

The system adopts standard object-oriented modular class design, with 7 core entity classes and independent functional logic division:

4.1 Person (Parent Superclass)

• Attributes: userID, userName, userPassword, gender

• Methods: basic constructor, getter/setter methods, showBasicInfo(), abstract login verification method

• Function: Base parent class for all user roles, encapsulating all public user attributes

4.2 Player (Subclass of Person)

• Extended Attributes: gameLevel, gameScore, ownedHeroList, personalMatchRecords

• Core Methods: viewHero(), viewTeam(), checkMatchHistory(), modifyPersonalInfo()

• Function: Implement all ordinary player business functions

4.3 Admin (Subclass of Person)

• Extended Attributes: adminLevel, operationLog

• Core Methods: addHero(), deleteHero(), updateHeroInfo(), manageTeam(), deleteMatchRecord()

• Function: Provide all background privileged management functions

4.4 Hero

• Attributes: heroID, heroName, occupation, difficulty, skillIntro, attributeValue

• Methods: constructor, getter/setter, showHeroDetail()

• Function: Encapsulate all attribute data and display logic of Honor of Kings heroes

4.5 Equipment

• Attributes: equipmentID, equipmentName, attributeBonus, price, type

• Methods: equipment information query and display method

• Function: Manage in-game equipment basic data

4.6 Team

• Attributes: teamID, teamName, captainID, memberList, teamLevel

• Methods: addMember(), removeMember(), showTeamInfo()

• Function: Realize team data management and member operation logic

4.7 MatchRecord

• Attributes: recordID, playerID, matchTime, result, usedHero, score

• Methods: record generation, record query, record display

• Function: Store and manage all user historical battle data

5. AI Usage Plan for Development

In this coursework development, AI is used as an auxiliary tool covering architecture design, code implementation and project review three professional roles to ensure standardization, correctness and completeness of the project:

5.1 AI as Architecture Designer

• Sort out system business logic and functional modules

• complete standardized class structure design, attribute and method division

• optimize project overall framework to conform to Java object-oriented development specifications

• check the rationality of inheritance and polymorphism logic design

5.2 AI as Implementation Assistant

• Assist in writing standard Java entity class code and tool method code

• guide the implementation of collection data management and file I/O persistent storage logic

• optimize code structure, reduce redundant code, and improve code readability

• solve common bugs such as file reading and writing exceptions and collection traversal errors

5.3 AI as Project Reviewer

• check whether the project fully meets coursework functional and technical requirements

• verify the correct application of all required Java core knowledge points

• optimize project document writing and code annotation specifications

• test system functional integrity and logic rationality, and put forward revision suggestions

6. Development Timeline (8-Stage Complete Development)

The project is divided into 8 progressive development stages to ensure orderly completion of design, coding, testing and submission:

Stage 1: Demand Confirmation & Framework Design (1 Day)

Finalize system core functions, sort out user roles and business modules, complete overall system architecture planning, and confirm all required Java technology points.

Stage 2: Core Entity Class Coding (1–2 Days)

Complete the writing of all entity classes including Person, Player, Admin, Hero, Equipment, Team and MatchRecord, finish inheritance relationship construction and basic method definition.

Stage 3: Polymorphism & OOP Logic Implementation (1 Day)

Override core methods of subclasses, realize role-based differentiated function logic, and complete object-oriented feature verification.

Stage 4: Collection Data Management Development (1 Day)

Use ArrayList to implement dynamic storage of all list data, complete data addition, deletion, query and traversal functions.

Stage 5: File I/O Persistent Storage Development (1–2 Days)

Complete file creation, data reading and writing functions, realize permanent storage of all system data, and test data recovery after system restart.

Stage 6: Core Business Function Integration (2 Days)

Integrate login authentication, hero management, team management and match record query modules to complete the overall system interactive logic.

Stage 7: System Testing & Bug Optimization (1 Day)

Test all functional modules, repair logic bugs and input exception problems, optimize code specifications and add complete code comments.

Stage 8: Document Sorting & Final Submission (1 Day)

Sort out project source code, organize complete project documents, check the full coverage of technical points and functional requirements, and complete the final coursework submission.

7. Project Summary

This Honor of Kings Information Management System fully practices Java object-oriented programming and core basic technologies. Through standardized class design, rational application of inheritance and polymorphism, flexible use of collections and file I/O technology, the system realizes complete game background data management functions. The whole development process strictly follows university coursework standards, with complete logic, standardized code and complete documents, which can fully reflect the mastery of basic Java programming knowledge and independent software development ability.
