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
        moveTo(7.00474f, 2.07612f)
        verticalLineTo(16f)
        curveTo(7.00474f, 18.8284f, 7.00474f, 20.2426f, 7.8848f, 21.1213f)
        curveTo(8.76487f, 22f, 10.1813f, 22f, 13.0142f, 22f)
        curveTo(15.8471f, 22f, 17.2635f, 22f, 18.1436f, 21.1213f)
        curveTo(19.0237f, 20.2426f, 19.0237f, 18.8284f, 19.0237f, 16f)
        verticalLineTo(7.25f)
        curveTo(19.0237f, 6.29528f, 19.206f, 5.75727f, 19.7749f, 5f)
        curveTo(20.2183f, 4.40963f, 21.4177f, 3.25743f, 20.8507f, 2.43367f)
        curveTo(20.5523f, 2f, 19.7923f, 2f, 18.2725f, 2f)
        horizontalLineTo(10.0095f)
        curveTo(7.17658f, 2f, 5.76013f, 2f, 4.88007f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 8f)
        horizontalLineTo(16f)
        moveTo(19f, 11.3333f)
        horizontalLineTo(16f)
        moveTo(19f, 14.6667f)
        horizontalLineTo(16f)
        moveTo(18.5f, 18f)
        horizontalLineTo(16f)
        }
        }.build()

        return _jar!!
    }

private var _jar: ImageVector? = null
