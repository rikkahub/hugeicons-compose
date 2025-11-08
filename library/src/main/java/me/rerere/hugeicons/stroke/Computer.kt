package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = ImageVector.Builder(
            name = "Computer",
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
        moveTo(14f, 21f)
        horizontalLineTo(16f)
        moveTo(14f, 21f)
        curveTo(13.1716f, 21f, 12.5f, 20.3284f, 12.5f, 19.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
        moveTo(14f, 21f)
        horizontalLineTo(10f)
        moveTo(10f, 21f)
        horizontalLineTo(8f)
        moveTo(10f, 21f)
        curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
        moveTo(12f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(11f)
        curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
        curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 17f, 20.2426f, 17f, 21.1213f, 16.1213f)
        curveTo(22f, 15.2426f, 22f, 13.8284f, 22f, 11f)
        verticalLineTo(9f)
        curveTo(22f, 6.17157f, 22f, 4.75736f, 21.1213f, 3.87868f)
        curveTo(20.2426f, 3f, 18.8284f, 3f, 16f, 3f)
        }
        }.build()

        return _computer!!
    }

private var _computer: ImageVector? = null
