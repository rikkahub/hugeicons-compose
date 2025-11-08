package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = ImageVector.Builder(
            name = "Usb",
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
        moveTo(15.5f, 6f)
        verticalLineTo(5.5f)
        curveTo(15.5f, 4.09554f, 15.5f, 3.39331f, 15.1629f, 2.88886f)
        curveTo(15.017f, 2.67048f, 14.8295f, 2.48298f, 14.6111f, 2.33706f)
        curveTo(14.1067f, 2f, 13.4045f, 2f, 12f, 2f)
        curveTo(10.5955f, 2f, 9.89331f, 2f, 9.38886f, 2.33706f)
        curveTo(9.17048f, 2.48298f, 8.98298f, 2.67048f, 8.83706f, 2.88886f)
        curveTo(8.5f, 3.39331f, 8.5f, 4.09554f, 8.5f, 5.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00446f, 7.11331f)
        curveTo(5.93719f, 6.24273f, 6.63957f, 5.5f, 7.53014f, 5.5f)
        horizontalLineTo(16.4699f)
        curveTo(17.3604f, 5.5f, 18.0628f, 6.24273f, 17.9955f, 7.11331f)
        lineTo(17.8117f, 9.49197f)
        curveTo(17.6796f, 11.2019f, 17.1011f, 12.8498f, 16.132f, 14.2773f)
        lineTo(15.5312f, 15.1622f)
        curveTo(14.9638f, 15.9979f, 14.0077f, 16.5f, 12.9838f, 16.5f)
        horizontalLineTo(11.0162f)
        curveTo(9.99228f, 16.5f, 9.03617f, 15.9979f, 8.46881f, 15.1622f)
        lineTo(7.86803f, 14.2773f)
        curveTo(6.89885f, 12.8498f, 6.32041f, 11.2019f, 6.18827f, 9.49197f)
        lineTo(6.00446f, 7.11331f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8.5f)
        horizontalLineTo(13f)
        }
        }.build()

        return _usb!!
    }

private var _usb: ImageVector? = null
