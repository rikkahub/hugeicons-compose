package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BluetoothNotConnected: ImageVector
    get() {
        if (_bluetoothNotConnected != null) {
            return _bluetoothNotConnected!!
        }
        _bluetoothNotConnected = ImageVector.Builder(
            name = "BluetoothNotConnected",
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
        moveTo(4f, 3.99304f)
        lineTo(20f, 20.0137f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0094f, 7.97976f)
        curveTo(12.0094f, 6.85151f, 11.8211f, 4.37371f, 12.4988f, 3.62154f)
        curveTo(13.3394f, 2.88737f, 16.666f, 5.70138f, 18.2835f, 7.05515f)
        curveTo(17.4525f, 7.90736f, 17.0866f, 8.72598f, 14.6659f, 10.5223f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5002f, 17.5094f)
        curveTo(14.6596f, 19.5714f, 13.4835f, 20.7985f, 12.6288f, 20.4349f)
        curveTo(12.5439f, 20.3988f, 12.4741f, 20.3348f, 12.427f, 20.2554f)
        curveTo(11.9013f, 19.3692f, 12.0095f, 17.0485f, 12.0095f, 15.9707f)
        verticalLineTo(11.9932f)
        lineTo(4.97754f, 16.7063f)
        }
        }.build()

        return _bluetoothNotConnected!!
    }

private var _bluetoothNotConnected: ImageVector? = null
