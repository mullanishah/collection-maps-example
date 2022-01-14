# collection-maps-example 
```Github Pages URL``` <a href="https://mullanishah.github.io/collection-maps-example/">https://mullanishah.github.io/collection-maps-example/</a>

<br>An assignment/task/example illustrating functionalities and usages provided by Map implementation class ie. HashMap in Java. 

In a nutshell, Collection framework provides utility classes and interfaces that are readymade implementation of various data structures and algorithms. Whereas, Map interface implementation classes stores elements in key/value pair.

In this example, I have tried to utilise capabilities and functions provided by HashMap class in the Collection framework. Here I have considered a imaginary Customer management system with features such as register, sort and unsubscribe customers.  This is a plain old Core Java application without any database, threading or file handling functionalities; intended to keep focus purely on Collection framework.

In order to execute the application, run MainTester class from com.core.tester package. Upon program execution, user will be asked to select appropriate option from the list of Menus to perform following operations:
|    |                                   | Map class method used                        |
|----|-----------------------------------|----------------------------------------------|
| 1) | Register new customer             | (HashMap.put(K,V))                           |
| 2) | Unsubscribe existing customer     | (HashMap.remove(K))                          |
| 3) | Update password                   | (HashMap.get(K) and HashMap.set(K, V))       |
| 4) | Display all customers             | (HashMap.values() and Collection.iterator()) |
| 5) | Sort customers (on Email)         | (Natural sorting, Comparable interface)      |
| 6) | Sort customers (on Date of Birth) | (Custom Sorting, Comparator interface)       |

<b>Output:</b>
```Output
### MENU ###
1.Register new customer     2.Unsubscribe existing 
3.Update password           4.Display details 
5.Sort(On Email)            6.Sort(on DoB) 
7.Exit
Enter your choice: 
1
Enter details (email, name, pwd, b'date(dd/MM/yyyy), reg.amount): 
dave.watson@hotmail
Davee Watson
*******
12/04/1988
13005
New customer registered successfully!!
==================================
### MENU ###

1.Register new customer     2.Unsubscibe existing 
3.Update password           4.Display details 
5.Sort(On Email)            6.Sort(on DoB) 
7.Exit
Enter your choice: 
2
Enter email id: 
test@gmail
Customer details removed successfully!!, 
details: test[Email: test@gmail, Pwd: 123456, B'Date: 09/09/1999, RegAmount: Rs.15000.0]
==================================
### MENU ###

1.Register new customer     2.Unsubscibe existing 
3.Update password           4.Display details 
5.Sort(On Email)            6.Sort(on DoB) 
7.Exit
Enter your choice: 
6
==================================
Sorted on DoB: 
17/10/1984 | Mrs Alice Smith[Email: iamalice@rediff.com, Pwd: Alice@1234, B'Date: 17/10/1984, RegAmount: Rs.11090.0]
31/05/1987 | Sir Paul McKellen[Email: paul.mckellen@hotmail.com, Pwd: paul@1234, B'Date: 31/05/1987, RegAmount: Rs.9210.0]
12/04/1988 | Davee Watson[Email: dave.watson@hotmail, Pwd: dave@123, B'Date: 12/04/1988, RegAmount: Rs.13005.0]
21/01/1988 | David Darwin[Email: davin.darwin@gmail.com, Pwd: david@123, B'Date: 21/01/1988, RegAmount: Rs.11200.0]
09/09/1989 | A R Beevers[Email: mr.beevers@yahoo.in, Pwd: AR1234, B'Date: 09/09/1989, RegAmount: Rs.17590.0]
06/08/1990 | Sean Bean[Email: bean1992@yahoo.co.in, Pwd: Sean@1234, B'Date: 06/08/1990, RegAmount: Rs.14590.0]
```

<b>Thank you.<br>
Shahrukh Mullani </b>
      


