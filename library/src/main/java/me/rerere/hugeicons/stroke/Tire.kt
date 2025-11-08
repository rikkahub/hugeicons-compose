package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = ImageVector.Builder(
            name = "Tire",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 12f)
        curveTo(18.5f, 15.5899f, 15.5899f, 18.5f, 12f, 18.5f)
        curveTo(8.41015f, 18.5f, 5.5f, 15.5899f, 5.5f, 12f)
        curveTo(5.5f, 8.41015f, 8.41015f, 5.5f, 12f, 5.5f)
        curveTo(15.5899f, 5.5f, 18.5f, 8.41015f, 18.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6294f, 8.75f)
        lineTo(13.2993f, 11.25f)
        moveTo(10.7012f, 12.75f)
        lineTo(6.37109f, 15.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6294f, 15.25f)
        lineTo(13.2993f, 12.75f)
        moveTo(10.7012f, 11.25f)
        lineTo(6.37109f, 8.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.5f)
        verticalLineTo(10.5f)
        moveTo(12f, 13.5f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12f, 13.5f)
        curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
        curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12f, 10.5f)
        curveTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12f)
        }
        }.build()

        return _tire!!
    }

private var _tire: ImageVector? = null
