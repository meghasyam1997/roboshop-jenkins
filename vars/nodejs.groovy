def call(){
    pipeline{
        agent{
            node{
                label 'workstation'
            }
        }

        options{
            ansiColor('xterm') {
            }
        }

        stages{

            stage('CODE QUALITY'){
                sh 'sonar-scanner -Dsonar.projectKey=${component} -Dsonar.host.url=http://172.31.80.205:9000'
            }

            stage('UNIT TEST CASES'){
                sh 'echo Unit Test Cases'
            }

            stage('SAST'){
                sh 'echo SAST'
            }

            stage('SCA'){
                sh 'echo SCA'
            }
        }

        post{
            always{
                cleanWs()
            }
        }

    }
}
