package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tiltify: ImageVector
    get() {
        if (_tiltify != null) {
            return _tiltify!!
        }
        _tiltify = ImageVector.Builder(
            name = "Tiltify",
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
        moveTo(19.75f, 5.5f)
        curveTo(19.75f, 6.32843f, 19.0784f, 7f, 18.25f, 7f)
        curveTo(17.4216f, 7f, 16.75f, 6.32843f, 16.75f, 5.5f)
        curveTo(16.75f, 4.67157f, 17.4216f, 4f, 18.25f, 4f)
        curveTo(19.0784f, 4f, 19.75f, 4.67157f, 19.75f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.1565f, 9.2571f)
        lineTo(7.15453f, 3.27281f)
        curveTo(6.23278f, 2.72131f, 5.03652f, 3.03305f, 4.5032f, 3.96374f)
        curveTo(3.9399f, 4.94674f, 4.35175f, 6.19982f, 5.38926f, 6.65964f)
        lineTo(9.55034f, 8.5f)
        lineTo(8.21738f, 19.608f)
        curveTo(8.12853f, 20.3484f, 8.70663f, 21f, 9.45232f, 21f)
        curveTo(10.0796f, 21f, 10.6087f, 20.5329f, 10.6865f, 19.9105f)
        lineTo(11.9779f, 9.57967f)
        lineTo(16.0806f, 11.398f)
        curveTo(16.6592f, 11.6544f, 17.3377f, 11.4117f, 17.6208f, 10.847f)
        curveTo(17.9064f, 10.2775f, 17.7041f, 9.58471f, 17.1565f, 9.2571f)
        }
        }.build()

        return _tiltify!!
    }

private var _tiltify: ImageVector? = null
