package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeRight: ImageVector
    get() {
        if (_strokeRight != null) {
            return _strokeRight!!
        }
        _strokeRight = ImageVector.Builder(
            name = "StrokeRight",
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
        moveTo(17f, 19f)
        lineTo(9f, 19f)
        curveTo(6.17157f, 19f, 4.75736f, 19f, 3.87868f, 18.1213f)
        curveTo(3f, 17.2426f, 3f, 15.8284f, 3f, 13f)
        verticalLineTo(11f)
        curveTo(3f, 8.17157f, 3f, 6.75736f, 3.87868f, 5.87868f)
        curveTo(4.75736f, 5f, 6.17157f, 5f, 9f, 5f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.998f, 21f)
        lineTo(20.998f, 3f)
        }
        }.build()

        return _strokeRight!!
    }

private var _strokeRight: ImageVector? = null
