package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkSquare02: ImageVector
    get() {
        if (_linkSquare02 != null) {
            return _linkSquare02!!
        }
        _linkSquare02 = ImageVector.Builder(
            name = "LinkSquare02",
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
        moveTo(11.0991f, 3.00012f)
        curveTo(7.45013f, 3.00669f, 5.53932f, 3.09629f, 4.31817f, 4.31764f)
        curveTo(3.00034f, 5.63568f, 3.00034f, 7.75704f, 3.00034f, 11.9997f)
        curveTo(3.00034f, 16.2424f, 3.00034f, 18.3638f, 4.31817f, 19.6818f)
        curveTo(5.63599f, 20.9999f, 7.75701f, 20.9999f, 11.9991f, 20.9999f)
        curveTo(16.241f, 20.9999f, 18.3621f, 20.9999f, 19.6799f, 19.6818f)
        curveTo(20.901f, 18.4605f, 20.9906f, 16.5493f, 20.9972f, 12.8998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.556f, 3.49612f)
        lineTo(11.0487f, 13.0586f)
        moveTo(20.556f, 3.49612f)
        curveTo(20.062f, 3.00151f, 16.7343f, 3.04761f, 16.0308f, 3.05762f)
        moveTo(20.556f, 3.49612f)
        curveTo(21.05f, 3.99074f, 21.0039f, 7.32273f, 20.9939f, 8.02714f)
        }
        }.build()

        return _linkSquare02!!
    }

private var _linkSquare02: ImageVector? = null
