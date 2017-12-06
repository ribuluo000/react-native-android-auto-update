# react-native-android-auto-update
 这个库暴露出了下载并安装接口来实现更新apk,之前的逻辑以及界面都由RN实现。
 Base on 
 https://github.com/ribuluo000/android-auto-update

package.json 添加

```
"dependencies": {
    "react-native-android-auto-update": "git+https://github.com/ribuluo000/react-native-android-auto-update.git",
    
    }

```
 
#### react-native link react-native-android-auto-update

use:

```
import RNAndroidAutoUpdate from "react-native-android-auto-update";


        RNAndroidAutoUpdate.getAppVersionCode((versionCode)=>{
            console.log(versionCode);
            alert(versionCode);
        });

        RNAndroidAutoUpdate.goToDownloadApk('https://raw.githubusercontent.com/feicien/android-auto-update/develop/extras/android-auto-update-v1.2.apk');


```


