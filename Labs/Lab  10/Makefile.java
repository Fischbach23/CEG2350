# Makefile for compiling and running Repeat.java

# Define variables
SOURCE = Repeat.java
CLASS = Repeat.class

# Default target: compile the program
make: $(CLASS)

# Compile the Java source file
$(CLASS): $(SOURCE)
	javac $(SOURCE)

# Target to run the compiled program
run: $(CLASS)
	java Repeat

# Target to clean up compiled files
clean:
	rm -f $(CLASS)
