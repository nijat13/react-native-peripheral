package com.reactnative.bleperipheral;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RnBlePeripheralModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RnBlePeripheralModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RnBlePeripheral";
  }
}
