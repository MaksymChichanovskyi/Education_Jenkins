package ExampleA


void installMaven (String imageName){
docker.image(imagename).pull()
docker.image(imagename).inside(){
sh "maven clean package"
      }
    }
return this 
