# Factory
The code in the .pdf given below is light years from OO.   OhNo_NoOO.pdf  Your job is to refactor the code into an appropriate hierarchy.  Utilize Dependency Inversion to find commonalities across the items and build an appropriate abstraction.  Through your abstraction you should be able to ask any concrete item what its area is and what its name is.  You should NOT use a field for the area, provide the area as a behavior (why might this approach be important with regards to design?).  Place all these items in a package named shapes.  Once the above is done, build a simple factory (ShapeFactory) that has a createShape method (or methods if necessary), that takes necessary parameters, builds an appropriate shape, then returns it.  This factory should live inside the package.  NOTE: Nothing outside the package should be allowed to directly create a shape -- it must be done through the factory.  Build your solution such that this is enforced.  Finally, create a ShapeTester (which lies outside the package) that asks the factory for multiple shapes of each type (be sure and vary the dimensions/data of each similar shape).  Place all these shapes in an ArrayList.  Use Collections.sort() to sort the ArrayList.  In order for Collections.sort() to work, the items in your ArrayList must all be Comparable.  Build that behavior into your shape hierarchy.  Shapes should be sorted by name, then area.  Print the shapes to the screen (report name and area) before sorting, then after sorting.  Be sure and label the output as before and after sorting.    Turn in the following a zip with      all source files: ShapeTester should be at the same level as the folder/package that contains all the classes in the hierarchy as well as ShapeFactory     Java source files: ShapeTester.java should be in the directory created by unzipping the submission. More specifically you should be able to run javac ShapeTester.java  and java ShapeTester  to compile and run your code from directory created by unzipping the submission. This speeds the process for the grader.      C# source files: submit a zip of your entire Visual Studio project.     a capture of the output of your tester -- name that file ShapeTesterOutput -- if the capture is an image, make sure the format is .pdf, .png, or .jpg.      a UML diagram that represents all the items in the package