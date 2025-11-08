package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Megaphone02: ImageVector
    get() {
        if (_megaphone02 != null) {
            return _megaphone02!!
        }
        _megaphone02 = ImageVector.Builder(
            name = "Megaphone02",
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
        moveTo(14.9263f, 4.41103f)
        lineTo(8.27352f, 7.60452f)
        curveTo(7.76151f, 7.85029f, 7.21443f, 7.91187f, 6.65675f, 7.78693f)
        curveTo(6.29177f, 7.70517f, 6.10926f, 7.66429f, 5.9623f, 7.64751f)
        curveTo(4.13743f, 7.43912f, 3f, 8.88342f, 3f, 10.5443f)
        verticalLineTo(11.4557f)
        curveTo(3f, 13.1166f, 4.13743f, 14.5609f, 5.9623f, 14.3525f)
        curveTo(6.10926f, 14.3357f, 6.29178f, 14.2948f, 6.65675f, 14.2131f)
        curveTo(7.21443f, 14.0881f, 7.76151f, 14.1497f, 8.27352f, 14.3955f)
        lineTo(14.9263f, 17.589f)
        curveTo(16.4534f, 18.3221f, 17.217f, 18.6886f, 18.0684f, 18.4029f)
        curveTo(18.9197f, 18.1172f, 19.2119f, 17.5041f, 19.7964f, 16.278f)
        curveTo(21.4012f, 12.9112f, 21.4012f, 9.08885f, 19.7964f, 5.72196f)
        curveTo(19.2119f, 4.49586f, 18.9197f, 3.88281f, 18.0684f, 3.5971f)
        curveTo(17.217f, 3.3114f, 16.4534f, 3.67794f, 14.9263f, 4.41103f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 17f)
        verticalLineTo(17.5f)
        curveTo(13f, 18.7841f, 13f, 19.4261f, 12.776f, 19.7886f)
        curveTo(12.4773f, 20.2719f, 11.9312f, 20.545f, 11.3653f, 20.4939f)
        curveTo(10.9409f, 20.4557f, 10.4273f, 20.0704f, 9.4f, 19.3f)
        lineTo(8.2f, 18.4f)
        curveTo(7.22253f, 17.6669f, 7f, 17.2218f, 7f, 16f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 14f)
        verticalLineTo(8f)
        }
        }.build()

        return _megaphone02!!
    }

private var _megaphone02: ImageVector? = null
