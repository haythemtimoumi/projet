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
                    junit '**/target/surefire-reports/TEST-*.xml'
                
            }
        }
    }
}
