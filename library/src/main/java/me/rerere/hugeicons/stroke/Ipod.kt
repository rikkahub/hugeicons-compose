package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ipod: ImageVector
    get() {
        if (_ipod != null) {
            return _ipod!!
        }
        _ipod = ImageVector.Builder(
            name = "Ipod",
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
        moveTo(19.5f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(19.5f, 6.74142f, 19.5f, 4.86213f, 18.5711f, 3.60746f)
        curveTo(18.4225f, 3.40678f, 18.2587f, 3.22119f, 18.0817f, 3.0528f)
        curveTo(16.9746f, 2f, 15.3164f, 2f, 12f, 2f)
        curveTo(8.68361f, 2f, 7.02541f, 2f, 5.91834f, 3.0528f)
        curveTo(5.74128f, 3.22119f, 5.57752f, 3.40678f, 5.42894f, 3.60746f)
        curveTo(4.5f, 4.86213f, 4.5f, 6.74142f, 4.5f, 10.5f)
        verticalLineTo(13.5f)
        curveTo(4.5f, 17.2586f, 4.5f, 19.1379f, 5.42894f, 20.3925f)
        curveTo(5.57752f, 20.5932f, 5.74128f, 20.7788f, 5.91834f, 20.9472f)
        curveTo(7.02541f, 22f, 8.68361f, 22f, 12f, 22f)
        curveTo(15.3164f, 22f, 16.9746f, 22f, 18.0817f, 20.9472f)
        curveTo(18.2587f, 20.7788f, 18.4225f, 20.5932f, 18.5711f, 20.3925f)
        curveTo(19.5f, 19.1379f, 19.5f, 17.2586f, 19.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        curveTo(15f, 17.6569f, 13.6569f, 19f, 12f, 19f)
        curveTo(10.3431f, 19f, 9f, 17.6569f, 9f, 16f)
        curveTo(9f, 14.3431f, 10.3431f, 13f, 12f, 13f)
        curveTo(13.6569f, 13f, 15f, 14.3431f, 15f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 10f)
        horizontalLineTo(19.5f)
        }
        }.build()

        return _ipod!!
    }

private var _ipod: ImageVector? = null
