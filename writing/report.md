# Report by Team 3 (Lancaster Wu, Devin Ho, and Christian Lussier)

Performance evaluations are an important part of learning how efficient a
certain method or entire program is when performing software development. Team
3 decided to follow the concept portrayed by idea three on the assignment sheet
and run performance evaluations. The program will run a variety of different
performance evaluations using doubling experiments on things such as
computational methods and converting content to a string. The user also has
control over how many rounds of doubling experiment is run and in some cases,
what data type is being used. By allowing user customization, the program can
effectively complete performance evaluations that are controlled by a variety
of different conditions, allowing the user to get a better idea of how
efficient things are.

Design is a key part of the software development process. Before designing this
project, the team first spent several hours determining what type of project
they would complete. Once the team decided to do a project based off of topic
three and performance evaluations, the design process truly began. When
beginning to design the program the team thought that allowing users to
customize the performance evaluations would be extremely useful. Wondering what
would be feasible in the time allotted to complete the project, the team
decided to allow user customization in the areas of what type of method would
be tested, how many rounds of the doubling experiment would be run, and what
data type the method would be run with for certain methods. With this user
customization the team believes the user will be able to tailor performance
evaluations to their wants and needs, allowing them to complete performance
evaluations of a variety of different methods, placed under a variety of
different conditions. In addition to this, after talking to Professor
Kapfhammer, the team decided that a cancel feature would be useful for when a
doubling experiment is running for a long time. Later on, the team also came up
with some ideas that would have been completed if they had more time. These
ideas were to add a GUI and a save feature that would give user the option to
save their ResultsTable. Unfortunately, the team did not have enough time to
implement these optional ideas. After coming up with these ideas, the team met
to discuss how the design of the program and how it would function. By drawing
diagrams of the programs structure on the board (some of these are included in
the file `diagrams`) and distilling the system down to its most fundamental
parts, adhering to the design principle of the abstraction, the team was able
to determine the tentative design of the project. The team also followed the
design principle of modularity when designing the program, organizing different
components of the program into separate functional units. By coming up with a
tentative design of how the program would work and following object-oriented
design principles, the team successfully designed the program.

When implementing the program the team made communication a priority. By
creating a task list fo things that needed to be completed and assigning
specific tasks to specific people the team was able to implement things in a
reasonable amount of time. The issues tracker in GitHub was utilized frequently
as it allowed team members to post things that needed to be done and allowed
the team to coordinate their actions. The team also used "GroupMe", a group
texting app, that allowed the team to communicate while outside the classroom.
This constant communication allowed the team to effectively implement the
needed code for the program. In terms of actual implementation, the team
implemented a variety of different computations and types of lists that would
be converted to a string that the user could choose to perform performance
evaluations on. The team also created a doubling experiment to run these
performance evaluations and added code that would track the amount of time it
takes for the computational method or conversions to run. The team also spent
time creating a main method to allow for user input and create the interface
the users see in terminal. The team mostly relied on their knowledge of the
content covered in CMPSC 112 to implement the code for the project. By using
effective communication methods and relying on their knowledge of the content
in the class the team was able to effectively implement the needed code for the
final project.

Testing is another key part of the software development process as it is the
process of checking the correctness of the program and its code. Our team used
a few different methods when it came to testing the correctness of the program.
One of these methods involved creating test cases to make sure everything was
working properly. Test cases were created to make sure the the `ResultsTable`
worked correctly, specifically including to make sure it builds correctly, adds
rows correctly, adds ratios to the `ResultsTable` correctly, and more. Test
cases were also created to test the correctness of the `ArithmeticComputations`
taking place in the program. More specifically there were test cases to check
how the Fibonacci computations would react to specific values and computations,
to see how the Factorial computations would react to specific values and
computations, and more. The team also employed other methods to check the
programs correctness. One of these was to place helpful print line statements
in the code if possible errors were arising. This allowed the team to find
errors and fix them, helping the program reach a greater level of correctness.
Another key part of testing is to run the program and make sure everything
seems to be working together, essentially experimenting with the program. The
team did this many times, running the program with a variety of different
inputs. This allowed the team to make sure everything seemed to be working
correctly and test the overall usability and reliability of the program. At one
point, this method allowed the team to see that occasionally the program would
print lines of the `ResultsTable` with values of 0 because the cancel feature
would cancel the running performance evaluation before all the rounds of the
doubling experiment were completed. This type of testing allowed the team to
find this error and fix it. In a similar fashion, the team was able to test the
input of the program and found out that users could input letters or random
numbers, which would cause the program to crash, when only a specific range of
integers should have been allowed to be entered. This allowed the team to
implement code that only allowed the user to enter numbers from the specific
range of integers. By running the program many times and creating test cases to
check the correctness of the program, the team was able to test the program in
its entirety.

The team evaluated the program in a variety of different ways. One of these
ways was to perform performance evaluations of the program itself. The team did
this by implementing code that would calculate the running time of certain
portions of code in the program. This evaluation allowed the team to find out
that our program was not the fastest when starting so measures were taken to
make it slightly faster. Another way the team evaluated the program was to look
at the output of `gradle` commands such as `gradle build` and `gradle run`.
This allowed the team to see if the program was functioning correctly. The team
also evaluated the program by looking at the results of test cases to make sure
they passed, allowing the team to evaluate the program's correctness. In
addition to this, the team also studied the output of the program in order to
make sure that everything was working correctly and to evaluate the usability
of the program. By evaluating the program's output in terminal, the team was
able to make improvements to the program's interface and output in terminal. By
evaluating the program's performance, testing, and output, the team was able to
effectively evaluate the program.

The team focused on designing, implementing, testing, and evaluating their
final project in order to complete it in an efficient yet correct manner. When
designing the project the team followed object-oriented design principles in
order to follow good software development practice. By following these
practices and being thorough, the team was able to implement the program
effectively. After and during the implementing of the program's code, the team
was able to test and evaluate the program to make sure it was correct and
efficient. By effectively designing, implementing, testing, and evaluating
their final project, Team 3 was successfully able to create a program that
allowed users to complete customizable performance evaluations.
