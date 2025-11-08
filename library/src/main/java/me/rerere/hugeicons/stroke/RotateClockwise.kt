package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateClockwise: ImageVector
    get() {
        if (_rotateClockwise != null) {
            return _rotateClockwise!!
        }
        _rotateClockwise = ImageVector.Builder(
            name = "RotateClockwise",
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
        moveTo(4f, 2f)
        verticalLineTo(5.13219f)
        curveTo(4f, 5.42605f, 4.36724f, 5.55908f, 4.55527f, 5.33333f)
        curveTo(6.3854f, 3.2875f, 9.04499f, 2f, 12.0051f, 2f)
        curveTo(17.5251f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 15.9582f, 19.7015f, 19.3793f, 16.367f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7347f, 22.0001f)
        curveTo(12.2016f, 22.0001f, 12.6611f, 21.9688f, 13.1111f, 21.9084f)
        moveTo(2.26537f, 8.66675f)
        curveTo(2.15297f, 9.06394f, 2.06477f, 9.46536f, 2f, 9.86901f)
        moveTo(2.03457f, 13.5381f)
        curveTo(2.10487f, 13.9381f, 2.19644f, 14.3343f, 2.30852f, 14.7245f)
        moveTo(3.83292f, 17.9963f)
        curveTo(4.07124f, 18.3497f, 4.3296f, 18.69f, 4.6071f, 19.0147f)
        moveTo(7.42857f, 21.3607f)
        curveTo(7.78228f, 21.5632f, 8.15042f, 21.7464f, 8.53228f, 21.9084f)
        }
        }.build()

        return _rotateClockwise!!
    }

private var _rotateClockwise: ImageVector? = null
