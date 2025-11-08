package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Deviantart: ImageVector
    get() {
        if (_deviantart != null) {
            return _deviantart!!
        }
        _deviantart = ImageVector.Builder(
            name = "Deviantart",
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
        moveTo(18f, 2f)
        curveTo(18.8273f, 2f, 19f, 2.17267f, 19f, 3f)
        verticalLineTo(6.13854f)
        curveTo(19f, 6.44216f, 18.9987f, 6.44633f, 18.8289f, 6.698f)
        lineTo(15.5528f, 11.5517f)
        curveTo(15.0898f, 12.2375f, 14.8584f, 12.5804f, 14.9994f, 12.8458f)
        curveTo(15.1404f, 13.1111f, 15.5541f, 13.1111f, 16.3816f, 13.1111f)
        horizontalLineTo(18f)
        curveTo(18.8273f, 13.1111f, 19f, 13.2838f, 19f, 14.1111f)
        verticalLineTo(16.5556f)
        curveTo(19f, 17.3829f, 18.8273f, 17.5556f, 18f, 17.5556f)
        horizontalLineTo(12.5626f)
        curveTo(11.5215f, 17.5556f, 11.4872f, 17.5738f, 10.9048f, 18.4367f)
        lineTo(8.79735f, 21.5594f)
        curveTo(8.50616f, 21.9909f, 8.48899f, 22f, 7.96846f, 22f)
        horizontalLineTo(6f)
        curveTo(5.17267f, 22f, 5f, 21.8273f, 5f, 21f)
        verticalLineTo(17.8615f)
        curveTo(5f, 17.5578f, 5.00128f, 17.5537f, 5.17114f, 17.302f)
        lineTo(8.44724f, 12.4483f)
        curveTo(8.91018f, 11.7625f, 9.14164f, 11.4196f, 9.00062f, 11.1542f)
        curveTo(8.85959f, 10.8889f, 8.44585f, 10.8889f, 7.61838f, 10.8889f)
        horizontalLineTo(6f)
        curveTo(5.17267f, 10.8889f, 5f, 10.7162f, 5f, 9.88889f)
        verticalLineTo(7.44445f)
        curveTo(5f, 6.61711f, 5.17267f, 6.44444f, 6f, 6.44444f)
        horizontalLineTo(11.4374f)
        curveTo(12.4785f, 6.44444f, 12.5128f, 6.4262f, 13.0952f, 5.56326f)
        lineTo(15.2027f, 2.44059f)
        curveTo(15.4938f, 2.00912f, 15.511f, 2f, 16.0315f, 2f)
        horizontalLineTo(18f)
        }
        }.build()

        return _deviantart!!
    }

private var _deviantart: ImageVector? = null
