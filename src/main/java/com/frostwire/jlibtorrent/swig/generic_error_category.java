/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class generic_error_category {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected generic_error_category(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(generic_error_category obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_generic_error_category(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public generic_error_category() {
    this(libtorrent_jni.new_generic_error_category(), true);
  }

  public String name() {
    return libtorrent_jni.generic_error_category_name(swigCPtr, this);
  }

  public String message(int ev) {
    return libtorrent_jni.generic_error_category_message__SWIG_0(swigCPtr, this, ev);
  }

  public String message(int ev, String buffer, long len) {
    return libtorrent_jni.generic_error_category_message__SWIG_1(swigCPtr, this, ev, buffer, len);
  }

}