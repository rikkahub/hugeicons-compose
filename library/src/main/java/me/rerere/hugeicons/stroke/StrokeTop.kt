package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeTop: ImageVector
    get() {
        if (_strokeTop != null) {
            return _strokeTop!!
        }
        _strokeTop = ImageVector.Builder(
            name = "StrokeTop",
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
        moveTo(19f, 7f)
        verticalLineTo(15f)
        curveTo(19f, 17.8284f, 19f, 19.2426f, 18.1213f, 20.1213f)
        curveTo(17.2426f, 21f, 15.8284f, 21f, 13f, 21f)
        lineTo(11f, 21f)
        curveTo(8.17157f, 21f, 6.75736f, 21f, 5.87868f, 20.1213f)
        curveTo(5f, 19.2426f, 5f, 17.8284f, 5f, 15f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 2.99805f)
        lineTo(3f, 2.99805f)
        }
        }.build()

        return _strokeTop!!
    }

private var _strokeTop: ImageVector? = null
