def agentName = 'linux'
def someText = 'Hello!'

node(agentName) { //run this part on an agent with label 'linux'
    stage('Checkout') {
        checkout scm
    }
  stage('Build') {
    installMaven (String imageName ) {
    sh 'mvn clean package'
    }
}
}
