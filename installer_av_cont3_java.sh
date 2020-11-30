#!/bin/bash

cd $HOME

ls | grep -q av_cont3_java

if [ $? = 0 ]
    then
        echo "Clonando repositório"

        git clone "https://github.com/CarlosSantanaSP/av_cont3_java.git"

        mkdir caixa_eletronico

        cp av_cont3_java/avaliacao-continuada3/target/avaliacao-continuada3-1.0-SNAPSHOT-jar-with-dependencies.jar $HOME/Desktop/caixa_eletronico/
        cp av_cont3_java/installer_av_cont3_java.sh $HOME/Desktop/caixa_eletronico/
        cp av_cont3_java/README.txt $HOME/Desktop/caixa_eletronico

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
        echo "atualiza repo"

        cd $HOME/Desktop/av_cont3_java/

        git pull
fi
