package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chimney: ImageVector
    get() {
        if (_chimney != null) {
            return _chimney!!
        }
        _chimney = ImageVector.Builder(
            name = "Chimney",
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
        moveTo(15.5f, 22f)
        lineTo(14.3835f, 16.9755f)
        curveTo(13.7962f, 14.3331f, 13.5f, 11.6344f, 13.5f, 8.92749f)
        curveTo(13.5f, 8.41525f, 13.0847f, 8f, 12.5725f, 8f)
        horizontalLineTo(7.42749f)
        curveTo(6.91525f, 8f, 6.5f, 8.41525f, 6.5f, 8.92749f)
        curveTo(6.5f, 11.6344f, 6.20375f, 14.3331f, 5.61655f, 16.9755f)
        lineTo(4.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 2f)
        horizontalLineTo(13f)
        curveTo(11.3431f, 2f, 10f, 3.34315f, 10f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 2f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 5f)
        horizontalLineTo(19f)
        }
        }.build()

        return _chimney!!
    }

private var _chimney: ImageVector? = null
