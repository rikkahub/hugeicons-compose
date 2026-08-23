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

val HugeIcons.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = ImageVector.Builder(
            name = "BluetoothConnected",
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
            moveTo(12.25f, 11.9996f)
            lineTo(15.8601f, 8.56141f)
            curveTo(16.6245f, 7.83346f, 17.0066f, 7.46948f, 16.9897f, 7.01881f)
            curveTo(16.9728f, 6.56813f, 16.5643f, 6.23388f, 15.7475f, 5.56538f)
            lineTo(15.2681f, 5.17304f)
            curveTo(13.8527f, 4.01474f, 13.1451f, 3.43559f, 12.5732f, 3.70653f)
            curveTo(12.0014f, 3.97746f, 12.0014f, 4.89191f, 12.0014f, 6.7208f)
            verticalLineTo(11.7629f)
            moveTo(12.25f, 11.9996f)
            lineTo(12.0014f, 12.2364f)
            moveTo(12.25f, 11.9996f)
            lineTo(15.8601f, 15.4379f)
            curveTo(16.6245f, 16.1658f, 17.0066f, 16.5298f, 16.9897f, 16.9805f)
            curveTo(16.9728f, 17.4311f, 16.5643f, 17.7654f, 15.7475f, 18.4339f)
            lineTo(15.2681f, 18.8262f)
            curveTo(13.8527f, 19.9845f, 13.1451f, 20.5637f, 12.5732f, 20.2928f)
            curveTo(12.0014f, 20.0218f, 12.0014f, 19.1074f, 12.0014f, 17.2785f)
            verticalLineTo(12.2364f)
            moveTo(12.25f, 11.9996f)
            lineTo(12.0014f, 11.7629f)
            moveTo(12.0014f, 12.2364f)
            lineTo(7f, 16.9996f)
            moveTo(12.0014f, 12.2364f)
            verticalLineTo(11.7629f)
            moveTo(12.0014f, 11.7629f)
            lineTo(7f, 6.99962f)
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
            moveTo(17f, 12f)
            horizontalLineTo(18f)
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
            moveTo(7f, 12f)
            horizontalLineTo(6f)
        }
        }.build()

        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
