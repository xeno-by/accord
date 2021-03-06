/*
  Copyright 2013-2014 Wix.com

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package com.wix.accord.combinators

import com.wix.accord._
import com.wix.accord.ViolationBuilder._

/** Simple boolean combinators. */
trait BooleanCombinators {
  /** A boolean validator that matches only on true. */
  class IsTrue extends BaseValidator[ Boolean ]( identity, _ -> "must be true" )

  /** A boolean validator that matches only on false. */
  class IsFalse extends BaseValidator[ Boolean ]( !_, _ -> "must be false" )
}
