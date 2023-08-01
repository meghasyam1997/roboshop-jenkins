def call(){
    pipeline{
//        agent{
//            node{
//                label 'workstation'
//            }
//        }
//
//        options{
//            ansiColor('xterm') {
//            }
//        }
//
//        stages{
//
//            stage('Code Quality'){
//                sh 'sonar-scanner -Dsonar.projectKey=${component} -Dsonar.host.url=http://172.31.80.205:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.qualitygate.wait=true'
//            }
//
//            stage('Unit Test Cases'){
//                sh 'echo Unit Test Cases'
//            }
//
//            stage('SAST'){
//                sh 'echo SAST'
//            }
//
//            stage('SCA'){
//                sh 'echo SCA'
//            }
//        }
//
//        post{
//            always{
//                cleanWs()
//            }
//        }
    }
}
