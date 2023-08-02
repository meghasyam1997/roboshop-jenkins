def call() {
    pipeline {
        agent {
            node {
                label 'workstation'
            }
        }

        options{
            ansiColor('xterm')
        }

        parameters {
            choice(name: 'env', choices: ['dev', 'prod'], description: 'Pick one environment')
        }

        stages {
            stage('TERRAFORM INIT') {
                steps {
                    sh 'terrraform init -backend-config=env-${env}/state.tfvars'
                }
            }

            stage('TERRAFORM APPLY') {
                steps {
                    sh 'terraform apply -auto-approve -var-file=env-${env}/main.tfvars'
                }
            }
        }
        post {
            always {
                cleanWs()
            }
        }
    }
}