node('Yang Tao'){
    stage('Build'){
      echo "hi" 
      echo "2"
      sh "ls -a"
      sh "sh test.sh"
    }
}
