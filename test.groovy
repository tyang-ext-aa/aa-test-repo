node('Yang Tao'){

	checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: "${env.BRANCH_NAME}"]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CheckoutOption', timeout: 30]], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/tyang-ext-aa/aa-test-repo.git']]]


    stage('Build'){
      echo "hi" 
      echo "2"
      sh "ls -a"
      sh "sh test.sh"
    }
}
