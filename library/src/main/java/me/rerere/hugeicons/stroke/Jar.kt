package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Jar: ImageVector
    get() {
        if (_jar != null) {
            return _jar!!
        }
        _jar = ImageVector.Builder(
            name = "Jar",
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
        moveTo(7.50474f, 2.07612f)
        verticalLineTo(16f)
        curveTo(7.50474f, 18.8284f, 7.50474f, 20.2426f, 8.3848f, 21.1213f)
        curveTo(9.26487f, 22f, 10.6813f, 22f, 13.5142f, 22f)
        curveTo(16.3471f, 22f, 17.7635f, 22f, 18.6436f, 21.1213f)
        curveTo(19.5237f, 20.2426f, 19.5237f, 18.8284f, 19.5237f, 16f)
        verticalLineTo(7.25f)
        curveTo(19.5237f, 6.29528f, 19.706f, 5.75727f, 20.2749f, 5f)
        curveTo(20.7183f, 4.40963f, 21.9177f, 3.25743f, 21.3507f, 2.43367f)
        curveTo(21.0523f, 2f, 20.2923f, 2f, 18.7725f, 2f)
        horizontalLineTo(10.5095f)
        curveTo(7.67658f, 2f, 6.26013f, 2f, 5.38007f, 2.87868f)
        curveTo(4.5f, 3.75736f, 4.5f, 5.17157f, 4.5f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 8f)
        horizontalLineTo(16.5f)
        moveTo(19.5f, 11.3333f)
        horizontalLineTo(16.5f)
        moveTo(19.5f, 14.6667f)
        horizontalLineTo(16.5f)
        moveTo(19f, 18f)
        horizontalLineTo(16.5f)
        }
        }.build()

        return _jar!!
    }

private var _jar: ImageVector? = null
