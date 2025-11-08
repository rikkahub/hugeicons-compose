package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rotate02: ImageVector
    get() {
        if (_rotate02 != null) {
            return _rotate02!!
        }
        _rotate02 = ImageVector.Builder(
            name = "Rotate02",
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
        moveTo(20f, 2f)
        verticalLineTo(5.13219f)
        curveTo(20f, 5.42605f, 19.6328f, 5.55908f, 19.4447f, 5.33333f)
        curveTo(17.6146f, 3.2875f, 14.955f, 2f, 11.9949f, 2f)
        curveTo(6.47485f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 15.9582f, 4.29852f, 19.3793f, 7.63298f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.2653f, 22.0001f)
        curveTo(11.7984f, 22.0001f, 11.3389f, 21.9688f, 10.8889f, 21.9084f)
        moveTo(21.7346f, 8.66675f)
        curveTo(21.847f, 9.06394f, 21.9352f, 9.46536f, 22f, 9.86901f)
        moveTo(21.9654f, 13.5381f)
        curveTo(21.8951f, 13.9381f, 21.8036f, 14.3343f, 21.6915f, 14.7245f)
        moveTo(20.1671f, 17.9963f)
        curveTo(19.9288f, 18.3497f, 19.6704f, 18.69f, 19.3929f, 19.0147f)
        moveTo(16.5714f, 21.3607f)
        curveTo(16.2177f, 21.5632f, 15.8496f, 21.7464f, 15.4677f, 21.9084f)
        }
        }.build()

        return _rotate02!!
    }

private var _rotate02: ImageVector? = null
