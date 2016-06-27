@ECHO OFF

rem ant

SETLOCAL
SET VCDIR=C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC

call "%VCDIR%\vcvarsall.bat" x86
rem call "%VCDIR%\vcvarsall.bat" x64

echo on

Devenv mylib\mylib.sln /rebuild Release
IF ERRORLEVEL 1 GOTO ERR

copy mylib\Release\mylib.dll src\

mkdir build\classes\win32-x86
copy mylib\Release\mylib.dll build\classes\win32-x86\

call ant jar

goto SUCCESS

:SUCCESS
echo 正常に終了しました。
goto END

:ERR
echo エラーが発生しました。
goto END

:END

ENDLOCAL

PAUSE
