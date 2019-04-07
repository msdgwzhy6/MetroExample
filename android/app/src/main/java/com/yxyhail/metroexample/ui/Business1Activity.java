/*
 * Copyright 2019 yxyhail
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yxyhail.metroexample.ui;

import com.yxyhail.metroexample.react.BaseReactActivity;
import com.yxyhail.metroexample.react.JsLoaderUtil;

import javax.annotation.Nullable;

public class Business1Activity extends BaseReactActivity {
    @Override
    protected String getBundleName() {
        JsLoaderUtil.jsState.isFilePrior = false;
        return "business1";
    }

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "App1";
    }
}