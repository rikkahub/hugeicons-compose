package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JoinStraight: ImageVector
    get() {
        if (_joinStraight != null) {
            return _joinStraight!!
        }
        _joinStraight = ImageVector.Builder(
            name = "JoinStraight",
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
        moveTo(8.00018f, 22.0002f)
        horizontalLineTo(18.0002f)
        curveTo(19.8858f, 22.0002f, 20.8286f, 22.0002f, 21.4144f, 21.4145f)
        curveTo(22.0002f, 20.8287f, 22.0002f, 19.8859f, 22.0002f, 18.0002f)
        verticalLineTo(17.0002f)
        curveTo(22.0002f, 15.1146f, 22.0002f, 14.1718f, 21.4144f, 13.586f)
        curveTo(20.8286f, 13.0002f, 19.8858f, 13.0002f, 18.0002f, 13.0002f)
        lineTo(15.0002f, 13.0002f)
        curveTo(13.1146f, 13.0002f, 12.1718f, 13.0002f, 11.586f, 12.4145f)
        curveTo(11.0002f, 11.8287f, 11.0002f, 10.8859f, 11.0002f, 9.00024f)
        verticalLineTo(6.00024f)
        curveTo(11.0002f, 4.11463f, 11.0002f, 3.17182f, 10.4144f, 2.58603f)
        curveTo(9.82861f, 2.00024f, 8.8858f, 2.00024f, 7.00018f, 2.00024f)
        lineTo(6.00018f, 2.00024f)
        curveTo(4.11456f, 2.00024f, 3.17176f, 2.00024f, 2.58597f, 2.58603f)
        curveTo(2.00018f, 3.17182f, 2.00018f, 4.11463f, 2.00018f, 6.00024f)
        lineTo(2.00018f, 16.0002f)
        curveTo(2.00018f, 18.8287f, 2.00018f, 20.2429f, 2.87886f, 21.1216f)
        curveTo(3.75754f, 22.0002f, 5.17176f, 22.0002f, 8.00018f, 22.0002f)
        }
        }.build()

        return _joinStraight!!
    }

private var _joinStraight: ImageVector? = null
