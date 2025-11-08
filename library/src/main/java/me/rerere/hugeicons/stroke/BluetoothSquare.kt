package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BluetoothSquare: ImageVector
    get() {
        if (_bluetoothSquare != null) {
            return _bluetoothSquare!!
        }
        _bluetoothSquare = ImageVector.Builder(
            name = "BluetoothSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5953f, 12f)
        verticalLineTo(8.61228f)
        curveTo(11.5953f, 7.66908f, 11.5953f, 7.19748f, 11.8894f, 7.0428f)
        curveTo(12.1835f, 6.88812f, 12.559f, 7.16224f, 13.31f, 7.71046f)
        lineTo(14.1553f, 8.32755f)
        curveTo(14.7184f, 8.73866f, 15f, 8.94421f, 15f, 9.22937f)
        curveTo(15f, 9.51453f, 14.7184f, 9.72009f, 14.1553f, 10.1312f)
        lineTo(11.5953f, 12f)
        moveTo(11.5953f, 12f)
        verticalLineTo(15.3877f)
        curveTo(11.5953f, 16.3309f, 11.5953f, 16.8025f, 11.8894f, 16.9572f)
        curveTo(12.1835f, 17.1119f, 12.559f, 16.8378f, 13.31f, 16.2895f)
        lineTo(14.1553f, 15.6725f)
        curveTo(14.7184f, 15.2613f, 15f, 15.0558f, 15f, 14.7706f)
        curveTo(15f, 14.4855f, 14.7184f, 14.2799f, 14.1553f, 13.8688f)
        lineTo(11.5953f, 12f)
        moveTo(11.5953f, 12f)
        lineTo(9f, 9.77778f)
        moveTo(11.5953f, 12f)
        lineTo(9f, 14.2222f)
        }
        }.build()

        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
