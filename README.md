# Flourish

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=16"><img alt="API" src="https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat"/></a>
</p>

<p align="center">
🎩 A polished and dynamic way to show up layouts.<br>
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/24237865/68065498-6f2d1980-fd6d-11e9-8a37-a530f2848501.gif" width="32%"/>
</p>

## Including in your project
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
    repositories {
        jcenter()
    }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
    implementation "com.github.skydoves:flourish:1.0.0"
}
```

## Usage
### BasicExample
Here is a basic example of implementing `flourish` using `Flourish.Builder` class.

```java
Flourish flourish = new Flourish.Builder(parentLayout)
    .setFlourishLayout(R.layout.layout_flourish_main)
    .setFlourishAnimation(FlourishAnimation.BOUNCE)
    .setFlourishOrientation(FlourishOrientation.TOP_LEFT)
    .setFlourishListener(flourishListener)
    .setIsShowedOnStart(false)
    .setDuration(800L)
    .build();
```

### Create using kotlin dsl
This is how to create an instance of `Flourish` using kotlin dsl.

```kotlin
val myFlourish = createFlourish(parentLayout) {
  setFlourishLayout(R.layout.layout_flourish_main)
  setFlourishAnimation(FlourishAnimation.ACCELERATE)
  setFlourishOrientation(FlourishOrientation.TOP_RIGHT)
  setIsShowedOnStart(true)
  setFlourishListener {  }
}
```

### Show and dismiss
Here is how to show and dismiss.

```kotlin
flourish.show()
flourish.dismiss()

// we can do something after showed or dismissed using lambda.
flourish.show { toast("showed") }
flourish.dismiss { toast("dismissed") }
```

### FlourishOrientation
We can customize a start point orientation of the showing and dismiss.
```
.setFlourishOrientation(FlourishOrientation.TOP_LEFT)
.setFlourishOrientation(FlourishOrientation.TOP_RIGHT)
.setFlourishOrientation(FlourishOrientation.BOTTOM_LEFT)
.setFlourishOrientation(FlourishOrientation.BOTTOM_RIGHT)
```

TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT |
| :---------------: | :---------------: | :---------------: | :---------------: |
| <img src="https://user-images.githubusercontent.com/24237865/68065839-40fe0880-fd72-11e9-87ad-64b6f601d94a.gif" align="center" width="100%"/> | <img src="https://user-images.githubusercontent.com/24237865/68065841-41969f00-fd72-11e9-9d1c-4035836e166a.gif" align="center" width="100%"/> | <img src="https://user-images.githubusercontent.com/24237865/68065840-40fe0880-fd72-11e9-9716-b0bc2f79f1ef.gif" align="center" width="100%"/> | <img src="https://user-images.githubusercontent.com/24237865/68065842-41969f00-fd72-11e9-9dfd-65f42e2f2ed5.gif" align="center" width="100%"/> 

## Find this library useful? :heart:
Support it by joining __[stargazers](https://github.com/skydoves/Flourish/stargazers)__ for this repository. :star:<br>
And __[follow](https://github.com/skydoves)__ me for my next creations! 🤩

# License
```xml
Copyright 2019 skydoves (Jaewoong Eum)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
