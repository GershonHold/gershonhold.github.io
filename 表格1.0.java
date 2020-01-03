
<TableLayout
        android:id="@+id/table_alarmSet"
        android:layout_width="336dp"
        android:layout_height="191dp"
        android:layout_marginStart="2dp"
        android:layout_marginTop="50dp"
        app:layout_constraintStart_toEndOf="@+id/imageView2"
        app:layout_constraintTop_toTopOf="parent">

        <TableRow
            android:layout_height="wrap_content"
            android:background="#FFFFFF">

            <TextView
                android:layout_height="50dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="警报阈值设置" />

            <TextView
                android:layout_height="50dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="低报阈值" />

            <TextView
                android:layout_height="50dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="低报时间" />

            <TextView
                android:layout_height="50dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="高报阈值" />

            <TextView
                android:layout_height="50dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="高报时间" />

        </TableRow>


<TableRow
            android:layout_height="wrap_content"
            android:background="#FFFFFF">

            <TextView
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="警报生成" />

            <EditText
                android:id="@+id/et_alarmOn_dataValue_low"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOn_dataValue_low"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOn_dataValue_high"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOn_timeValue_high"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />
        </TableRow>

        <TableRow
            android:layout_width="663dp"
            android:layout_height="68dp"
            android:background="#FFFFFF">

            <TextView
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#7CD5EC"
                android:gravity="center"
                android:text="警报解除" />

            <EditText
                android:id="@+id/et_alarmOff_dataValue_low"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOff_timeValue_low"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOff_dataValue_high"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />

            <EditText
                android:id="@+id/et_alarmOff_timeValue_high"
                android:layout_height="70dp"
                android:layout_weight="1"
                android:background="#EEEEEE"
                android:gravity="center"
                android:inputType="number" />
        </TableRow>

    </TableLayout>