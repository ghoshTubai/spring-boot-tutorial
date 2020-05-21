pipeline {
    agent any
    stages {
        stage ('Compile Stage'){
            steps {
                withMaven(maven : 'maven 3.6.3'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage'){
            steps {
                withMaven(maven : 'maven 3.6.3'){
                    sh 'mvn test'
                }
            }
        }
        stage ('Build Stage'){
            steps {
                withMaven(maven : 'maven 3.6.3'){
                    sh 'mvn build'
                }
            }
        }
    }

}