/*
 * Copyright 2013-2014 Sergey Ignatov, Alexander Zolotov, Mihai Toader, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goide.psi.legacy;

import com.intellij.testFramework.LightProjectDescriptor;

public class GoLegacyResolveBuiltinTest extends GoLegacyResolveTestBase {
  @Override
  protected String getBasePath() { return "psi/resolve/builtin"; }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    setUpProjectSdk();
  }

  @Override
  protected boolean allowNullDefinition() {
    return true;
  }

  @Override
  protected LightProjectDescriptor getProjectDescriptor() {
    return createMockProjectDescriptor();
  }
  
  public void testMethodName()        { doTest(); } 
  public void testBuiltinTypes()      { doTest(); } 
  public void testBuiltinConversion() { doTest(); } 
  public void testVarBuiltinType()    { doTest(); } 
  public void testVarMethodType()     { doTest(); } 
  public void testParameterType()     { doTest(); }

  @Override
  protected void processNullResolve() {
    fail("Reference " + myReference + " should be resolved");
  }
}
