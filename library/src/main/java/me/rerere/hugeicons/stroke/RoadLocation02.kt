package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RoadLocation02: ImageVector
    get() {
        if (_roadLocation02 != null) {
            return _roadLocation02!!
        }
        _roadLocation02 = ImageVector.Builder(
            name = "RoadLocation02",
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
        moveTo(18.5f, 15.082f)
        lineTo(16.5f, 15.082f)
        moveTo(13f, 15.082f)
        lineTo(11f, 15.082f)
        moveTo(7.5f, 15.082f)
        lineTo(5.5f, 15.082f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5.93261f)
        curveTo(16f, 8.60703f, 13.0435f, 10.548f, 12.214f, 11.0244f)
        curveTo(12.0802f, 11.1012f, 11.9198f, 11.1012f, 11.786f, 11.0244f)
        curveTo(10.9565f, 10.548f, 8f, 8.60703f, 8f, 5.93261f)
        curveTo(8f, 3.88203f, 9.79086f, 2.08203f, 12f, 2.08203f)
        curveTo(14.2091f, 2.08203f, 16f, 3.88203f, 16f, 5.93261f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6.08203f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 8.08203f)
        curveTo(19.7745f, 8.23191f, 20.3588f, 8.48205f, 20.8284f, 8.89953f)
        curveTo(22f, 9.94106f, 22f, 11.6174f, 22f, 14.97f)
        curveTo(22f, 18.3227f, 22f, 19.999f, 20.8284f, 21.0405f)
        curveTo(19.6569f, 22.082f, 17.7712f, 22.082f, 14f, 22.082f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 22.082f, 4.34315f, 22.082f, 3.17157f, 21.0405f)
        curveTo(2f, 19.999f, 2f, 18.3226f, 2f, 14.97f)
        curveTo(2f, 11.6174f, 2f, 9.94106f, 3.17157f, 8.89952f)
        curveTo(3.64118f, 8.48205f, 4.2255f, 8.23191f, 5f, 8.08203f)
        }
        }.build()

        return _roadLocation02!!
    }

private var _roadLocation02: ImageVector? = null
