package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BluetoothSearching: ImageVector
    get() {
        if (_bluetoothSearching != null) {
            return _bluetoothSearching!!
        }
        _bluetoothSearching = ImageVector.Builder(
            name = "BluetoothSearching",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.0014f, 11.9979f)
            lineTo(13.4202f, 8.57917f)
            curveTo(14.1575f, 7.84185f, 14.5262f, 7.47319f, 14.5015f, 7.0269f)
            curveTo(14.4768f, 6.58062f, 14.0692f, 6.25445f, 13.254f, 5.6021f)
            curveTo(11.8414f, 4.47176f, 11.1351f, 3.90659f, 10.5683f, 4.17899f)
            curveTo(10.0014f, 4.4514f, 10.0014f, 5.3547f, 10.0014f, 7.1613f)
            verticalLineTo(11.9979f)
            close()
            moveTo(10.0014f, 11.9979f)
            lineTo(10f, 11.9993f)
            moveTo(10.0014f, 11.9979f)
            verticalLineTo(12.0007f)
            moveTo(10f, 11.9993f)
            lineTo(5f, 16.9994f)
            moveTo(10f, 11.9993f)
            lineTo(10.0014f, 12.0007f)
            moveTo(10f, 11.9993f)
            lineTo(5f, 6.99932f)
            moveTo(10.0014f, 12.0007f)
            verticalLineTo(16.8374f)
            curveTo(10.0014f, 18.644f, 10.0014f, 19.5473f, 10.5683f, 19.8197f)
            curveTo(11.1352f, 20.0921f, 11.8414f, 19.5269f, 13.254f, 18.3966f)
            curveTo(14.0692f, 17.7442f, 14.4768f, 17.4181f, 14.5015f, 16.9718f)
            curveTo(14.5262f, 16.5255f, 14.1575f, 16.1568f, 13.4202f, 15.4195f)
            lineTo(10.0014f, 12.0007f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.1353f, 9.49f)
            curveTo(18.7019f, 10.2006f, 19.0096f, 11.0829f, 19.0078f, 11.9918f)
            curveTo(19.006f, 12.9006f, 18.6947f, 13.7817f, 18.1253f, 14.49f)
            moveTo(15f, 11.99f)
            lineTo(15f, 12f)
        }
        }.build()

        return _bluetoothSearching!!
    }

private var _bluetoothSearching: ImageVector? = null
