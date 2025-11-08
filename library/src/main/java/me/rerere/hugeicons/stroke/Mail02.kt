package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mail02: ImageVector
    get() {
        if (_mail02 != null) {
            return _mail02!!
        }
        _mail02 = ImageVector.Builder(
            name = "Mail02",
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
        moveTo(7f, 8.5f)
        lineTo(9.94202f, 10.2394f)
        curveTo(11.6572f, 11.2535f, 12.3428f, 11.2535f, 14.058f, 10.2394f)
        lineTo(17f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.01576f, 13.4756f)
        curveTo(2.08114f, 16.5411f, 2.11382f, 18.0739f, 3.24495f, 19.2093f)
        curveTo(4.37608f, 20.3448f, 5.95033f, 20.3843f, 9.09883f, 20.4634f)
        curveTo(11.0393f, 20.5122f, 12.9607f, 20.5122f, 14.9012f, 20.4634f)
        curveTo(18.0497f, 20.3843f, 19.6239f, 20.3448f, 20.755f, 19.2093f)
        curveTo(21.8862f, 18.0739f, 21.9189f, 16.5411f, 21.9842f, 13.4756f)
        curveTo(22.0053f, 12.4899f, 22.0053f, 11.51f, 21.9842f, 10.5244f)
        curveTo(21.9189f, 7.45883f, 21.8862f, 5.92606f, 20.755f, 4.79063f)
        curveTo(19.6239f, 3.6552f, 18.0497f, 3.61565f, 14.9012f, 3.53654f)
        curveTo(12.9607f, 3.48778f, 11.0393f, 3.48778f, 9.09882f, 3.53653f)
        curveTo(5.95033f, 3.61563f, 4.37608f, 3.65518f, 3.24495f, 4.79062f)
        curveTo(2.11382f, 5.92605f, 2.08113f, 7.45882f, 2.01576f, 10.5243f)
        curveTo(1.99474f, 11.51f, 1.99474f, 12.4899f, 2.01576f, 13.4756f)
        }
        }.build()

        return _mail02!!
    }

private var _mail02: ImageVector? = null
