package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SidebarBottom: ImageVector
    get() {
        if (_sidebarBottom != null) {
            return _sidebarBottom!!
        }
        _sidebarBottom = ImageVector.Builder(
            name = "SidebarBottom",
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
        curveTo(2f, 8.31087f, 2f, 6.4663f, 2.81382f, 5.15877f)
        curveTo(3.1149f, 4.67502f, 3.48891f, 4.25427f, 3.91891f, 3.91555f)
        curveTo(5.08116f, 3f, 6.72077f, 3f, 10f, 3f)
        horizontalLineTo(14f)
        curveTo(17.2792f, 3f, 18.9188f, 3f, 20.0811f, 3.91555f)
        curveTo(20.5111f, 4.25427f, 20.8851f, 4.67502f, 21.1862f, 5.15877f)
        curveTo(22f, 6.4663f, 22f, 8.31087f, 22f, 12f)
        curveTo(22f, 15.6891f, 22f, 17.5337f, 21.1862f, 18.8412f)
        curveTo(20.8851f, 19.325f, 20.5111f, 19.7457f, 20.0811f, 20.0845f)
        curveTo(18.9188f, 21f, 17.2792f, 21f, 14f, 21f)
        horizontalLineTo(10f)
        curveTo(6.72077f, 21f, 5.08116f, 21f, 3.91891f, 20.0845f)
        curveTo(3.48891f, 19.7457f, 3.1149f, 19.325f, 2.81382f, 18.8412f)
        curveTo(2f, 17.5337f, 2f, 15.6891f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14.5f)
        lineTo(22f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 18f)
        horizontalLineTo(7f)
        moveTo(10f, 18f)
        horizontalLineTo(11f)
        }
        }.build()

        return _sidebarBottom!!
    }

private var _sidebarBottom: ImageVector? = null
