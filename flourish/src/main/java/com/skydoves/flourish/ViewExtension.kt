/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
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

package com.skydoves.flourish

import android.view.View
import android.view.ViewGroup

/** sets visibility of a view. */
internal fun View.visible(visibility: Boolean) {
  if (visibility) {
    this.visibility = View.VISIBLE
  } else {
    this.visibility = View.GONE
  }
}

/** applies [ViewGroup]'s layout params. */
internal fun ViewGroup.applyLayoutParams(block: ViewGroup.LayoutParams.() -> Unit) {
  layoutParams?.let {
    val params: ViewGroup.LayoutParams =
      (layoutParams as ViewGroup.LayoutParams).apply { block(this) }
    layoutParams = params
  }
}
