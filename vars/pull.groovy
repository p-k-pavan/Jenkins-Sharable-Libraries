def call(String imageName){
    echo "Building Docker image: ${imageName}"
    sh "docker pull ${imageName}"
}
