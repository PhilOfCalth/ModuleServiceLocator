# Goal
To show an unambiguous example of java's implementation of the Service Design Pattern. This is covered by the Java 11 Certification Exam.

For use in a Naimuri insight/blog post.

## Running The Code as Modules
Running the code as java modules require a slightly different flow than simply using the classpath. When compiling you must specify the module path.
Likewise, the modular jars created need, to be placed on the module path. For simplicity's sake that module path is just a folder called 'mods'.
```bash
javac -p mods ${dir}/src/${package}/*.java ${dir}/src/module-info.java
jar -cvf mods/${dir}.jar -C ${dir}/src/ .
```
While running the code we need to specify the module as well as the fully qualified class name of the class with the main method in it.
```Bash
java -p mods -m consumer/thepackage.consumerpackage.Consumer
```

### Running The Bash Script
I've created a bash script in the root of this project that will do all this work for you (regardless of which branch you are on).
It can be run by calling:
```bash
./buildAndRunModules.sh
```
Obviously, in really like you would not have the build code in with the command to run it, but I like bash as a form of documentation.

## Note on Branches and Tagging
Unlike their common use in the development lifecycle, the repos I have used branches and tags to represent alternative solutions.
