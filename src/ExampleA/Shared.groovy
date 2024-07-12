package ExampleA

def imageName="maven:3.9.8-amazoncorretto-11"
docker.iamge(imagename).pull()
docker.image(imagename).inside()
return this 
