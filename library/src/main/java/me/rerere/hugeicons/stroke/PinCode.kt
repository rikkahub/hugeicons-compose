package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PinCode: ImageVector
    get() {
        if (_pinCode != null) {
            return _pinCode!!
        }
        _pinCode = ImageVector.Builder(
            name = "PinCode",
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
        moveTo(4.07407f, 7.92857f)
        curveTo(5.23724f, 6.24613f, 5.81883f, 5.40491f, 6.65298f, 4.95245f)
        curveTo(7.48714f, 4.5f, 8.45645f, 4.5f, 10.3951f, 4.5f)
        horizontalLineTo(15.0864f)
        curveTo(17.8607f, 4.5f, 19.2478f, 4.5f, 20.2442f, 5.22227f)
        curveTo(20.6756f, 5.53495f, 21.046f, 5.93674f, 21.3342f, 6.4047f)
        curveTo(22f, 7.48566f, 22f, 8.99044f, 22f, 12f)
        curveTo(22f, 15.0096f, 22f, 16.5143f, 21.3342f, 17.5953f)
        curveTo(21.046f, 18.0633f, 20.6756f, 18.465f, 20.2442f, 18.7777f)
        curveTo(19.2478f, 19.5f, 17.8607f, 19.5f, 15.0864f, 19.5f)
        horizontalLineTo(10.3951f)
        curveTo(8.45645f, 19.5f, 7.48714f, 19.5f, 6.65298f, 19.0475f)
        curveTo(5.81883f, 18.5951f, 5.23724f, 17.7539f, 4.07407f, 16.0714f)
        lineTo(3.92593f, 15.8571f)
        curveTo(2.64198f, 14f, 2f, 13.0714f, 2f, 12f)
        curveTo(2f, 10.9286f, 2.64198f, 10f, 3.92593f, 8.14286f)
        lineTo(4.07407f, 7.92857f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99981f, 12f)
        horizontalLineTo(9.00879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9998f, 12f)
        horizontalLineTo(13.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9998f, 12f)
        horizontalLineTo(17.0088f)
        }
        }.build()

        return _pinCode!!
    }

private var _pinCode: ImageVector? = null
