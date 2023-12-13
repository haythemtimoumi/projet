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
                    // Tests are typically run in the build step, but you can add additional test steps if required
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
