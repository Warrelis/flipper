/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the LICENSE
 * file in the root directory of this source tree.
 */
package com.facebook.flipper.plugins.console.iface;

import org.json.JSONException;
import org.json.JSONObject;

public interface ScriptingSession {

  JSONObject evaluateCommand(String userScript) throws JSONException;

  JSONObject evaluateCommand(String userScript, Object context) throws JSONException;

  void close();
}
