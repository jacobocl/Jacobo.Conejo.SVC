@echo off
set workspace=C:\Users\Jacobo\git\Jacobo.Conejo.SVC
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .

cd %workspace%

echo ============ mvn clean test -Denvironment.type=develop (profile: develop) =========================================================================
echo .
call mvn clean test -Denvironment.type=develop
echo .

echo ============ mvn package -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn package -Denvironment.type=preproduction
echo .
pause
