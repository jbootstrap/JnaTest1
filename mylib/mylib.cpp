// mylib.cpp : DLL �A�v���P�[�V�����p�ɃG�N�X�|�[�g�����֐����`���܂��B
//

#include "stdafx.h"
#include <stdio.h>

extern "C"
__declspec(dllexport) int add2(int a, int b)
{
	printf("add2() called\n");
	return a + b;
}
