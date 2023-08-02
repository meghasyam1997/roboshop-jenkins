def call(){
    pipeline {
        agent {
            node {
                label 'workstation'
            }
        }

        options{
            ansiColor('xterm')
        }

        stages {

            stage('CODE COMPILE') {
                steps {
                    sh 'mvn complie'
                }
            }

            stage('CODE QUALITY') {
                steps {
                    sh 'ls -l'
                    sh 'sonar-scanner -Dsonar.projectKey=${component} -Dsonar.host.url=http://172.31.80.205:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.qualitygate.wait=true'
                }
            }

            stage('UNIT TEST CASES') {
                steps {
                    sh 'echo Unit Test Cases'
                }
            }
            stage('SAST') {
                steps {
                    sh 'echo SAST'
                }
            }
            stage('SCA') {
                steps {
                    sh 'echo SCA'
                }
            }
        }
        post{
            always{
                cleanWs()
            }
        }

    }
}
