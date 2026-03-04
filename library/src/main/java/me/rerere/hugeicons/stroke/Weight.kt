package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = ImageVector.Builder(
            name = "Weight",
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
        moveTo(12f, 9f)
        curveTo(13.6569f, 9f, 15f, 7.65685f, 15f, 6f)
        curveTo(15f, 4.34315f, 13.6569f, 3f, 12f, 3f)
        curveTo(10.3431f, 3f, 9f, 4.34315f, 9f, 6f)
        curveTo(9f, 7.65685f, 10.3431f, 9f, 12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0708f, 9f)
        horizontalLineTo(8.92925f)
        curveTo(7.55843f, 9f, 6.87302f, 9f, 6.35701f, 9.37752f)
        curveTo(5.841f, 9.75503f, 5.62426f, 10.4151f, 5.19077f, 11.7351f)
        lineTo(3.8772f, 15.7351f)
        curveTo(3.08824f, 18.1376f, 2.69376f, 19.3388f, 3.28353f, 20.1694f)
        curveTo(3.87331f, 21f, 5.12076f, 21f, 7.61568f, 21f)
        horizontalLineTo(16.3843f)
        curveTo(18.8792f, 21f, 20.1267f, 21f, 20.7165f, 20.1694f)
        curveTo(21.3062f, 19.3388f, 20.9118f, 18.1376f, 20.1228f, 15.7351f)
        lineTo(18.8092f, 11.7351f)
        curveTo(18.3757f, 10.4151f, 18.159f, 9.75503f, 17.643f, 9.37752f)
        curveTo(17.127f, 9f, 16.4416f, 9f, 15.0708f, 9f)
        }
        }.build()

        return _weight!!
    }

private var _weight: ImageVector? = null
