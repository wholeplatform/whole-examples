
#to use a snapshot instead of the last release
cd /whole/org.whole.products.releng
mvn -f pom-ldk.xml clean install
#uncomment snapshot related line in pom.xml

#run from shell
cd <project dir>
mvn clean package

java -jar target/whole-batch-processor-1.0.0-SNAPSHOT-jar-with-dependencies.jar input QueriesCleanup.xwl 


#eclipse configuration
mvn eclipse:eclipse
#create a Run Configuration for: org.whole.examples.batchprocessor.BatchProcessorApplication
#with arguments: input QueriesCleanup.xwl


put sources to migrate in a folder called input

