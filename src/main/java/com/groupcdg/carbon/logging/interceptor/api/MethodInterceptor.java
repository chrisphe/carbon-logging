/*
 *  Copyright 2015 Computing Distribution Group Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupcdg.carbon.logging.interceptor.api;

import java.lang.reflect.Method;

public interface MethodInterceptor {

	Object interceptBefore(Object proxy, Method method, Object[] args, Object realtarget);

	void interceptAfter(Object proxy, Method method, Object[] args, Object realtarget, Object retObject,
			Object interceptBeforeReturnObject);

	void interceptAfterThrowing(Object proxy, Method method, Object[] args, Object realtarget, Throwable cause,
			Object interceptBeforeReturnObject);
}