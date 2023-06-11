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
    }
}