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
        curveTo(10.3431f, 5f, 9f, 6.33121f, 9f, 7.97334f)
        verticalLineTo(14.9111f)
        curveTo(9f, 16.0413f, 9.00455f, 17.2286f, 10.2346f, 17.7336f)
        curveTo(11.1f, 18.0888f, 12.9f, 18.0888f, 13.7654f, 17.7336f)
        curveTo(14.9954f, 17.2286f, 15f, 16.0413f, 15f, 14.9111f)
        verticalLineTo(7.97334f)
        curveTo(15f, 6.33121f, 13.6569f, 5f, 12f, 5f)
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
        moveTo(9f, 11f)
        horizontalLineTo(15f)
        }
        }.build()

        return _niqab!!
    }

private var _niqab: ImageVector? = null
