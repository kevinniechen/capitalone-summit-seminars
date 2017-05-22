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
