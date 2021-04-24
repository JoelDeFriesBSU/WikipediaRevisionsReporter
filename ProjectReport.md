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
remove the unsightly T and Z's as this was the quickest and easiest way to make the information better readable.

## Challenge #3 Complete

I used stream() and a mere two functions within stream() to achieve the goal of this challenge (I'm very happy with that result!).
map() maps the formatter function to every element using the class::func syntax (IntelliJ directed me to this syntax from lambda, and it looks cleaner).
collect() collects all the items in response.revisions() and puts them into one string, delimited by "\n" just like in the original function.
I have chosen to leave the original section of code for my own future reference if needed.

## Reflection Question #1: Functional vs OO

As expected, both approaches get us to the same desired destination.
The iterative approach requires having to manage a StringBuilder object, which in turn
requires multiple different calls for "append" in the for loop, as well as needing a helper
string "message" for cleanliness.
In contrast, the functional approach is one-lined and can be divided easily with double-indentation.
It chains functions that take getting used to understanding, but have powerful and simplistic functionality
once applied. Instead of having to attach a called function to a helper string, we can use map() to achieve
the same effect with no need for a StringBuilder. Splitting the list into a string with "\n" chars
is then done through the collect() function and Collector class.
The iterative approach requires a for loop and 4 other lines of code. The functional approach only requires one line.

Overall, I enjoy the abilities and readability of the functional approach more,
though I definitely would need to get much better at using the higher-order functions properly.
The functional approach negates the need to micromanage outsider variables or create new lists.
This is very apparent with functions like map() and filter() as well.

## Reflection Question #2: Polymorphism and Dependency Inversion

Polymorphism allows dependency inversion to occur due to its role in allowing the modules
(FormatterModule and QueryEngineModule) and allowing for their interfaces and individual classes
to work in the same level (being bound together).
Specifically, we see polymorphism work with our FormatterInterface and our __RevisionFormatters.
We then see the dependency inversion work when we bind the interface with a formatter of our
choosing and allowing that formatter to be injected as its interface, abstracting the normal relationship 
the two classes would have.
Thus, the existence of interfaces and classes that implement them allows for that relationship
to be changed through dependency inversion.
