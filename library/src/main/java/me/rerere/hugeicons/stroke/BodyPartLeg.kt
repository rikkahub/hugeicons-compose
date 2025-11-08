package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BodyPartLeg: ImageVector
    get() {
        if (_bodyPartLeg != null) {
            return _bodyPartLeg!!
        }
        _bodyPartLeg = ImageVector.Builder(
            name = "BodyPartLeg",
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
        moveTo(5.00183f, 2f)
        curveTo(7.69316f, 2.31359f, 13.8994f, 3.89572f, 16.6428f, 7.74552f)
        curveTo(16.9785f, 8.21643f, 17.3319f, 8.54976f, 17.9113f, 8.69637f)
        curveTo(18.6361f, 8.87638f, 19.2359f, 9.36245f, 19.4537f, 10.0961f)
        curveTo(19.6856f, 10.8944f, 20.1138f, 11.7364f, 19.9778f, 12.5901f)
        curveTo(19.9257f, 12.9169f, 19.7657f, 13.218f, 19.4457f, 13.82f)
        lineTo(15.0988f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.00183f, 12f)
        curveTo(5.00183f, 13.7264f, 8.16622f, 14.5959f, 12.0018f, 13.7264f)
        curveTo(11.4156f, 14.0677f, 10.4146f, 14.6835f, 9.31712f, 15.9511f)
        curveTo(8.75814f, 16.5968f, 8.51959f, 17.4954f, 8.48067f, 18.4026f)
        curveTo(8.42865f, 19.615f, 8.24879f, 20.9338f, 7.62683f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.00183f, 7f)
        curveTo(5.00183f, 7f, 6.9608f, 7.28919f, 8.50183f, 8.5f)
        curveTo(9.50183f, 9.28571f, 11.4185f, 9.80952f, 12.0018f, 10f)
        }
        }.build()

        return _bodyPartLeg!!
    }

private var _bodyPartLeg: ImageVector? = null
