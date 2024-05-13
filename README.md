# Automation-SauceDemo

Despues de clonar el repositorio, se debe tener en cuenta lo siguiente:

  1. Se ingresa a "File", "Setting", "Build, Execution, Deployment", "Build Tools", "Gradle" y se tienen  en cuenta las siguientes configuraciones de la imagen.
    ![image](https://github.com/efsolora/Automation-SauceDemo/assets/90974818/7207639d-bee4-4f2a-adab-a8304e9ede18)

  2. Se ingresa a "File", "Proyects Structure", "Project" y se verifica que el proyecto tenga el SDK dl el Java que se descargo en el paso anterior temurin-17.0.11 y no jhay necesidad de         colocarlo como variable de entorno.
    ![image](https://github.com/efsolora/Automation-SauceDemo/assets/90974818/8fe77a55-159d-426d-bbe0-355108ac7e2e)

  3. Se ingresa a "File", "Proyects Structure", "SDKs" y se verifica que homePath este apuntando a donde descargó el Java
    ![image](https://github.com/efsolora/Automation-SauceDemo/assets/90974818/2c41a7ca-6bb1-4818-b69b-b4836dfc22e9)

  4. Se ingresa a "Run/Debug Configurations" y el proyecto se debe ejecutar en Gradle con los siguentes argumento ":test --tests "sofka.com.co.runners.RunnerBuyProductInOnlineStore" -            Denvironment=qa" 
    ![image](https://github.com/efsolora/Automation-SauceDemo/assets/90974818/cbad2db2-62a9-48d6-a4c4-6eec9fa69844)

  5. Se debe tener instalado el navegador Edge

