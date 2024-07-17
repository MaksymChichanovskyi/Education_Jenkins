def agentName = 'linux'
def someText = 'Hello!'

node(agentName) { //run this part on an agent with label 'linux'
    stage('Checkout') {
        checkout scm
    }
  stage('Build') {
    ExampleA("maven:3.9.8-amazoncorretto-11")
}
}
