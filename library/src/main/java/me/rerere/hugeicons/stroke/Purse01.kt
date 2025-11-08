package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Purse01: ImageVector
    get() {
        if (_purse01 != null) {
            return _purse01!!
        }
        _purse01 = ImageVector.Builder(
            name = "Purse01",
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
        moveTo(15.9869f, 3.875f)
        curveTo(16.0545f, 3.125f, 15.8921f, 2f, 14.7565f, 2f)
        curveTo(13.3371f, 2f, 9.82353f, 7f, 7f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.01476f, 3.875f)
        curveTo(7.93872f, 3.125f, 8.12143f, 2f, 9.3989f, 2f)
        curveTo(10.9957f, 2f, 14.8235f, 7f, 18f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.863f, 15.0024f)
        curveTo(21.4147f, 12.9368f, 19.4727f, 10.4981f, 20.1725f, 8.38201f)
        curveTo(20.3978f, 7.70069f, 19.8861f, 7f, 19.1631f, 7f)
        horizontalLineTo(4.82864f)
        curveTo(4.10627f, 7f, 3.59628f, 7.70208f, 3.82496f, 8.38173f)
        curveTo(4.53702f, 10.4979f, 2.58784f, 12.9411f, 2.13769f, 15.0065f)
        curveTo(1.51926f, 17.8441f, 3.02182f, 20.7941f, 5.88585f, 21.3928f)
        curveTo(9.75734f, 22.2021f, 14.2396f, 22.2024f, 18.1116f, 21.3937f)
        curveTo(20.9776f, 20.7951f, 22.4795f, 17.8424f, 21.863f, 15.0024f)
        }
        }.build()

        return _purse01!!
    }

private var _purse01: ImageVector? = null
