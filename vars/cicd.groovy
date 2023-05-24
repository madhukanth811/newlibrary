def git(repo)
{
  git "${repo}"
}

def maven()
{
sh 'mvn package'
}
