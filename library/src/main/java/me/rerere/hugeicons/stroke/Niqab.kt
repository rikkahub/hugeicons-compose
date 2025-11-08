package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Niqab: ImageVector
    get() {
        if (_niqab != null) {
            return _niqab!!
        }
        _niqab = ImageVector.Builder(
            name = "Niqab",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 5f)
        curveTo(10.8431f, 5f, 9.5f, 6.33121f, 9.5f, 7.97334f)
        verticalLineTo(14.9111f)
        curveTo(9.5f, 16.0413f, 9.50455f, 17.2286f, 10.7346f, 17.7336f)
        curveTo(11.6f, 18.0888f, 13.4f, 18.0888f, 14.2654f, 17.7336f)
        curveTo(15.4954f, 17.2286f, 15.5f, 16.0413f, 15.5f, 14.9111f)
        verticalLineTo(7.97334f)
        curveTo(15.5f, 6.33121f, 14.1569f, 5f, 12.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.3022f, 7.51864f)
        curveTo(18.3022f, 4.47078f, 15.7045f, 2f, 12.5f, 2f)
        curveTo(9.29554f, 2f, 6.69782f, 4.47078f, 6.69782f, 7.51864f)
        curveTo(6.69782f, 9.61659f, 5.95992f, 13.4691f, 3.55841f, 16.4349f)
        curveTo(2.81105f, 17.3578f, 2.43737f, 17.8193f, 2.50859f, 18.244f)
        curveTo(2.5798f, 18.6687f, 2.98003f, 18.9288f, 3.78049f, 19.4489f)
        curveTo(9.01571f, 22.8504f, 15.9843f, 22.8504f, 21.2195f, 19.4489f)
        curveTo(22.02f, 18.9288f, 22.4202f, 18.6687f, 22.4914f, 18.244f)
        curveTo(22.5626f, 17.8193f, 22.189f, 17.3578f, 21.4416f, 16.4349f)
        curveTo(19.0401f, 13.4691f, 18.3022f, 9.61659f, 18.3022f, 7.51864f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 8f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 11f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _niqab!!
    }

private var _niqab: ImageVector? = null
