package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BabyBottle: ImageVector
    get() {
        if (_babyBottle != null) {
            return _babyBottle!!
        }
        _babyBottle = ImageVector.Builder(
            name = "BabyBottle",
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
        moveTo(17f, 10.4999f)
        curveTo(17f, 10.4999f, 18f, 12.9999f, 18f, 16.2499f)
        curveTo(18f, 17.4211f, 17.8701f, 18.4948f, 17.704f, 19.3893f)
        curveTo(17.4952f, 20.5136f, 17.3908f, 21.0757f, 16.835f, 21.5378f)
        curveTo(16.2792f, 21.9999f, 15.6168f, 21.9999f, 14.2919f, 21.9999f)
        horizontalLineTo(9.70813f)
        curveTo(8.38323f, 21.9999f, 7.72079f, 21.9999f, 7.16499f, 21.5378f)
        curveTo(6.60919f, 21.0757f, 6.50478f, 20.5136f, 6.29598f, 19.3893f)
        curveTo(6.12986f, 18.4948f, 6f, 17.4211f, 6f, 16.2499f)
        curveTo(6f, 12.9999f, 7f, 10.4999f, 7f, 10.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00011f, 10.5109f)
        horizontalLineTo(17.0001f)
        curveTo(17.148f, 9.69502f, 16.9213f, 8.12207f, 14.9607f, 7.49988f)
        curveTo(14.4954f, 7.35226f, 13.95f, 7.07619f, 13.7045f, 6.61167f)
        curveTo(13.4872f, 6.20036f, 13.3855f, 5.64345f, 13.7112f, 5.02533f)
        curveTo(14.3134f, 3.88252f, 13.7323f, 2.48044f, 12.4822f, 2.08711f)
        curveTo(12.326f, 2.03794f, 12.1632f, 2.00167f, 12.0001f, 2.00006f)
        curveTo(11.826f, 1.99834f, 11.6517f, 2.03461f, 11.4849f, 2.08711f)
        curveTo(10.2348f, 2.48044f, 9.65373f, 3.88252f, 10.2559f, 5.02533f)
        curveTo(10.5816f, 5.64345f, 10.4799f, 6.20036f, 10.2626f, 6.61167f)
        curveTo(10.0247f, 7.06186f, 9.50673f, 7.46163f, 9.02371f, 7.61486f)
        curveTo(7.67057f, 8.04418f, 6.73858f, 9.06774f, 7.00011f, 10.5109f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13.9999f)
        horizontalLineTo(17.5f)
        moveTo(15f, 17.9999f)
        horizontalLineTo(17.5f)
        }
        }.build()

        return _babyBottle!!
    }

private var _babyBottle: ImageVector? = null
