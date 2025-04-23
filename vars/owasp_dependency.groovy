def call() {
    dependencyCheck additionalArguments: '--scan ./ --format ALL', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
