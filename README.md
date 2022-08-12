# RetoHypernova
Reto de Automatización Hypernova Labs con Serenity BDD y Cucumber

# Comandos de Git utilizados:

1. Tras crear el proyecto en IntelliJ, se abre terminal y se navega al repositorio del proyecto:
cd D:\Work\JobApps\RetoHyperNova

2. Desde la carpeta raíz del proyecto, se envía el comando:
git init

Para convertir la carpeta del proyecto en un repositorio Git. 
Y luego,
git add
Para agregar los archivos del proyecto.

3. Adicionalmente se creó el repositorio remoto “RetoHyperNova” en mi cuenta de GitHub desde el sitio Web. Este se especifica al repositorio local con el siguiente comando para dirigir los cambios al hacer commit:

git remote add origin https://github.com/mlprznzl/RetoHyperNova.git 

4. Previo a subir al repositorio remoto, se debe hacer commit de los archivos agregados y modificados:

git commit -m “First commit”

5. Finalmente se hace push al repositorio remoto creado en GitHub:

git push -u -f origin main
