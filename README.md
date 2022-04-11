##Scala Training Exercises
### Object Oriented Basics
1. Define a Class
   - Use the src/main/scala source folder of your new project
   - Use com.pulse0930.scalatrain.Train.scala as the file name
   - When done, create an instance in the worksheet
2. Define class Parameters
   - Add a class parameter to com.pulse0930.scalatrain.Train
     - Use number as name
     - Use Int as type
   - Execute in the worksheet
   - First try to create a com.pulse0930.scalatrain.Train like before, without arguments
   - Then create a com.pulse0930.scalatrain.Train with an appropriate argument
3. Promote Class Parameters I
   - Create a com.pulse0930.scalatrain.Train in the worksheet and try to access number
   - Add (prepend) a kind parameter of type String to com.pulse0930.scalatrain.Train
   - Promote both parameters of com.pulse0930.scalatrain.Train to immutable fields
   - Create a com.pulse0930.scalatrain.Train in the worksheet and access kind and number
4. Promote Class Parameters II
   - Create a Time class
     - Add promoted hours and minutes class parameters of type Int
     - Add a "TODO" comment: Verify that Hours is within 0 and 23
     - Add a "TODO" comment: Verify that Minutes is within 0 and 59
5. Define a Field
   - Add an immutable asMinutes field to Time
     - Use Int for the type
     - Initialize it with hours multiplied by 60 plus minutes
   - Create a Time in the worksheet and access asMinutes
6. Define a Method
   - Add a minus method to 
      - Add a that parameter of type Time
      - Use Int for the return type
      - Calculate the difference between the two Times in minutes
   - Call the method in the worksheet
7. Define an Operator
   - Add a - method to Time
     - Make it an alias of minus, i.e. delegate to minus
     - Call the - operator in the worksheet
     - Also call the minus method in infix operator
8. Use Default Arguments
   - Modify Time's class parameters hours and minutes to have default values of 0
   - Create some Times in the worksheet with no arguments for hours or minutes or both
9. Use Packages
   - From now on we will use specific packages
   - Move the Time and com.pulse0930.scalatrain.Train classes to com.typesafe.training.scalatrain package
     - Either use the "Refractor>Move..." wizard
     - Or add the package clauses manually and move the files to the com/typesafe/training/scalatrain subdirectory of src/main/scala
   - Create a Time instance in the worksheet
10. Define a Companion
    - Create the companion object for Time
    - Add a fromMinutes method
      - Add a minutes parameter of type Int
      - Use Time for the return type
      - Create a Time which has normalized values for hours and minutes i.e minutes has to be within 0 and 59
11. Checking Pre-conditions
    - Do you remember the TODO comments in the Time?
    - Use the require method to verify that hours is within 0 and 23
    - Use the require method to verify that minutes is within 0 and 59
    - Try it out in the worksheet
12. Define Case Classes
    - Make case classes out of Time and com.pulse0930.scalatrain.Train
      - Remove val from the class parameters, even if it doesn't hurt
      - Remove new in Time.fromMinutes, even if it doesn't hurt
    - Try out the various case class features in the worksheet

### Testing
### Collections and Functional Programming Basics
1. Use a Sequence
   - Create the Station case class
     - Add a name parameter of type String
   - Add a schedule class parameter to Train
   - Verify that schedule contains at least two elements
2. Use Map 
   - Change the type of com.pulse0930.scalatrain.Train.schedule to an immutable Seq[(Time, Station)]
     - Add a "TODO" comment: Verify that schedule is strictly increasing in time
   - Add a stations field to com.pulse0930.scalatrain.Train
     - Use an immutable Seq of Station for the type
     - Inititalize it with all Stations contained in schedule
### For Loops and For Expressions
### Inheritance and Traits
### Pattern Matching
### Dealing with Optional Values
### Handling Failure