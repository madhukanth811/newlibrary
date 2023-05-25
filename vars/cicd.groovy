def newgit(xyz)
{
  git "${xyz}"
}

def newmaven()
{
sh 'mvn package'
}

def newdeploy(workspacename,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${workspacename}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
