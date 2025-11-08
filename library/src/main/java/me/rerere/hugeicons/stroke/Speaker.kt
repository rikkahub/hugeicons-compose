package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = ImageVector.Builder(
            name = "Speaker",
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
        moveTo(20.5f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(20.5f, 6.74142f, 20.5f, 4.86213f, 19.4472f, 3.60746f)
        curveTo(19.2788f, 3.40678f, 19.0932f, 3.22119f, 18.8925f, 3.0528f)
        curveTo(17.6379f, 2f, 15.7586f, 2f, 12f, 2f)
        curveTo(8.24142f, 2f, 6.36213f, 2f, 5.10746f, 3.0528f)
        curveTo(4.90678f, 3.22119f, 4.72119f, 3.40678f, 4.5528f, 3.60746f)
        curveTo(3.5f, 4.86213f, 3.5f, 6.74142f, 3.5f, 10.5f)
        verticalLineTo(13.5f)
        curveTo(3.5f, 17.2586f, 3.5f, 19.1379f, 4.5528f, 20.3925f)
        curveTo(4.72119f, 20.5932f, 4.90678f, 20.7788f, 5.10746f, 20.9472f)
        curveTo(6.36213f, 22f, 8.24142f, 22f, 12f, 22f)
        curveTo(15.7586f, 22f, 17.6379f, 22f, 18.8925f, 20.9472f)
        curveTo(19.0932f, 20.7788f, 19.2788f, 20.5932f, 19.4472f, 20.3925f)
        curveTo(20.5f, 19.1379f, 20.5f, 17.2586f, 20.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 15f)
        curveTo(15.5f, 16.933f, 13.933f, 18.5f, 12f, 18.5f)
        curveTo(10.067f, 18.5f, 8.5f, 16.933f, 8.5f, 15f)
        curveTo(8.5f, 13.067f, 10.067f, 11.5f, 12f, 11.5f)
        curveTo(13.933f, 11.5f, 15.5f, 13.067f, 15.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7f)
        curveTo(13.5f, 7.82843f, 12.8284f, 8.5f, 12f, 8.5f)
        curveTo(11.1716f, 8.5f, 10.5f, 7.82843f, 10.5f, 7f)
        curveTo(10.5f, 6.17157f, 11.1716f, 5.5f, 12f, 5.5f)
        curveTo(12.8284f, 5.5f, 13.5f, 6.17157f, 13.5f, 7f)
        }
        }.build()

        return _speaker!!
    }

private var _speaker: ImageVector? = null
