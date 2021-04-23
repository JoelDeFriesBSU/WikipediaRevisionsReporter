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

(Explain your solution to Challenge #3. If it is not complete, change
the subsection title above to "Incomplete" and explain how far you got
and where you got stuck.)

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

