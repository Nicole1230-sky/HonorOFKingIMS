## Implementation Agent
**Date:** 2026-06-04
**Main contribution:**
Generated the skeleton code for the `Person` abstract class, including attributes (`id`, `name`), constructor, getters/setters, and the abstract method `displayInfo()`.
**Human decision:**
I reviewed the code, confirmed it follows Java naming conventions, and pasted it into `src/model/Person.java`. I also ensured the class is properly structured for inheritance by `Player` and `Admin`.
**Related commits:**
- [AI-Implementation] add abstract Person class

## Implementation Agent
**Date:** 2026-06-04
**Main contribution:**
Implemented the abstract base class `Person.java` under `src/model`. Defined common attributes such as id, name, age, and gender, along with constructors and getter/setter methods. Established the foundation for polymorphism in the domain model.
**Human decision:**
Approved the field definitions and access modifiers. Confirmed the use of an abstract class for shared behavior among players, heroes, and admins.
**Related commits:**
- [AI-Implementation] add Person abstract class with basic fields