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
              stage('Push Docker Image to DockerHub') {
            steps {
                script {
                    // Log in to DockerHub
                    sh 'docker login -u <timou123> -p <123Azerty>'
                    
                    // Tag the Docker image
                    sh 'docker tag my-springboot-app <timou123>/my-springboot-app:1.0'
                    
                    // Push the Docker image to DockerHub
                    sh 'docker push <timou123>/my-springboot-app:1.0'
                }
            }
        }
    }
}
