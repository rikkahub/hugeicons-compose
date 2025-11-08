package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = ImageVector.Builder(
            name = "Vk",
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
        moveTo(2.00053f, 5.5f)
        horizontalLineTo(5.50053f)
        curveTo(5.50053f, 13.5f, 10.0005f, 14.5f, 10.0005f, 14.5f)
        lineTo(10.0015f, 5.5f)
        horizontalLineTo(13.5015f)
        lineTo(13.4995f, 10.5f)
        curveTo(17.9995f, 8.5f, 18.4995f, 5.5f, 18.4995f, 5.5f)
        horizontalLineTo(21.9995f)
        curveTo(21.9995f, 5.5f, 20.9995f, 10f, 17.0926f, 12.1534f)
        curveTo(19.1115f, 13.3511f, 21.2684f, 15.3315f, 21.9995f, 18.5f)
        horizontalLineTo(18.4995f)
        curveTo(18.4995f, 18.5f, 17.4995f, 15.5f, 13.4995f, 14f)
        lineTo(13.5015f, 18.5f)
        curveTo(1.88755f, 18.5f, 2.00232f, 7.5f, 2.00053f, 5.5f)
        }
        }.build()

        return _vk!!
    }

private var _vk: ImageVector? = null
