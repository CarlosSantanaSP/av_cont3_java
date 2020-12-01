#!/bin/bash

#cd $HOME
        

cp avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar ../../

which java | grep –q /bin/java

echo $?

if [ $? = 0 ]
    then
        
        echo "Executando .jar"        

        chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar

        java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar


    else
        echo "Instalando SDKman"                

        sudo apt install zip

        curl -s "http://get.sdkman.io" | bash

        SOURCE "$HOME/.sdkman/bin/sdkman-init.sh"

        echo "Instalando java 11.0.9.open-adpt"

        sdk install java 11.0.9.open-adpt
        
        chmod +x avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar 

        java -jar avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar
fi

