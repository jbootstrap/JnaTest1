// mylib.cpp : DLL アプリケーション用にエクスポートされる関数を定義します。
//

#include "stdafx.h"
#include <stdio.h>

extern "C"
__declspec(dllexport) int add2(int a, int b)
{
	printf("add2() called\n");
	return a + b;
}
