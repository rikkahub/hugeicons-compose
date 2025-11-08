package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Recycle03: ImageVector
    get() {
        if (_recycle03 != null) {
            return _recycle03!!
        }
        _recycle03 = ImageVector.Builder(
            name = "Recycle03",
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
        moveTo(9f, 3.72302f)
        curveTo(4.99202f, 4.63247f, 2f, 8.21683f, 2f, 12.5f)
        curveTo(2f, 13.0111f, 2.0426f, 13.5122f, 2.12444f, 14f)
        moveTo(9f, 3.72302f)
        lineTo(6f, 2.5f)
        moveTo(9f, 3.72302f)
        lineTo(8f, 6.5f)
        moveTo(19.0645f, 16.5f)
        curveTo(19.6633f, 15.295f, 20f, 13.9368f, 20f, 12.5f)
        curveTo(20f, 8.04051f, 16.7566f, 4.33855f, 12.5f, 3.62444f)
        moveTo(19.0645f, 16.5f)
        lineTo(22f, 14.5f)
        moveTo(19.0645f, 16.5f)
        lineTo(17.5f, 13.5f)
        moveTo(3.51555f, 17.5f)
        curveTo(5.13007f, 19.912f, 7.87958f, 21.5f, 11f, 21.5f)
        curveTo(13.3051f, 21.5f, 15.4077f, 20.6334f, 17f, 19.2083f)
        moveTo(3.51555f, 17.5f)
        horizontalLineTo(7f)
        moveTo(3.51555f, 17.5f)
        verticalLineTo(21f)
        }
        }.build()

        return _recycle03!!
    }

private var _recycle03: ImageVector? = null
