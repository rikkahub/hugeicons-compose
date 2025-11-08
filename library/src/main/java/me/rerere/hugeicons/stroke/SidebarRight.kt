package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SidebarRight: ImageVector
    get() {
        if (_sidebarRight != null) {
            return _sidebarRight!!
        }
        _sidebarRight = ImageVector.Builder(
            name = "SidebarRight",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.3109f, 2f, 6.46633f, 2.81382f, 5.1588f)
        curveTo(3.1149f, 4.67505f, 3.48891f, 4.2543f, 3.91891f, 3.91557f)
        curveTo(5.08116f, 3.00003f, 6.72077f, 3.00003f, 10f, 3.00003f)
        horizontalLineTo(14f)
        curveTo(17.2792f, 3.00003f, 18.9188f, 3.00003f, 20.0811f, 3.91557f)
        curveTo(20.5111f, 4.2543f, 20.8851f, 4.67505f, 21.1862f, 5.1588f)
        curveTo(22f, 6.46633f, 22f, 8.3109f, 22f, 12f)
        curveTo(22f, 15.6892f, 22f, 17.5337f, 21.1862f, 18.8413f)
        curveTo(20.8851f, 19.325f, 20.5111f, 19.7458f, 20.0811f, 20.0845f)
        curveTo(18.9188f, 21f, 17.2792f, 21f, 14f, 21f)
        horizontalLineTo(10f)
        curveTo(6.72077f, 21f, 5.08116f, 21f, 3.91891f, 20.0845f)
        curveTo(3.48891f, 19.7458f, 3.1149f, 19.325f, 2.81382f, 18.8413f)
        curveTo(2f, 17.5337f, 2f, 15.6892f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 3.00003f)
        lineTo(14.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 7.00006f)
        horizontalLineTo(19f)
        moveTo(18f, 10.0001f)
        horizontalLineTo(19f)
        }
        }.build()

        return _sidebarRight!!
    }

private var _sidebarRight: ImageVector? = null
