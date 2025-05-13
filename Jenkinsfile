pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3' // make sure Maven is installed on Jenkins
        jdk 'JDK 17'        // set up JDK 17 in Jenkins global tools
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/vamsikrishna-ch07/spring-core-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:report'
            }
        }

        stage('Archive Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
                jacoco execPattern: '**/target/jacoco.exec', classPattern: '**/target/classes', sourcePattern: '**/src/main/java', changeBuildStatus: true
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
