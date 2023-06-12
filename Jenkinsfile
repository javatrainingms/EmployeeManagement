pipeline {
    agent any
    stages {
        stage("Git Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/javatrainingms/EmployeeManagement.git'
            }
        }
        stage("unit testing") {
            steps {
                bat 'mvn test'
            }
        }
        stage("Integration testing") {
            steps {
                bat 'mvn verify -DskipTests'
            }
        }
        stage("Maven Build") {
            steps {
                bat 'mvn clean install'
            }
        }
        stage("Static Code Analysis") {
            steps {
            	script{
            		withSonarQubeEnv(credentialsId: 'sonar-api') {
						bat 'mvn clean package sonar:sonar'
					}    
            	}
                
            }
        }
        stage("Quality Gate Status") {
            steps {
            	script{
            		waitForQualityGate abortPipeline: false, credentialsId: 'sonar-api'
  
            	}
                
            }
        }        

    }
}