package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SidebarTop: ImageVector
    get() {
        if (_sidebarTop != null) {
            return _sidebarTop!!
        }
        _sidebarTop = ImageVector.Builder(
            name = "SidebarTop",
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
        curveTo(2f, 8.31088f, 2f, 6.46632f, 2.81382f, 5.15878f)
        curveTo(3.1149f, 4.67504f, 3.48891f, 4.25428f, 3.91891f, 3.91556f)
        curveTo(5.08116f, 3.00002f, 6.72077f, 3.00002f, 10f, 3.00002f)
        horizontalLineTo(14f)
        curveTo(17.2792f, 3.00002f, 18.9188f, 3.00002f, 20.0811f, 3.91556f)
        curveTo(20.5111f, 4.25428f, 20.8851f, 4.67504f, 21.1862f, 5.15878f)
        curveTo(22f, 6.46632f, 22f, 8.31088f, 22f, 12f)
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
        moveTo(2f, 9.50002f)
        lineTo(22f, 9.50002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6.00002f)
        horizontalLineTo(7f)
        moveTo(10f, 6.00002f)
        horizontalLineTo(11f)
        }
        }.build()

        return _sidebarTop!!
    }

private var _sidebarTop: ImageVector? = null
