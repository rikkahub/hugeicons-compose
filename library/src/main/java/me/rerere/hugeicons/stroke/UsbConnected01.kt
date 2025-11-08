package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UsbConnected01: ImageVector
    get() {
        if (_usbConnected01 != null) {
            return _usbConnected01!!
        }
        _usbConnected01 = ImageVector.Builder(
            name = "UsbConnected01",
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
        moveTo(10.9838f, 16.5f)
        horizontalLineTo(9.01625f)
        curveTo(7.99228f, 16.5f, 7.03617f, 15.9979f, 6.46881f, 15.1622f)
        lineTo(5.86803f, 14.2773f)
        curveTo(4.89885f, 12.8498f, 4.32041f, 11.2019f, 4.18827f, 9.49197f)
        lineTo(4.00446f, 7.11331f)
        curveTo(3.93719f, 6.24273f, 4.63957f, 5.5f, 5.53014f, 5.5f)
        horizontalLineTo(14.4699f)
        curveTo(15.3604f, 5.5f, 16.0628f, 6.24273f, 15.9955f, 7.11331f)
        lineTo(15.927f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 6f)
        verticalLineTo(5.5f)
        curveTo(13.5f, 4.09554f, 13.5f, 3.39331f, 13.1629f, 2.88886f)
        curveTo(13.017f, 2.67048f, 12.8295f, 2.48298f, 12.6111f, 2.33706f)
        curveTo(12.1067f, 2f, 11.4045f, 2f, 10f, 2f)
        curveTo(8.59554f, 2f, 7.89331f, 2f, 7.38886f, 2.33706f)
        curveTo(7.17048f, 2.48298f, 6.98298f, 2.67048f, 6.83706f, 2.88886f)
        curveTo(6.5f, 3.39331f, 6.5f, 4.09554f, 6.5f, 5.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8.5f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        curveTo(12f, 13.5f, 13f, 13.5f, 14f, 15.5f)
        curveTo(14f, 15.5f, 17.1765f, 10.5f, 20f, 9.5f)
        }
        }.build()

        return _usbConnected01!!
    }

private var _usbConnected01: ImageVector? = null
