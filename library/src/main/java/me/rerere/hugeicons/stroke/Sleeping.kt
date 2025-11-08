package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sleeping: ImageVector
    get() {
        if (_sleeping != null) {
            return _sleeping!!
        }
        _sleeping = ImageVector.Builder(
            name = "Sleeping",
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
        moveTo(13f, 2.04938f)
        curveTo(12.6711f, 2.01672f, 12.3375f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.3151f, 21.9311f, 10.6462f, 21.8f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        horizontalLineTo(8.70711f)
        curveTo(8.25435f, 11f, 7.82014f, 10.8201f, 7.5f, 10.5f)
        moveTo(14f, 11f)
        horizontalLineTo(15.2929f)
        curveTo(15.7456f, 11f, 16.1799f, 10.8201f, 16.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 2f)
        horizontalLineTo(19.9474f)
        curveTo(20.5675f, 2f, 20.8775f, 2f, 20.9601f, 2.20009f)
        curveTo(21.0427f, 2.40019f, 20.8317f, 2.64023f, 20.4098f, 3.1203f)
        lineTo(17.9846f, 5.8797f)
        curveTo(17.5627f, 6.35977f, 17.3517f, 6.59981f, 17.4343f, 6.79991f)
        curveTo(17.5169f, 7f, 17.8269f, 7f, 18.447f, 7f)
        horizontalLineTo(21f)
        }
        }.build()

        return _sleeping!!
    }

private var _sleeping: ImageVector? = null
