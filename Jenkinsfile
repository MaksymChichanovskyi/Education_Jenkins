@Library('Shared.groovy') _
def agentName = 'linux'
def someText = 'Hello!'

node(agentName) { //run this part on an agent with label 'linux'
    stage('Checkout') {
        checkout scm
    }
  stage('Build') {
      script{
    def imageName = "maven:3.9.8-amazoncorretto-11"      
    ExampleA.installMaven(imageName)
      }
    }
}

