# Project Report

Joel DeFries

## Challenge #1 Complete

In edu.bsu.cs/QueryEngineModule, I changed the binding of the QueryEngine class to the WikipediaQueryEngine instead of the fake one.

## Challenge #2 Complete

I created the interface "FormatterInterface" which works with the two other formatters in view.
I then made the "FormatterModule" class that works just like QueryEngineModule, but for the formatters.
[It binds the interface to the chosen formatter class that works with it.]
I then injected it into Guice in "WikipediaAnalyzer" using @Inject and replaced the actual formatter class call with it.
To clean up the formatting of the datetime, I went for the simplistic route and used .replace() to
remove the unsightly T and Z's as the LocalDateTime class doesn't like to work in the formatter.

## Challenge #3 Complete

I used stream() and a mere two functions within stream() to achieve the goal of this challenge (I'm very happy with that result!).
.map() maps the formatter function to every element using the class::func syntax (IntelliJ directed me to this syntax from lambda, and it looks cleaner).
.collect() collects all the items in response.revisions() and puts them into one string, delimited by "\n" just like in the original function.
I have chosen to leave the original section of code for my own future reference if needed.

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

