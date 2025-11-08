package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframesMultiple: ImageVector
    get() {
        if (_keyframesMultiple != null) {
            return _keyframesMultiple!!
        }
        _keyframesMultiple = ImageVector.Builder(
            name = "KeyframesMultiple",
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
        moveTo(12.4417f, 14.553f)
        lineTo(10.1358f, 17.2531f)
        curveTo(9.14121f, 18.4177f, 8.6439f, 19f, 8f, 19f)
        curveTo(7.3561f, 19f, 6.85879f, 18.4177f, 5.86418f, 17.2531f)
        lineTo(3.55829f, 14.553f)
        curveTo(2.51943f, 13.3366f, 2f, 12.7284f, 2f, 12f)
        curveTo(2f, 11.2716f, 2.51943f, 10.6634f, 3.55829f, 9.44699f)
        lineTo(5.86418f, 6.74694f)
        curveTo(6.85879f, 5.58231f, 7.3561f, 5f, 8f, 5f)
        curveTo(8.6439f, 5f, 9.14121f, 5.58231f, 10.1358f, 6.74694f)
        lineTo(12.4417f, 9.44699f)
        curveTo(13.4806f, 10.6634f, 14f, 11.2716f, 14f, 12f)
        curveTo(14f, 12.7284f, 13.4806f, 13.3366f, 12.4417f, 14.553f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        lineTo(16.5118f, 14.6032f)
        curveTo(17.5039f, 13.361f, 18f, 12.7398f, 18f, 12f)
        curveTo(18f, 11.2602f, 17.5039f, 10.639f, 16.5118f, 9.39683f)
        lineTo(13f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        lineTo(20.5118f, 14.6032f)
        curveTo(21.5039f, 13.361f, 22f, 12.7398f, 22f, 12f)
        curveTo(22f, 11.2602f, 21.5039f, 10.639f, 20.5118f, 9.39683f)
        lineTo(17f, 5f)
        }
        }.build()

        return _keyframesMultiple!!
    }

private var _keyframesMultiple: ImageVector? = null
