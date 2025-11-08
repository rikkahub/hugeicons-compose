package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link03: ImageVector
    get() {
        if (_link03 != null) {
            return _link03!!
        }
        _link03 = ImageVector.Builder(
            name = "Link03",
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
        moveTo(9.521f, 14.4356f)
        lineTo(14.434f, 9.52258f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.569f, 15.1084f)
        curveTo(13.3087f, 16.2488f, 13.1113f, 17.4178f, 12.2568f, 18.2723f)
        lineTo(9.26158f, 21.2675f)
        curveTo(8.28318f, 22.2459f, 6.69687f, 22.2459f, 5.71847f, 21.2675f)
        lineTo(2.73234f, 18.2814f)
        curveTo(1.75393f, 17.303f, 1.75393f, 15.7167f, 2.73234f, 14.7383f)
        lineTo(5.72755f, 11.743f)
        curveTo(6.42949f, 11.0411f, 7.76361f, 10.6357f, 8.91007f, 11.4659f)
        moveTo(15.1088f, 12.5685f)
        curveTo(16.2492f, 13.3082f, 17.4182f, 13.1109f, 18.2727f, 12.2564f)
        lineTo(21.2679f, 9.26114f)
        curveTo(22.2463f, 8.28273f, 22.2463f, 6.69641f, 21.2679f, 5.718f)
        lineTo(18.2818f, 2.73185f)
        curveTo(17.3034f, 1.75344f, 15.7171f, 1.75344f, 14.7387f, 2.73185f)
        lineTo(11.7434f, 5.72709f)
        curveTo(11.0415f, 6.42903f, 10.6362f, 7.76315f, 11.4664f, 8.90962f)
        }
        }.build()

        return _link03!!
    }

private var _link03: ImageVector? = null
