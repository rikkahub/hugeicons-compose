package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UsbMemory02: ImageVector
    get() {
        if (_usbMemory02 != null) {
            return _usbMemory02!!
        }
        _usbMemory02 = ImageVector.Builder(
            name = "UsbMemory02",
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
        moveTo(7f, 11.5f)
        curveTo(7f, 9.61438f, 7f, 8.67157f, 7.58579f, 8.08579f)
        curveTo(8.17157f, 7.5f, 9.11438f, 7.5f, 11f, 7.5f)
        horizontalLineTo(13f)
        curveTo(14.8856f, 7.5f, 15.8284f, 7.5f, 16.4142f, 8.08579f)
        curveTo(17f, 8.67157f, 17f, 9.61438f, 17f, 11.5f)
        verticalLineTo(17f)
        curveTo(17f, 17.9293f, 17f, 18.394f, 16.9231f, 18.7804f)
        curveTo(16.6075f, 20.3671f, 15.3671f, 21.6075f, 13.7804f, 21.9231f)
        curveTo(13.394f, 22f, 12.9293f, 22f, 12f, 22f)
        curveTo(11.0707f, 22f, 10.606f, 22f, 10.2196f, 21.9231f)
        curveTo(8.63288f, 21.6075f, 7.39249f, 20.3671f, 7.07686f, 18.7804f)
        curveTo(7f, 18.394f, 7f, 17.9293f, 7f, 17f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 7.5f)
        verticalLineTo(5.5f)
        curveTo(15.5f, 4.09554f, 15.5f, 3.39331f, 15.1629f, 2.88886f)
        curveTo(15.017f, 2.67048f, 14.8295f, 2.48298f, 14.6111f, 2.33706f)
        curveTo(14.1067f, 2f, 13.4045f, 2f, 12f, 2f)
        curveTo(10.5955f, 2f, 9.89331f, 2f, 9.38886f, 2.33706f)
        curveTo(9.17048f, 2.48298f, 8.98298f, 2.67048f, 8.83706f, 2.88886f)
        curveTo(8.5f, 3.39331f, 8.5f, 4.09554f, 8.5f, 5.5f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 4.5f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _usbMemory02!!
    }

private var _usbMemory02: ImageVector? = null
