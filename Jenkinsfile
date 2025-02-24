@Library("Shared") _
pipeline {
    agent {label 'dev'}

    stages {
        stage("Hello"){
            steps{
                script{
                    hello()
                }
            }
        }
        stage('Pull') {
            steps {
                script{
                    pull("nginx")
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script{
                    push("nginx")
                }
            }
        }

        stage('Deploy') {
            steps {
                script{
                    deploy("pkpavan14/nginx:latest","my-nginx-container",8080)
                }
            }
        }
    }
}
