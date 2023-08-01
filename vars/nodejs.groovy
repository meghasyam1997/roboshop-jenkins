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

            stage('Code Quality'){
                sh 'echo code Quality'
            }

            stage('Unit Test Cases'){
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
