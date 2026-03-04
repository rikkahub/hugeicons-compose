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
        moveTo(12f, 5f)
        curveTo(10.3431f, 5f, 9f, 6.34315f, 9f, 8f)
        verticalLineTo(10f)
        curveTo(9f, 11.6569f, 10.3431f, 13f, 12f, 13f)
        curveTo(13.6569f, 13f, 15f, 11.6569f, 15f, 10f)
        verticalLineTo(8f)
        curveTo(15f, 6.34315f, 13.6569f, 5f, 12f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        curveTo(15f, 12.5f, 14.68f, 14.4f, 11.2667f, 16f)
        curveTo(7.85333f, 17.6f, 7f, 19.8333f, 7f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.8022f, 7.51864f)
        curveTo(17.8022f, 4.47078f, 15.2045f, 2f, 12f, 2f)
        curveTo(8.79554f, 2f, 6.19782f, 4.47078f, 6.19782f, 7.51864f)
        curveTo(6.19782f, 9.61659f, 5.45992f, 13.4691f, 3.05841f, 16.4349f)
        curveTo(2.31105f, 17.3578f, 1.93737f, 17.8193f, 2.00859f, 18.244f)
        curveTo(2.0798f, 18.6687f, 2.48003f, 18.9288f, 3.28049f, 19.4489f)
        curveTo(8.51571f, 22.8504f, 15.4843f, 22.8504f, 20.7195f, 19.4489f)
        curveTo(21.52f, 18.9288f, 21.9202f, 18.6687f, 21.9914f, 18.244f)
        curveTo(22.0626f, 17.8193f, 21.689f, 17.3578f, 20.9416f, 16.4349f)
        curveTo(18.5401f, 13.4691f, 17.8022f, 9.61659f, 17.8022f, 7.51864f)
        }
        }.build()

        return _hijab!!
    }

private var _hijab: ImageVector? = null
