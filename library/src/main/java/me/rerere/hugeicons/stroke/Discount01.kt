package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Discount01: ImageVector
    get() {
        if (_discount01 != null) {
            return _discount01!!
        }
        _discount01 = ImageVector.Builder(
            name = "Discount01",
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
        moveTo(9.14426f, 2.5f)
        curveTo(6.48724f, 2.56075f, 4.93529f, 2.81456f, 3.87493f, 3.87493f)
        curveTo(2.81456f, 4.93529f, 2.56075f, 6.48724f, 2.5f, 9.14426f)
        moveTo(14.8557f, 2.5f)
        curveTo(17.5128f, 2.56075f, 19.0647f, 2.81456f, 20.1251f, 3.87493f)
        curveTo(21.1854f, 4.93529f, 21.4392f, 6.48724f, 21.5f, 9.14426f)
        moveTo(14.8557f, 21.5f)
        curveTo(17.5128f, 21.4392f, 19.0647f, 21.1854f, 20.1251f, 20.1251f)
        curveTo(21.1854f, 19.0647f, 21.4392f, 17.5128f, 21.5f, 14.8557f)
        moveTo(9.14426f, 21.5f)
        curveTo(6.48724f, 21.4392f, 4.93529f, 21.1854f, 3.87493f, 20.1251f)
        curveTo(2.81456f, 19.0647f, 2.56075f, 17.5128f, 2.5f, 14.8557f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99981f, 8f)
        horizontalLineTo(8.00879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9998f, 16f)
        horizontalLineTo(16.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        lineTo(16f, 8f)
        }
        }.build()

        return _discount01!!
    }

private var _discount01: ImageVector? = null
