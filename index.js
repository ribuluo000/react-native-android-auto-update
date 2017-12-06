var AndroidAutoUpdate = require('react-native').NativeModules.AndroidAutoUpdate;
var DeviceEventEmitter = require('react-native').DeviceEventEmitter;

module.exports = {
  getAppVersionCode(cb) {
    AndroidAutoUpdate.getAppVersionCode((versionCode) =>{
      cb(versionCode);
    });
  },
  goToDownloadApk(url) {
    AndroidAutoUpdate.goToDownloadApk(url);
  },
}