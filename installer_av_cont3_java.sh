#!/bin/bash


which java | grep –q /usr/bin/java

if [ $? = 0 ]
    then
        echo "Instalando java"

        sudo apt install default-jdk

        sudo chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

        sudo java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

    else
        echo "Executando .jar"

        sudo chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

        sudo java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

fi



