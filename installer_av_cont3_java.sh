#!/bin/bash

cp avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar ../../

which java | grep –q /bin/java

echo $?

if [ $? = 0 ]
    then
        
        echo "Executando .jar"        

        chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

        java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar


    else
        echo "Instalando java"                

        sudo apt install default-jdk
        
        chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar 

        java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar
fi

