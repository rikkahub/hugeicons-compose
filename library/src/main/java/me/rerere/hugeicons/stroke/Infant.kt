package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Infant: ImageVector
    get() {
        if (_infant != null) {
            return _infant!!
        }
        _infant = ImageVector.Builder(
            name = "Infant",
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
        moveTo(19.9504f, 10.8961f)
        curveTo(19.5049f, 14.8926f, 16.1153f, 18f, 12f, 18f)
        curveTo(7.88465f, 18f, 4.49508f, 14.8926f, 4.04963f, 10.8961f)
        curveTo(3.87943f, 10.9632f, 3.69402f, 11f, 3.5f, 11f)
        curveTo(2.67157f, 11f, 2f, 10.3284f, 2f, 9.5f)
        curveTo(2f, 8.67157f, 2.67157f, 8f, 3.5f, 8f)
        curveTo(3.75626f, 8f, 3.99751f, 8.06426f, 4.20851f, 8.17754f)
        curveTo(5.03332f, 4.63736f, 8.20867f, 2f, 12f, 2f)
        curveTo(15.7913f, 2f, 18.9667f, 4.63736f, 19.7915f, 8.17755f)
        curveTo(20.0025f, 8.06426f, 20.2437f, 8f, 20.5f, 8f)
        curveTo(21.3284f, 8f, 22f, 8.67157f, 22f, 9.5f)
        curveTo(22f, 10.3284f, 21.3284f, 11f, 20.5f, 11f)
        curveTo(20.306f, 11f, 20.1206f, 10.9632f, 19.9504f, 10.8961f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(12.5523f, 15f, 13f, 14.5523f, 13f, 14f)
        horizontalLineTo(11f)
        curveTo(11f, 14.5523f, 11.4477f, 15f, 12f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 22f)
        curveTo(18f, 20.208f, 17.2144f, 18.5994f, 15.9687f, 17.5f)
        moveTo(6f, 22f)
        curveTo(6f, 20.208f, 6.78563f, 18.5994f, 8.03126f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(13f, 2f, 14f, 2.89543f, 14f, 4f)
        curveTo(14f, 5.10457f, 13f, 6f, 12f, 6f)
        curveTo(11.5f, 6f, 10.9246f, 5.81669f, 10.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10f)
        verticalLineTo(10.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        verticalLineTo(10.01f)
        }
        }.build()

        return _infant!!
    }

private var _infant: ImageVector? = null
