node('Yang Tao'){


	checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: "${env.BRANCH_NAME}"]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CheckoutOption', timeout: 30]], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/tyang-ext-aa/aa-test-repo.git']]]
 
    stage('Build'){
    	echo "1"
    	echo env.BRANCH_NAME
    	echo "hi" 
    	echo "2"
      	sh "ls -a"
      	sh "sh test.sh"
      	echo "MIRROR_REPOS_PATH :" + env.MIRROR_REPOS_PATH
    }
}
