package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) {
            return _fileMusic!!
        }
        _fileMusic = ImageVector.Builder(
            name = "FileMusic",
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
        moveTo(19.9995f, 11.0039f)
        curveTo(19.9995f, 11.0039f, 19.9995f, 9.43383f, 19.8473f, 9.06613f)
        curveTo(19.695f, 8.69843f, 19.406f, 8.40927f, 18.8279f, 7.83096f)
        lineTo(14.0914f, 3.09236f)
        curveTo(13.5925f, 2.59325f, 13.3431f, 2.3437f, 13.034f, 2.19583f)
        curveTo(12.9698f, 2.16508f, 12.9039f, 2.13778f, 12.8367f, 2.11406f)
        curveTo(12.5137f, 2f, 12.1609f, 2f, 11.4554f, 2f)
        curveTo(8.21033f, 2f, 6.58782f, 2f, 5.48884f, 2.88646f)
        curveTo(5.26683f, 3.06554f, 5.06459f, 3.26787f, 4.88559f, 3.48998f)
        curveTo(3.99951f, 4.58943f, 3.99951f, 6.21265f, 3.99951f, 9.45908f)
        verticalLineTo(14.0052f)
        curveTo(3.99951f, 17.7781f, 3.99951f, 19.6645f, 5.17108f, 20.8366f)
        curveTo(6.11417f, 21.7801f, 7.51994f, 21.9641f, 9.99951f, 22f)
        moveTo(12.9995f, 2.50022f)
        verticalLineTo(3.00043f)
        curveTo(12.9995f, 5.83009f, 12.9995f, 7.24492f, 13.8782f, 8.12398f)
        curveTo(14.7569f, 9.00304f, 16.1711f, 9.00304f, 18.9995f, 9.00304f)
        horizontalLineTo(19.4995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3966f, 19.7446f)
        curveTo(17.3966f, 20.9885f, 16.4123f, 21.9969f, 15.198f, 21.9969f)
        curveTo(13.9838f, 21.9969f, 12.9995f, 20.9885f, 12.9995f, 19.7446f)
        curveTo(12.9995f, 18.5007f, 13.9838f, 17.4923f, 15.198f, 17.4923f)
        curveTo(16.4123f, 17.4923f, 17.3966f, 18.5007f, 17.3966f, 19.7446f)
        moveTo(17.3966f, 19.7446f)
        verticalLineTo(14f)
        curveTo(17.6167f, 14.4963f, 18.7036f, 16.6999f, 20.0005f, 16.6999f)
        }
        }.build()

        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
