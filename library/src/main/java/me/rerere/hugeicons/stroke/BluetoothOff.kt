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

val HugeIcons.BluetoothOff: ImageVector
    get() {
        if (_bluetoothOff != null) {
            return _bluetoothOff!!
        }
        _bluetoothOff = ImageVector.Builder(
            name = "BluetoothOff",
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
            moveTo(3f, 3f)
            lineTo(21f, 21f)
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
            moveTo(15.2686f, 9.48464f)
            curveTo(15.455f, 9.30715f, 15.651f, 9.12049f, 15.8607f, 8.92079f)
            curveTo(16.625f, 8.19283f, 17.0072f, 7.82886f, 16.9902f, 7.37818f)
            curveTo(16.9733f, 6.9275f, 16.5649f, 6.59325f, 15.748f, 5.92475f)
            lineTo(15.2686f, 5.53242f)
            curveTo(13.8533f, 4.37412f, 13.1456f, 3.79497f, 12.5738f, 4.0659f)
            curveTo(12.0104f, 4.33285f, 12.0021f, 5.2245f, 12.002f, 7f)
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
            moveTo(12.0014f, 12.1211f)
            verticalLineTo(12.5946f)
            moveTo(12.0014f, 12.5946f)
            lineTo(7f, 17.3579f)
            moveTo(12.0014f, 12.5946f)
            verticalLineTo(17.6367f)
            curveTo(12.0014f, 19.4656f, 12.0014f, 20.38f, 12.5732f, 20.651f)
            curveTo(13.1451f, 20.9219f, 13.8527f, 20.3428f, 15.2681f, 19.1844f)
            lineTo(15.7475f, 18.7921f)
            curveTo(16.5643f, 18.1236f, 16.9728f, 17.7894f, 16.9897f, 17.3387f)
        }
        }.build()

        return _bluetoothOff!!
    }

private var _bluetoothOff: ImageVector? = null
