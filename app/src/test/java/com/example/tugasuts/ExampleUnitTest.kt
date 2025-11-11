package com.example.tugasuts

import org.junit.Test

import org.junit.Assert.*

/**
 * <?xml version="1.0" encoding="utf-8"?>
 * <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
 *     xmlns:tools="http://schemas.android.com/tools"
 *     android:id="@+id/main"
 *     android:layout_width="match_parent"
 *     android:layout_height="match_parent"
 *     android:layout_margin="16sp"
 *     android:orientation="vertical"
 *     tools:context=".MainActivity">
 *
 *     <TextView
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         android:layout_gravity="center_horizontal"
 *         android:layout_marginBottom="24dp"
 *         android:text="Formulir Pendaftaran"
 *         android:textColor="#C12D2D"
 *         android:textColorHint="#A01A1A"
 *         android:textColorLink="#D52929"
 *         android:textSize="24sp"
 *         android:textStyle="bold" />
 *
 *     <TextView
 *         android:id="@+id/textView2"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:text="Username" />
 *
 *     <EditText
 *         android:id="@+id/editTextText"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:ems="10"
 *         android:hint="Masukkan nama"
 *         android:inputType="text" />
 *
 *     <TextView
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         android:text="Email" />
 *
 *     <EditText
 *         android:id="@+id/editEmail"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:layout_marginBottom="16dp"
 *         android:hint="Masukkan Email"
 *         android:inputType="textEmailAddress" />
 *
 *
 *     <TextView
 *         android:id="@+id/textView4"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:text="Nama Depan                                 Nama Belakang" />
 *
 *     <LinearLayout
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:orientation="horizontal"
 *         android:weightSum="2"
 *         android:layout_marginTop="8dp">
 *
 *
 *
 *         <EditText
 *             android:id="@+id/etNamaDepan"
 *             android:layout_width="0dp"
 *             android:layout_height="wrap_content"
 *             android:layout_weight="1"
 *             android:hint="Nama Depan"/>
 *
 *         <Space
 *             android:layout_width="8dp"
 *             android:layout_height="wrap_content" />
 *
 *         <EditText
 *             android:id="@+id/etNamaBelakang"
 *             android:layout_width="0dp"
 *             android:layout_height="wrap_content"
 *             android:layout_weight="1"
 *             android:hint="Nama Belakang"/>
 *
 *     </LinearLayout>
 *
 *
 *     <TextView
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         android:text="Password" />
 *
 *     <EditText
 *         android:id="@+id/editPassword"
 *         android:layout_width="match_parent"
 *         android:layout_height="28dp"
 *         android:layout_marginBottom="16dp" />
 *
 *     <TextView
 *         android:id="@+id/textView3"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:text="Ketik Ulang Password" />
 *
 *     <EditText
 *         android:id="@+id/editTextTextPassword"
 *         android:layout_width="match_parent"
 *         android:layout_height="26dp"
 *         android:ems="10"
 *         android:inputType="textPassword" />
 *
 *     <Button
 *         android:id="@+id/btnCancel"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:backgroundTint="#1831AD"
 *         android:text="Kirim"
 *         android:textColorLink="#FB1717" />
 *
 *     <Button
 *         android:id="@+id/btnSubmit"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:backgroundTint="#FF5722"
 *         android:text="Batal"
 *         android:textColorLink="#F44336" />
 *
 * </LinearLayout>
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}