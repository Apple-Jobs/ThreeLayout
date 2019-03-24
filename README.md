# lab2_ThreeLayout
The project about the three types of the layout.

## 实验内容：
Android实验二_Android布局实验，本代码创建了Android工程按要求实现三种布局。

## 1.利用线性布局实现要求界面
### 思路：
整体为LinearLayout布局，排列方向为垂直，在布局中内嵌排列方向为水平的LinearLayout布局；<br>
第一二行的1、3、4个button的宽度根据内容大小自动伸缩，第2个设置权重使其占据剩下的空间，第四行同理；<br>
第三行设置四项权重都为1使其大小一致;<br>
字体、边框颜色为灰色,其余为黑色。<br>
### 关键代码：

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#000000"
    >
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="3dp">
        <Button
            android:id="@+id/btnOneOne"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="One,One"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnOneTwo"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="3dp"
            android:text="One,Two"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnOneThree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="One,Three"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"/>
        <Button
            android:id="@+id/btnOneFour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Four"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="3dp">

        <Button
            android:id="@+id/btnTwoOne"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Two,One"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnTwoTwo"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="3dp"
            android:text="Two,Two"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnTwoThree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Two,Three"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"/>
        <Button
            android:id="@+id/btnTwoFour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Four"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="3dp">
        <Button
            android:id="@+id/btnThreeOne"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Three,One"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnThreeTwo"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Three,Two"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnThreeThree"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Three,Three"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnThreeFour"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:text="Three,Four"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="3dp">
        <Button
            android:id="@+id/btnFourOne"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Four,One"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnFourTwo"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Four,Two"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"
            />
        <Button
            android:id="@+id/btnFourThree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="3dp"
            android:text="Four,Three"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"/>
        <Button
            android:id="@+id/btnFourFour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Four"
            android:textAllCaps="false"
            android:background="@drawable/shape"
            android:textColor="#AAAAAA"/>
    </LinearLayout>
</LinearLayout>
```

```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android = "http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!--设置背景色-->
    <solid android:color="#000000"/>
    <!--设置边框线的宽度和颜色-->
    <stroke android:width="1dp" android:color="#AAAAAA" />

</shape>
```
### 实验结果：
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/linearLayout.png)<br>
### 问题：
输入的英文内容显示时都为大写，不懂如何显示边框，通过百度已解决。

## 2.利用ConstraintLayout实现要求界面
### 思路
红色置最左，黄色置最右，橙色居中；<br>
蓝色居中距离橙色底部有一定距离，绿色在蓝色左边与蓝色底部对齐，INDIGO在蓝色右边与蓝色对齐;<br>
紫色宽度占据整个空间，且在蓝色下方。
### 关键代码：

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.threelayout.MainActivity"
    android:background="#000000">
    <Button
        android:id="@+id/btnOne"
        android:layout_width="wrap_content"
        android:layout_height="70dp"

        android:background="#ff0202"
        android:text="RED"
        />

    <Button
        android:id="@+id/btnTwo"
        android:layout_width="wrap_content"
        android:layout_height="70dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:background="#ffa702"

        android:text="ORANGE"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="@+id/btnOne" />

    <Button
        android:id="@+id/btnThree"
        android:layout_width="wrap_content"
        android:layout_height="70dp"
        android:background="#ffff02"
        android:text="YELLOW"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/btnFour"
        android:layout_width="wrap_content"
        android:layout_height="70dp"
        android:layout_marginEnd="10dp"
        android:background="#02ff02"
        android:text="GREEN"
        app:layout_constraintBottom_toBottomOf="@+id/btnFive"
        app:layout_constraintEnd_toStartOf="@+id/btnFive" />

    <Button
        android:id="@+id/btnFive"
        android:layout_width="wrap_content"
        android:layout_height="70dp"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:background="#0202ff"
        android:text="BLUE"
        app:layout_constraintBottom_toTopOf="@+id/btnSeven"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnTwo" />

    <Button
        android:id="@+id/btnSix"
        android:layout_width="wrap_content"
        android:layout_height="70sp"
        android:layout_marginStart="10dp"
        android:background="#4b0285"
        android:text="INDIGO"
        app:layout_constraintBottom_toBottomOf="@+id/btnFive"
        app:layout_constraintStart_toEndOf="@+id/btnFive" />

    <Button
        android:id="@+id/btnSeven"
        android:layout_width="match_parent"
        android:layout_height="72dp"
        android:layout_marginBottom="8dp"
        android:background="#ef83ef"
        android:text="VIOLET"
        app:layout_constraintBottom_toBottomOf="parent"
      />

</android.support.constraint.ConstraintLayout>


```
### 实验结果：
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/ConstraintLayout.png)<br>


## 3.利用表格布局实现要求界面
### 关键代码：
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#111111"
    android:stretchColumns="1">
    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="Open..."
            android:textColor="#838383"
            android:layout_margin="5dp"/>
        <TextView
            android:layout_column="1"
            android:text="Ctrl-O"
            android:textColor="#838383"
            android:gravity="right"
            android:layout_margin="5dp"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="Save..."
            android:textColor="#838383"
            android:layout_margin="5dp"/>
        <TextView
            android:layout_column="1"
            android:text="Ctrl-S"
            android:textColor="#838383"
            android:gravity="right"
            android:layout_margin="5dp" />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="Save As..."
            android:textColor="#838383"
            android:layout_margin="5dp"/>
        <TextView
            android:layout_column="1"
            android:text="Ctrl-Shift-S"
            android:textColor="#838383"
            android:gravity="right"
            android:layout_margin="5dp" />
    </TableRow>

    <View  android:layout_height="5px"
        android:layout_width="match_parent"
        android:background="#838383" />

    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="X Import..."
            android:textColor="#838383"
            android:layout_margin="5dp"
            />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="X Export..."
            android:textColor="#838383"
            android:layout_margin="5dp"
           />
        <TextView
            android:layout_column="1"
            android:text="Ctrl-E"
            android:textColor="#838383"
            android:gravity="right"

            android:layout_margin="5dp"
             />
    </TableRow>

    <View  android:layout_height="5px"
        android:layout_width="match_parent"
        android:background="#838383" />
    <TableRow>
        <TextView
            android:layout_column="0"
            android:text="Quit..."
            android:textColor="#838383"
            android:layout_margin="5dp"/>

    </TableRow>
</TableLayout>

```
### 实验结果：
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/tableLayout.png)<br>
