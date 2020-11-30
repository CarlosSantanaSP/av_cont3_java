#!/bin/bash

cd $HOME

pwd

ls | grep -q av_cont3_java

if [ $? = 0 ]
    then
        echo "clona repo"

        # pwd 

        git clone "https://github.com/CarlosSantanaSP/av_cont3_java.git"

        cp av_cont3_java/avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar $HOME/Desktop/

        cd $HOME/Desktop/

        which java | grep –q /usr/bin/java

        if [ $? = 0 ]
            then
                echo "Instalando SDKman"                

                sudo apt install zip

                curl -s "http://get.sdkman.io" | bash

                SOURCE "$HOME/.sdkman/bin/sdkman-init.sh"

                echo "Instalando java 11.0.9.open-adpt"

                sdk install java 11.0.9.open-adpt

            else
                echo "Executando .jar"        

                chmod +x avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar 

                java -jar avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar
        fi

    else 

    # else        
        echo "não clona repo"
        echo "atualiza repo"
        # cp av_cont3_java/avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar $HOME/Desktop/
        cd $HOME/Desktop/av_cont3_java/

        git pull
fi
# which java | grep –q /usr/bin/java

# if [ $? = 0 ] 
#     then echo "toma"

#         echo "outra"

#     else echo "tomei"

#         echo "mais uma"
# fi