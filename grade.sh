CPATH='.;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar'



rm -rf student-submission
rm -rf grading-area


mkdir grading-area

git clone $1 student-submission
echo 'finished cloning'

pwd
if ! [ -f student-submission/ListExamples.java ]
then 
    echo 'Missing Necessary files'
    exit
fi
    echo 'continue'

cp TestListExamples.java student-submission/ListExamples.java grading-area
cp -r lib grading-area

cd grading-area
pwd


javac -cp $CPATH *.java
if [ $? -ne 0 ]
then 
    echo 'Compilation error'
    exit 1
fi

java -cp ".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar" org.junit.runner.JUnitCore TestListExamples 

if [ $? -ne 0 ]
then 
    echo 'Runtime error'
    exit 1
fi

# Draw a picture/take notes on the directory structure that's set up after
# getting to this point

# Then, add here code to compile and run, and do any post-processing of the
# tests
