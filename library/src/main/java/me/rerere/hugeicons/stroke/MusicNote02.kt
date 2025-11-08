package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MusicNote02: ImageVector
    get() {
        if (_musicNote02 != null) {
            return _musicNote02!!
        }
        _musicNote02 = ImageVector.Builder(
            name = "MusicNote02",
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
        moveTo(11f, 7.13678f)
        verticalLineTo(17f)
        moveTo(11f, 7.13678f)
        curveTo(12.8928f, 8.81698f, 14.5706f, 10.0042f, 16.0063f, 10.6818f)
        curveTo(16.6937f, 11.0062f, 17.3165f, 11.0682f, 18.0198f, 10.7552f)
        curveTo(19.7751f, 9.97419f, 21f, 8.20629f, 21f, 6.15045f)
        curveTo(19.0715f, 7.50911f, 16.6876f, 6.77163f, 14.6847f, 5.50548f)
        curveTo(13.0454f, 4.46918f, 12.2258f, 3.95102f, 11.8569f, 4.00364f)
        curveTo(11.5781f, 4.0434f, 11.4283f, 4.1242f, 11.244f, 4.33421f)
        curveTo(11f, 4.61216f, 11f, 5.4537f, 11f, 7.13678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 17f)
        curveTo(11f, 19.2091f, 9.20914f, 21f, 7f, 21f)
        curveTo(4.79086f, 21f, 3f, 19.2091f, 3f, 17f)
        curveTo(3f, 14.7909f, 4.79086f, 13f, 7f, 13f)
        curveTo(9.20914f, 13f, 11f, 14.7909f, 11f, 17f)
        }
        }.build()

        return _musicNote02!!
    }

private var _musicNote02: ImageVector? = null
