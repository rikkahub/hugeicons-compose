package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drink: ImageVector
    get() {
        if (_drink != null) {
            return _drink!!
        }
        _drink = ImageVector.Builder(
            name = "Drink",
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
        moveTo(8.20538f, 15.3582f)
        lineTo(4.51713f, 11.0812f)
        curveTo(2.62475f, 8.88671f, 1.67856f, 7.78948f, 2.09833f, 6.89474f)
        curveTo(2.5181f, 6f, 3.97907f, 6f, 6.90099f, 6f)
        horizontalLineTo(11.099f)
        curveTo(14.0209f, 6f, 15.4819f, 6f, 15.9017f, 6.89474f)
        curveTo(16.3214f, 7.78948f, 15.3753f, 8.88671f, 13.4829f, 11.0812f)
        lineTo(9.79462f, 15.3582f)
        curveTo(9.42563f, 15.7861f, 9.24114f, 16f, 9f, 16f)
        curveTo(8.75886f, 16f, 8.57437f, 15.7861f, 8.20538f, 15.3582f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 6f)
        lineTo(8.09898f, 3.59389f)
        curveTo(8.03809f, 3.22852f, 7.78022f, 2.92674f, 7.42882f, 2.80961f)
        lineTo(5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16f)
        verticalLineTo(22f)
        moveTo(7.5f, 22f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8601f, 8.83333f)
        curveTo(16.5043f, 9.54937f, 17.4403f, 10f, 18.4822f, 10f)
        curveTo(20.425f, 10f, 22f, 8.433f, 22f, 6.5f)
        curveTo(22f, 4.567f, 20.425f, 3f, 18.4822f, 3f)
        curveTo(16.71f, 3f, 15.2438f, 4.30385f, 15f, 6f)
        }
        }.build()

        return _drink!!
    }

private var _drink: ImageVector? = null
