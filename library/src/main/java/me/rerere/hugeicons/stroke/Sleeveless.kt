package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sleeveless: ImageVector
    get() {
        if (_sleeveless != null) {
            return _sleeveless!!
        }
        _sleeveless = ImageVector.Builder(
            name = "Sleeveless",
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
        moveTo(12f, 7.31544f)
        curveTo(13.6569f, 7.31544f, 15f, 5.20251f, 15f, 2f)
        curveTo(16.1024f, 2.42616f, 17.4582f, 2.40398f, 17.4054f, 3.76407f)
        curveTo(17.353f, 5.11247f, 17.7915f, 6.82713f, 19.1673f, 8.11699f)
        curveTo(19.789f, 8.6999f, 20f, 8.96542f, 20f, 9.79955f)
        verticalLineTo(16.4966f)
        curveTo(20f, 18.7746f, 20f, 19.9135f, 19.2678f, 20.6212f)
        curveTo(17.1917f, 22.6276f, 6.45239f, 22.2836f, 4.73223f, 20.6212f)
        curveTo(4f, 19.9135f, 4f, 18.7746f, 4f, 16.4966f)
        verticalLineTo(9.79955f)
        curveTo(4f, 8.96542f, 4.211f, 8.6999f, 4.83274f, 8.11699f)
        curveTo(6.20853f, 6.82713f, 6.647f, 5.11247f, 6.59461f, 3.76407f)
        curveTo(6.54178f, 2.40398f, 7.89761f, 2.42616f, 9f, 2f)
        curveTo(9f, 5.20251f, 10.3431f, 7.31544f, 12f, 7.31544f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        curveTo(14.2005f, 2.62236f, 13.1502f, 3f, 12f, 3f)
        curveTo(10.8498f, 3f, 9.79952f, 2.62236f, 9f, 2f)
        }
        }.build()

        return _sleeveless!!
    }

private var _sleeveless: ImageVector? = null
