package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Joystick03: ImageVector
    get() {
        if (_joystick03 != null) {
            return _joystick03!!
        }
        _joystick03 = ImageVector.Builder(
            name = "Joystick03",
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
        moveTo(11f, 5f)
        curveTo(11f, 6.65685f, 9.65685f, 8f, 8f, 8f)
        curveTo(6.34315f, 8f, 5f, 6.65685f, 5f, 5f)
        curveTo(5f, 3.34315f, 6.34315f, 2f, 8f, 2f)
        curveTo(9.65685f, 2f, 11f, 3.34315f, 11f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8f)
        lineTo(8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 13f)
        lineTo(14f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8787f, 22f)
        horizontalLineTo(5.12132f)
        curveTo(5.00867f, 22f, 4.95235f, 22f, 4.90475f, 21.9977f)
        curveTo(3.87506f, 21.9486f, 3.05136f, 21.1249f, 3.00227f, 20.0952f)
        curveTo(3f, 20.0477f, 3f, 19.9913f, 3f, 19.8787f)
        curveTo(3f, 19.8293f, 3f, 19.8046f, 3.00057f, 19.7808f)
        curveTo(3.01242f, 19.2834f, 3.2092f, 18.8084f, 3.5525f, 18.4483f)
        curveTo(3.56894f, 18.4311f, 3.58641f, 18.4136f, 3.62132f, 18.3787f)
        lineTo(4.24264f, 17.7574f)
        curveTo(5.10973f, 16.8903f, 5.54328f, 16.4567f, 6.09459f, 16.2284f)
        curveTo(6.6459f, 16f, 7.25903f, 16f, 8.48528f, 16f)
        horizontalLineTo(15.5147f)
        curveTo(16.741f, 16f, 17.3541f, 16f, 17.9054f, 16.2284f)
        curveTo(18.4567f, 16.4567f, 18.8903f, 16.8903f, 19.7574f, 17.7574f)
        lineTo(20.3787f, 18.3787f)
        curveTo(20.4136f, 18.4136f, 20.4311f, 18.4311f, 20.4475f, 18.4483f)
        curveTo(20.7908f, 18.8084f, 20.9876f, 19.2834f, 20.9994f, 19.7808f)
        curveTo(21f, 19.8046f, 21f, 19.8293f, 21f, 19.8787f)
        curveTo(21f, 19.9913f, 21f, 20.0477f, 20.9977f, 20.0952f)
        curveTo(20.9486f, 21.1249f, 20.1249f, 21.9486f, 19.0952f, 21.9977f)
        curveTo(19.0477f, 22f, 18.9913f, 22f, 18.8787f, 22f)
        }
        }.build()

        return _joystick03!!
    }

private var _joystick03: ImageVector? = null
