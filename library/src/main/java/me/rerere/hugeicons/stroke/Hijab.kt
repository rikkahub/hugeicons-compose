package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hijab: ImageVector
    get() {
        if (_hijab != null) {
            return _hijab!!
        }
        _hijab = ImageVector.Builder(
            name = "Hijab",
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
        curveTo(10.8431f, 5f, 9.5f, 6.34315f, 9.5f, 8f)
        verticalLineTo(10f)
        curveTo(9.5f, 11.6569f, 10.8431f, 13f, 12.5f, 13f)
        curveTo(14.1569f, 13f, 15.5f, 11.6569f, 15.5f, 10f)
        verticalLineTo(8f)
        curveTo(15.5f, 6.34315f, 14.1569f, 5f, 12.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10f)
        curveTo(15.5f, 12.5f, 15.18f, 14.4f, 11.7667f, 16f)
        curveTo(8.35333f, 17.6f, 7.5f, 19.8333f, 7.5f, 21f)
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
        }.build()

        return _hijab!!
    }

private var _hijab: ImageVector? = null
