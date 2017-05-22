# Branches
A branch is a collection of commit objects (default branch is master)

## Switching branches
git checkout [branch-name]

## Showing branches
```
~/P/L/CapitalOne ❯❯❯ git branch
* master
~/P/L/CapitalOne ❯❯❯ git branch -r
  origin/master
~/P/L/CapitalOne ❯❯❯ git branch -a
* master
  remotes/origin/master
```

## Log
git log

# Stashing
Stash current changed files to different directory for later

Current directory will be reverted to HEAD commit. (note: files not in staging area will still be stashed)

Can stash something, pull from a different branch, and recover stashed files into the different branch

## Recovering stash
git stash list
git stash show
git stash apply

# Source Tree
Visual representation for large projects to keep up with changing git ecosystem

# Usage Patterns

## Git-flow
there are master and develop branches
developers create feature branches from develop branch
once develop branch has some number of updates, becomes release branch
release branch becomes tagged version of master branch

hotfix branches available for master release branches
push hotfix into develop afterwards
will be shipped into next version (most likely)

# Rebase
Change git commit history

## Options
reword - change commit message

## Interactive rebase
```
git rebase -i HEAD~4

r 0000000 Update caption
f 0000001 update caption 2
f 0000002 update caption 3
```

## Changing last message
git commit --amend --author="Kevin <kev@umd.edu>"

## Do not change history that you've shared
Do not rebase a commit that you have pushed (and is shared)
Branch, rebase, and then merge

# Tagging
Mark release points

## List tags
git tag

## Search for commits with a certain tag
```
$ git tag -l "v1.8.5*"
v1.8.5
v1.8.5-rc0
v1.8.5-rc1
v1.8.5-rc2
v1.8.5-rc3
v1.8.5.1
v1.8.5.2
v1.8.5.3
v1.8.5.4
v1.8.5.5
```

## Show tag
```
$ git show v1.4
tag v1.4
Tagger: Ben Straub <ben@straub.cc>
Date:   Sat May 3 20:19:12 2014 -0700

my version 1.4

commit ca82a6dff817ec66f44342007202690a93763949
Author: Scott Chacon <schacon@gee-mail.com>
Date:   Mon Mar 17 21:52:11 2008 -0700

    changed the version number
```

## Sharing tags to remote
Tags are not shared by default

```
git push origin --tags
git push origin v1.8
```

## Checking out tags
Don't check out tags because the tags are just pointers... can move somewhere else

Create a new branch and check out (be wary it will be different than the remote tagged commit once you make changes

```
$ git checkout -b version2 v2.0.0
Switched to a new branch 'version2'
```

# Other

## Github Wiki
Wiki pages can be cloned for offline usage
They are separate repositories
