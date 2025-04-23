def call(String project, String imageTag, String dockerHubUser) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUsername')]) {
        sh "docker login -u ${dockerHubUsername} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
