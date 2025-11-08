package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerVideoCall: ImageVector
    get() {
        if (_computerVideoCall != null) {
            return _computerVideoCall!!
        }
        _computerVideoCall = ImageVector.Builder(
            name = "ComputerVideoCall",
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
        moveTo(14f, 2f)
        horizontalLineTo(10f)
        curveTo(6.72077f, 2f, 5.08116f, 2f, 3.91891f, 2.81382f)
        curveTo(3.48891f, 3.1149f, 3.1149f, 3.48891f, 2.81382f, 3.91891f)
        curveTo(2f, 5.08116f, 2f, 6.72077f, 2f, 10f)
        curveTo(2f, 13.2792f, 2f, 14.9188f, 2.81382f, 16.0811f)
        curveTo(3.1149f, 16.5111f, 3.48891f, 16.8851f, 3.91891f, 17.1862f)
        curveTo(5.08116f, 18f, 6.72077f, 18f, 10f, 18f)
        horizontalLineTo(14f)
        curveTo(17.2792f, 18f, 18.9188f, 18f, 20.0811f, 17.1862f)
        curveTo(20.5111f, 16.8851f, 20.8851f, 16.5111f, 21.1862f, 16.0811f)
        curveTo(22f, 14.9188f, 22f, 13.2792f, 22f, 10f)
        curveTo(22f, 6.72077f, 22f, 5.08116f, 21.1862f, 3.91891f)
        curveTo(20.8851f, 3.48891f, 20.5111f, 3.1149f, 20.0811f, 2.81382f)
        curveTo(18.9188f, 2f, 17.2792f, 2f, 14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 22f)
        lineTo(14.1845f, 21.5811f)
        curveTo(13.4733f, 20.6369f, 13.2969f, 19.1944f, 13.7468f, 18f)
        moveTo(9.5f, 22f)
        lineTo(9.8155f, 21.5811f)
        curveTo(10.5267f, 20.6369f, 10.7031f, 19.1944f, 10.2532f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 14f)
        curveTo(9.83846f, 11.4046f, 14.1188f, 11.263f, 16f, 14f)
        moveTo(14f, 8f)
        curveTo(14f, 9.10457f, 13.1046f, 10f, 12f, 10f)
        curveTo(10.8954f, 10f, 10f, 9.10457f, 10f, 8f)
        curveTo(10f, 6.89543f, 10.8954f, 6f, 12f, 6f)
        curveTo(13.1046f, 6f, 14f, 6.89543f, 14f, 8f)
        }
        }.build()

        return _computerVideoCall!!
    }

private var _computerVideoCall: ImageVector? = null
