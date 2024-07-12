package ExampleA

def (String imageName){
docker.iamge(imagename).pull()
docker.image(imagename).inside()
sh "maven clean package"
}
return this 
