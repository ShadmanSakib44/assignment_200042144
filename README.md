# assignment_200042144
SWE 4301 course assignment on Refacotoring and Coupling <br />
Submited By : Shadman Sakib <br />
ID: 200042144 <br />
Date : 19/11/2022

# Refactoring
In computer programming and software design, code refactoring is the process of restructuring existing computer code—changing the factoring—without changing its external behavior. Refactoring is intended to improve the design, structure, and/or implementation of the software, while preserving its functionality.

# Refactoring conditionals
You have a complicated conditional (if-then-else) statement.
Extract methods from the condition, then part, and else parts

	if (date.before (SUMMER_START) || date.after(SUMMER_END))
		charge = quantity * _winterRate + _winterServiceCharge;
	else charge = quantity * _summerRate;
  
  to
  
  
	if (notSummer(date))
		charge = winterCharge(quantity);
	else charge = summerCharge (quantity);
  
  ###### Benefits
  * By extracting conditional code to clearly named methods, you make life easier for the person who’ll be maintaining the code later.
  * This refactoring technique is also applicable for short expressions in conditions. 
  ###### Eliminates smell
  * Long Method
  
  # Coupling 
  As per Wikipedia, the definition of Coupling is “In software engineering, coupling is the degree of interdependence between software modules; a measure of how closely connected two routines or modules are; the strength of the relationships between modules. “

Coupling can simply be understood as how the different modules in a software interact with each other. It is imperative to have low coupling which means, every module must have very minimal interaction with other modules. One thumb rule is that any module can interact with only its friends and not to strangers. However, the minimal the interaction, the better the software. This makes the software more modular and easier to modify any existing functionality or add any new feature.
  Coupling in software engineering is broadly classified into five categories:

   * Content Coupling
   * Control Coupling
   * Stamp Coupling
   * Data Coupling
   
 ## Content Coupling

Content Coupling is observed when one module/class accesses and modifies the data of another module. This type of coupling can be reduced by having private instance variables and using getters and setters. However, calling setters from other classes will still constitute to content coupling, since members of another class can access and modify the data. 
## Control Coupling

A module is said to be control coupled when the flow of execution is decided by a variable of another class. This means which lines of code should be executed is decided by some parameter or a variable. This is more commonly found where there are control structures like if-else conditions.

## Stamp Coupling

Two classes are said to be stamp coupled if one class sends a collection or object as parameter and only a few data members of it is used in the second class. This type of coupling is desirable when the number of parameters that must be passed exceeds three. However, this needs to be further reduced to data coupling whenever possible.

## Data Coupling

Data coupling is the type of coupling that occurs when necessary data is sent as parameters between methods and classes. Data coupling is the most desirable among the 5 main types of coupling. However, if the number of parameters is more than three, then we may consider to create objects of the parameters if possible pass the object which contains the data itself, resulting in stamp coupling. An alternative is you may consider breaking the method into smaller methods and passing only lesser number of parameters to it.
