def agentName = 'linux && docker'
def someText = 'Hello!'

node(agentName) { //run this part on an agent with label 'linux'
    stage('Checkout') {
        checkout scm
    }
  stage('Build'){
      sh 'startBuild'
    }
}
