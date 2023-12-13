pipeline {
    agent any

    stages {

        stage('Build & Compilee') {
            steps {
                script {
                    // Use Maven or Gradle based on your project setup
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test with JUnit') {
            steps {
                script {

                    sh 'mvn test' // Explicitly running tests again, this could be redundant
                    // Assuming test reports are generated in 'target/surefire-reports'
                //junit '**/target/surefire-reports/TEST-*.xml'
            
                }
            }
        }
    
            stage('Build Docker Image') {
            steps {
                script {
                    // Building the Docker image with a tag
                    sh 'docker build -t my-springboot-app .'
                }
            }
        }
    }
}
