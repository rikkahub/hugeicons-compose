package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = ImageVector.Builder(
            name = "Kite",
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
        moveTo(12f, 2f)
        curveTo(7.71429f, 4.40741f, 4f, 8f, 2f, 14f)
        curveTo(5f, 12f, 9f, 11f, 12f, 14f)
        curveTo(15f, 11f, 19f, 12f, 22f, 14f)
        curveTo(20f, 8f, 16.2857f, 4.40741f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 14f)
        curveTo(10.3912f, 14.7327f, 7.69631f, 15.8188f, 8.02333f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.6716f, 14f)
        curveTo(13.0709f, 17.203f, 9.38762f, 19.5f, 11.9053f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        curveTo(14f, 14f, 13.5f, 18.5f, 15f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7.00036f)
        curveTo(10.2913f, 6.73558f, 10.6667f, 6.52338f, 11.0134f, 6.36376f)
        curveTo(11.379f, 6.19547f, 11.5618f, 6.11133f, 12f, 6.11133f)
        curveTo(12.4382f, 6.11133f, 12.621f, 6.19547f, 12.9866f, 6.36376f)
        curveTo(13.3333f, 6.52338f, 13.7087f, 6.73558f, 14f, 7.00036f)
        }
        }.build()

        return _kite!!
    }

private var _kite: ImageVector? = null
