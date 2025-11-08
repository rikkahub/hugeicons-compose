package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeBottom: ImageVector
    get() {
        if (_strokeBottom != null) {
            return _strokeBottom!!
        }
        _strokeBottom = ImageVector.Builder(
            name = "StrokeBottom",
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
        moveTo(5f, 17f)
        verticalLineTo(9f)
        curveTo(5f, 6.17157f, 5f, 4.75736f, 5.87868f, 3.87868f)
        curveTo(6.75736f, 3f, 8.17157f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 3f, 17.2426f, 3f, 18.1213f, 3.87868f)
        curveTo(19f, 4.75736f, 19f, 6.17157f, 19f, 9f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        lineTo(21f, 21f)
        }
        }.build()

        return _strokeBottom!!
    }

private var _strokeBottom: ImageVector? = null
